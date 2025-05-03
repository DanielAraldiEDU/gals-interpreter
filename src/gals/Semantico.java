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
      case 1:
        String value = Integer.toBinaryString(this.variables.get(this.currentVariable)) + "\n";
        System.out.println(this.currentVariable + " = " + value);
        break;
      case 2:
        this.currentVariable = token.getLexeme();
        break;
      case 3:
        if (!this.stackOperands.isEmpty()) {
          throw new SemanticError("Incomplete expression: Check if parentheses weren't closed.", token.getPosition());
        }

        this.variables.put(this.currentVariable, this.listOperands.get(0));
        this.listOperands.clear();
        this.listOperators.clear();
        break;
      case 4:
        System.out.println("Ação 4: " + token.getLexeme());
        break;
      case 5:
        System.out.println("Ação 5: " + token.getLexeme());
        break;
      case 6:
        System.out.println("Ação 6: " + token.getLexeme());
        break;
      case 7:
        this.stackOperands.push(this.listOperands);
        this.stackOperators.push(this.listOperators);
        this.listOperands = new ArrayList<Integer>();
        this.listOperators = new ArrayList<String>();
        break;
      case 8:
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
}
