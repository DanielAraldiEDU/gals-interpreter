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
        String currentPrintVariable = token.getLexeme();
        String value = Integer.toBinaryString(this.variables.get(currentPrintVariable)) + "\n";
        System.out.println(currentPrintVariable + " = " + value);
        break;
      // current variable in use
      case 2:
        this.currentVariable = token.getLexeme();
        break;
      // comma (end line)
      case 3:
        if (!this.stackOperands.isEmpty()) {
          throw new SemanticError("Incomplete expression: Check if parentheses weren't closed.", token.getPosition());
        }

        this.applyOperatorsInOrder(this.listOperands, this.listOperators);
        this.variables.put(this.currentVariable, this.listOperands.get(0));
        this.listOperands.clear();
        this.listOperators.clear();
        break;
      // operators (+, -, *, /, **, log())
      case 4:
        this.addOperator(token.getLexeme());
        break;
      // numbers (0 and 1)
      case 5:
        this.addOperand(Integer.parseInt(token.getLexeme(), 2));
        break;
      // variables (x, y, etc...)
      case 6:
        this.addOperand(this.variables.get(token.getLexeme()));
        break;
      // open parentheses
      case 7:
        this.stackOperands.push(this.listOperands);
        this.stackOperators.push(this.listOperators);
        this.listOperands = new ArrayList<Integer>();
        this.listOperators = new ArrayList<String>();
        break;
      // close parentheses
      case 8:
        this.applyOperatorsInOrder(this.listOperands, this.listOperators);

        Integer parenthesesResult = this.listOperands.get(0);

        List<Integer> previousOperandsList = this.stackOperands.pop();
        List<String> previousOperatorsList = this.stackOperators.pop();

        previousOperandsList.add(parenthesesResult);

        this.listOperands = previousOperandsList;
        this.listOperators = previousOperatorsList;
        break;
      default:
        throw new SemanticError("Action doesn't provided");
    }
  }

  private void applyOperatorsInOrder(List<Integer> listOperands, List<String> listOperators) {
    List<String> operators = new ArrayList<String>();
    operators.add("log");
    operators.add("**");
    operators.add("*");
    operators.add("/");
    operators.add("+");
    operators.add("-");

    this.executeOperation(operators.subList(0, 1), listOperands, listOperators);
    this.executeOperation(operators.subList(1, 2), listOperands, listOperators);
    this.executeOperation(operators.subList(2, 4), listOperands, listOperators);
    this.executeOperation(operators.subList(4, 6), listOperands, listOperators);
  }

  private void executeOperation(List<String> targetOperators, List<Integer> listOperands, List<String> listOperators) {
    for (int i = 0; i < listOperators.size(); i++) {
      String operator = listOperators.get(i);

      if (targetOperators.contains(operator)) {
        Integer result = null;
        Integer firstNumber = listOperands.get(i);
        Integer secondNumber = !operator.equals("log")
            ? listOperands.get(i + 1)
            : null;

        switch (operator) {
          case "**":
            result = (int) Math.pow(firstNumber, secondNumber);
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
          case "+":
            result = firstNumber + secondNumber;
            break;
          case "-":
            result = firstNumber - secondNumber;
            break;
          case "log":
            if (firstNumber <= 0) {
              throw new ArithmeticException("Logarithm of non-positive number.");
            }

            result = (int) Math.log10(firstNumber);

            listOperands.set(i, result);
            listOperators.remove(i);
            i--;
            continue;
        }

        listOperands.set(i, result);
        listOperands.remove(i + 1);
        listOperators.remove(i);
        i--;
      }
    }
  }

  private void addOperator(String operator) {
    this.listOperators.add(operator);
  }

  private void addOperand(Integer operand) {
    this.listOperands.add(operand);
  }
}
