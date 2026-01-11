package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$6_Palavra_chave_final;

import javax.print.DocFlavor;

public class ExtendsStrings extends DocFlavor.STRING {
    public ExtendsStrings(String mimeType) {
        super(mimeType);
    }

    //Metodos mais usados da String
    //length() retorna o número de caracteres na string.
    public static void main(String[] args) {


        String texto = """
                Minha vida sempre foi feliz eu amo saber que
                Posso contar com pessoa boas, Deus o Criado,
                Sempre nos Auxilia nos momentos que nos mais precisamos.
                """;
        System.out.println("O número de caracteres na string é: " + texto.length());
        System.out.println("A string é vazia? " + texto.isEmpty());
        System.out.println("A string começa com 'Minha'? " + texto.startsWith("Minha"));
        System.out.println("A string termina com '.'? " + texto.endsWith("."));
        System.out.println("A string contém 'feliz'? " + texto.contains("feliz"));
        System.out.println(" ");
        System.out.println(texto.toUpperCase());
    }
}
