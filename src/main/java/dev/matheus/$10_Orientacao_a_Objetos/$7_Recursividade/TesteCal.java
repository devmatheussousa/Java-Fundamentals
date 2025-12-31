package dev.matheus.$10_Orientacao_a_Objetos.$7_Recursividade;

public class TesteCal {
    public static void main(String[] args) {
        int fatorial = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorial);


        int fatorialRecursivo = Calculadora.fatorialRecursivo(5);
        System.out.println(fatorialRecursivo);
    }
}
