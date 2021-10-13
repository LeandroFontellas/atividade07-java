package command.pattern.classes;

import java.util.ArrayList;
import java.util.List;

public class Gerenciador {
  
  private Documento documento = new Documento();
  private List<Comando> comandos = new ArrayList<>();

  public void escreva(String texto) {
    ImpComando comando = new ImpComando(documento, texto);
    comandos.add(comando);
  }

  public void redo(int indice) {
    comandos.get(indice).redo();
  }

  public void undo(int indice) {
    comandos.get(indice).undo();
  }

  public String lerDocumento(){
    return documento.ler();
  }
}
