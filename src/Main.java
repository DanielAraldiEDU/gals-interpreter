import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

import gals.Lexico;
import gals.Semantico;
import gals.Sintatico;

public class Main {
  public static void main(String[] args) {
    try {
      Reader fileRender = new FileReader("./src/inputs/commands.txt");

      Lexico lexico = new Lexico(fileRender);
      Semantico semantico = new Semantico();
      Sintatico sintatico = new Sintatico();

      sintatico.parse(lexico, semantico);

    } catch (FileNotFoundException error) {
      System.out.println("File not found: " + error.getMessage());
    } catch (Exception error) {
      System.out.println("Error: " + error.getMessage());
    }
  }
}
