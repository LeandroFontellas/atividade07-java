package command.pattern.classes;

public class ImpComando implements Comando {
    
    private Documento doc;
    private String texto;

    public ImpComando(Documento document, String texto) {
        doc = document;
        this.texto = texto;
        doc.escreva(texto);
    }

    public void undo() {
        doc.apagar(texto);
    }

    public void redo() {
        doc.escreva(texto);
    }
}
