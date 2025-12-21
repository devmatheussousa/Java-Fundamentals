package dev.matheus.$07_Entrada_do_usuario;

import java.util.Scanner;

/**
 * Em muitas aplicações, é necessário interagir com o usuário, recebendo dados de entrada através do console. Em Java,
 * a maneira mais comum e flexível de ler a entrada do usuário é usando a classe `Scanner`, que faz parte do pacote `java.util`.
 * <p>
 * A classe `Scanner` pode ser usada para ler diferentes tipos de dados (inteiros, decimais, strings, booleanos, etc.)
 * da entrada padrão (geralmente o teclado), de arquivos ou de outras fontes. Para usá-la, você precisa:
 */
public class LeituraDeDados {


    public static int soma(int num1, int num2) {
        return num1 + num2;
    }

    public static int multiplicar(int num1, int num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return num1 / num2;
    }

    public static int subtrair(int num1, int num2) {
        return num1 - num2;
    }

    public static int elevar(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Deseja continuar? (true/false)");
            boolean desejaContinua = scanner.nextBoolean();
            if (!desejaContinua) {
                System.out.println("Obrigado por usar a Calculadora Moderna!");
            }
            while (desejaContinua) {
                System.out.println("Calculadora Moderna");

                System.out.println("Escolha a operação desejada:");
                System.out.println("1 - Soma");
                System.out.println("2 - Multiplicação");
                System.out.println("3 - Divisão");
                System.out.println("4 - Subtração");
                System.out.println("5 - Elevação");

                System.out.print("Digite a operação desejada:");
                int escolha = scanner.nextInt();

                System.out.print("Digite o primeiro número:");
                int num1 = scanner.nextInt();

                System.out.print("Digite o segundo número:");
                int num2 = scanner.nextInt();


                System.out.println("Resultado:");
                switch (escolha) {
                    case 1:
                        System.out.println("Soma de " + num1 + " por " + num2 + " é igual a: " + soma(num1, num2));
                        System.out.println("Deseja continuar? (true/false)");
                        desejaContinua = scanner.nextBoolean();
                        break;
                    case 2:
                        System.out.println("Multiplicação de " + num1 + " por " + num2 + " é igual a: " + multiplicar(num1, num2));
                        System.out.println("Deseja continuar? (true/false)");
                        desejaContinua = scanner.nextBoolean();
                        break;
                    case 3:
                        System.out.println("Divisão de " + num1 + " por " + num2 + " é igual a: " + divide(num1, num2));
                        System.out.println("Deseja continuar? (true/false)");
                        desejaContinua = scanner.nextBoolean();
                        break;
                    case 4:
                        System.out.println("Subtração de " + num1 + " por " + num2 + " é igual a: " + subtrair(num1, num2));
                        System.out.println("Deseja continuar? (true/false)");
                        desejaContinua = scanner.nextBoolean();
                        break;
                    case 5:
                        System.out.println("Elevação de " + num1 + " elevado a " + num2 + " é igual a: " + elevar(num1, num2));
                        System.out.println("Deseja continuar? (true/false)");
                        desejaContinua = scanner.nextBoolean();
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        System.out.println("Deseja continuar? (true/false)");
                        desejaContinua = scanner.nextBoolean();
                        break;
                }
                if (!desejaContinua) {
                    System.out.println("Obrigado por usar a Calculadora Moderna!");
                }
            }
        }
    }
}
