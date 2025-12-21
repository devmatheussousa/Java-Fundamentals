package dev.matheus.$02_comentarios_java;

/**
 * The type Comentario java.
 */
public class Comentario_Java {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {

        /**
         * Comentários são partes do código que são ignoradas pelo compilador Java.
         * Eles são essenciais para tornar o código mais legível e compreensível, tanto para o desenvolvedor que o
         * escreveu quanto para outros programadores que possam vir a trabalhar nele. Em Java, existem três tipos principais de comentários:
         */

        //1.Comentário de linha única
        System.out.println("Hello World!");

        //2.Comentário de bloco
        /*
         * Este é um comentário de bloco.
         * Ele pode abranger várias linhas.
         */
        int age = 30;

        //3.Comentário de documentação
        /**
         * Este é um comentário de documentação.
         * Ele é usado para gerar documentação automática para o código.
         */

        /**
         * tags: Java doc
         * @param args Argumentos da linha de comando.
         * @return Nenhum.
         * @throws Exception Se ocorrer um erro.
         * @see System#out
         * @since 1.0
         * @author Matheus Sousa
         * @version 1.0
         */
    }
}
