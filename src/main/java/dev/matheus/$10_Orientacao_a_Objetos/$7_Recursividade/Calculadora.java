package dev.matheus.$10_Orientacao_a_Objetos.$7_Recursividade;

public class Calculadora {

    public static void somar(int a, int b) {
        int total = a + b;
        System.out.println("O total é: " + total);
    }

    public static void somar(int a, int b, int c) {
        int total = a + b + c;
        System.out.println("O total é: " + total);
    }

    public static void somar(int a, int b, int c, int d) {
        int total = a + b + c + d;
        System.out.println("O total é: " + total);
    }

    //não recursivo
    public static int fatorialNaoRecursivo(int n) {
        if (n == 0) {
            return 1;
        }
        int total = 1;
        for (int i = n; i > 1; i--) {
            total *= i;
        }
        return total;
    }

    //recursivo
    public static int fatorialRecursivo(int n) {
        if (n == 0) {
            return 1;
        }
        return n * fatorialRecursivo(n - 1);
    }
}
