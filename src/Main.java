import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import gals.Lexico;
import gals.Semantico;
import gals.Sintatico;

public class Main {
  public static void main(String[] args) {
    try {
      final String path = "./src/inputs/code.txt";
      StringBuilder content = new StringBuilder();

      try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
        String line;
        while ((line = reader.readLine()) != null) {
          content.append(line).append(System.lineSeparator());
        }
      } catch (IOException error) {
        System.out.println("Error: " + error.getMessage());
      }

      Lexico lexico = new Lexico(content.toString());
      Semantico semantico = new Semantico();
      Sintatico sintatico = new Sintatico();

      sintatico.parse(lexico, semantico);
    } catch (Exception error) {
      System.out.println("Error: " + error.getMessage());
    }
  }
}
