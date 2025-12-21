package dev.matheus.$03_Sintaxe_Basica;
//2.Nome de Arquivos
//Cada arquivo Java deve conter uma classe pública com o mesmo nome do arquivo.
//Isso é conhecido como regra de correspondência de nomes.
public class MinhaClasse {
    public static void main(String[] args) {
        /**
         * A sintaxe básica do Java é a base sobre a qual todos os programas são construídos. Compreender esses elementos
         * fundamentais é crucial para escrever código Java correto e legível. A sintaxe do Java é fortemente influenciada por C++ e C,
         * mas com simplificações e melhorias.
         *
         * O nome do arquivo `.java` deve ser exatamente o mesmo do nome da classe `public` que ele contém, incluindo a capitalização.
         * Se um arquivo contém várias classes, apenas uma pode ser `public`, e o nome do arquivo deve corresponder a essa classe `public`.
         */

        //1. Case Sensitivity (Sensibilidade à Caixa)
        //O Java é uma linguagem de programação case-sensitive, o que significa que diferencia maiúsculas de minúsculas.
        //Isso significa que "minhaVariavel" e "minhavariavel" são consideradas variáveis diferentes.

        String nome = "João";
        String NOME = "João";
        System.out.printf("nome: %s%nNOME: %s%n" , nome, NOME);

        //3.Ponto e Vírgula
        //Em Java, cada declaração de variável, instrução ou bloco de código deve terminar com um ponto e vírgula (;).
        //Isso é conhecido como regra de terminação de declaração.
        int idade = 25;
        System.out.printf("idade: %d%n" , idade);


        //4. Bloco de codigo
        //Em Java, um bloco de código é um conjunto de instruções delimitado por chaves {}.
        //Isso é conhecido como regra de delimitador de bloco.
        {
            int x = 10;
            System.out.printf("x: %d%n" , x);
        }

        //5.indentificadores
        //Em Java, os identificadores são nomes usados para nomear variáveis, métodos, classes e outros elementos do programa.
        //Os identificadores devem começar com uma letra, um underscore (_) ou um caractere de dólar ($),
        // seguidos por qualquer combinação de letras, números, underscores e caracteres de dólar.
        //Além disso, os identificadores são case-sensitive, o que significa que "minhaVariavel" e "minhavariavel" são consideradas variáveis diferentes.
    }
}
