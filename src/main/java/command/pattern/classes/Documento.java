package command.pattern.classes;

import java.util.ArrayList;
import java.util.List;

public class Documento {
  private List<String> texto = new ArrayList<String>();

  
  public void apagar(String trecho){
    texto.remove(trecho);
  }
  
  public void apagar(int nivel){
    texto.remove(nivel);
  }
  
  public void escreva(String trecho){
    texto.add(trecho);
  }
  
  public String toString(){
    // concatena as strings
    return texto.stream().reduce("", (partialString, element) -> partialString + element);
  }

  public String ler(){
    // lê concatenado
    return texto.stream().reduce("", (partialString, element) -> partialString + element);
  }
}
