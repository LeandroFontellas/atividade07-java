package command.pattern;

import command.pattern.classes.Gerenciador;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String originalText = "Esse é o texto original";
        String someOtherText = " Aqui mais um pouco de texto.";
        String littleMoreText = " E aqui mais um pouco.";
        

        Gerenciador gerenciador = new Gerenciador();

        gerenciador.escreva(originalText);
        gerenciador.escreva(someOtherText);
        System.out.println(gerenciador.lerDocumento());

        gerenciador.undo(1);
        System.out.println(gerenciador.lerDocumento());

        gerenciador.redo(1);
        System.out.println(gerenciador.lerDocumento());

        gerenciador.escreva(littleMoreText);
        System.out.println(gerenciador.lerDocumento());
    }
}
