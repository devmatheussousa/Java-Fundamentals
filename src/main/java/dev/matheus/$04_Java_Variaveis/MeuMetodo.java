package dev.matheus.$04_Java_Variaveis;

/**
 * Variáveis são contêineres para armazenar valores de dados. Em Java, antes de usar uma variável, você deve declará-la,
 * especificando seu tipo de dado e um nome. O tipo de dado determina o tipo de valores que a variável pode armazenar
 * (por exemplo, números inteiros, números de ponto flutuante, caracteres, texto, booleanos).
 *
 * declaração de variável:
 *
 * tipoDeDado nomeDaVariavel;
 *
 * Por exemplo:
 *
 * int idade;
 * double altura;
 * char inicial;
 * String nome;
 * boolean isEstudante;
 *
 * Após a declaração, você pode atribuir um valor à variável usando o operador de atribuição (=):
 *
 * nomeDaVariavel = valor;
 *
 * Por exemplo:
 *
 * idade = 25;
 * altura = 1.75;
 * inicial = 'A';
 * nome = "João";
 * isEstudante = true;
 */
public class MeuMetodo {

    public static void main(String[] args) {
        int numeroLocal = 10;
        System.out.println(numeroLocal);
    }

}
