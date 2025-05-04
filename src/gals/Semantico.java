package gals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Semantico implements Constants {
  Map<String, Integer> variables = new HashMap<String, Integer>();
  Stack<List<String>> stackOperators = new Stack<List<String>>();
  Stack<List<Integer>> stackOperands = new Stack<List<Integer>>();
  List<String> listOperators = new ArrayList<String>();
  List<Integer> listOperands = new ArrayList<Integer>();
  String currentVariable = null;

  public void executeAction(int action, Token token) throws SemanticError {
    switch (action) {
      // print command
      case 1:
        this.print(token);
        break;
      // current variable in use
      case 2:
        this.currentVariable = token.getLexeme();
        break;
      // comma (end line)
      case 3:
        this.finalizeExpressionProcessing(token);
        break;
      // operators (+, -, *, /, ^, log)
      case 4:
        this.listOperators.add(token.getLexeme());
        break;
      // numbers (0 and 1)
      case 5:
        final Integer operandNumber = Integer.parseInt(token.getLexeme(), 2);
        this.listOperands.add(operandNumber);
        break;
      // variables (x, y, etc...)
      case 6:
        final Integer operandVariable = this.variables.get(token.getLexeme());
        this.listOperands.add(operandVariable);
        break;
      // open parentheses
      case 7:
        this.initializeExpressionProcessing();
        break;
      // close parentheses
      case 8:
        this.processParenthesesResult();
        break;
      default:
        throw new SemanticError("Action doesn't provided");
    }
  }

  private void print(Token token) throws SemanticError {
    final String value = token.getLexeme();
    final Integer variable = this.variables.get(value);
    if (variable == null) {
      throw new SemanticError("\"" + value + "\" is not defined.", token.getPosition());
    }

    final String binaryValue = Integer.toBinaryString(variable);
    System.out.println(value + " = " + binaryValue);
  }

  private void finalizeExpressionProcessing(Token token) throws SemanticError {
    if (!this.stackOperands.isEmpty()) {
      throw new SemanticError("Incomplete expression.", token.getPosition());
    }

    this.applyOperatorsInOrder();

    this.variables.put(this.currentVariable, this.listOperands.get(0));

    this.listOperands.clear();
    this.listOperators.clear();
  }

  private void initializeExpressionProcessing() {
    this.stackOperands.push(this.listOperands);
    this.stackOperators.push(this.listOperators);

    this.listOperands = new ArrayList<Integer>();
    this.listOperators = new ArrayList<String>();
  }

  private void processParenthesesResult() throws SemanticError {
    this.applyOperatorsInOrder();

    final Integer parenthesesResult = this.listOperands.get(0);

    final List<Integer> previousOperandsList = this.stackOperands.pop();
    final List<String> previousOperatorsList = this.stackOperators.pop();

    previousOperandsList.add(parenthesesResult);

    this.listOperands = previousOperandsList;
    this.listOperators = previousOperatorsList;
  }

  private void applyOperatorsInOrder() throws SemanticError {
    final List<String> operators = new ArrayList<String>();

    operators.add("log");
    operators.add("^");
    operators.add("*");
    operators.add("/");
    operators.add("+");
    operators.add("-");

    final List<String> biggerPrecedence = operators.subList(0, 1);
    final List<String> intermediaryPrecedence = operators.subList(1, 2);
    final List<String> smallerPrecedence = operators.subList(2, 4);
    final List<String> tinyPrecedence = operators.subList(4, 6);

    this.executeOperation(biggerPrecedence);
    this.executeOperation(intermediaryPrecedence);
    this.executeOperation(smallerPrecedence);
    this.executeOperation(tinyPrecedence);
  }

  private void executeOperation(List<String> targetOperators) throws SemanticError {
    for (int i = 0; i < this.listOperators.size(); i++) {
      final String operator = this.listOperators.get(i);

      if (targetOperators.contains(operator)) {
        Integer result = null;
        final Integer firstNumber = this.listOperands.get(i);
        final Integer secondNumber = !operator.equals("log")
            ? this.listOperands.get(i + 1)
            : null;

        switch (operator) {
          case "+":
            result = firstNumber + secondNumber;
            break;
          case "-":
            result = firstNumber - secondNumber;
            break;
          case "*":
            result = firstNumber * secondNumber;
            break;
          case "/":
            if (secondNumber == 0) {
              throw new ArithmeticException("Division by zero.");
            }
            result = firstNumber / secondNumber;
            break;
          case "^":
            result = (int) Math.pow(firstNumber, secondNumber);
            break;
          case "log":
            if (firstNumber <= 0) {
              throw new ArithmeticException("Logarithm of non-positive number.");
            }

            result = (int) Math.log10(firstNumber);

            this.listOperands.set(i, result);
            this.listOperators.remove(i);
            i--;
            continue;
          default:
            throw new SemanticError("Operator not supported: " + operator);
        }

        this.listOperands.set(i, result);
        this.listOperands.remove(i + 1);
        this.listOperators.remove(i);
        i--;
      }
    }
  }
}
