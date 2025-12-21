package dev.matheus.$09_Operadores_Java;

public class $03_Operadores_Logicos {

    /**
     * Operadores lógicos são usados para combinar duas ou mais expressões booleanas e retornar um resultado booleano (`true` ou `false`).
     * Eles são essenciais para criar condições complexas em estruturas de controle como `if`, `while` e `for`.
     * @param args
     */
    public static void main(String[] args) {
        Integer num1 = 10;
        Integer num2 = 20;

        Boolean and = num1 > 5 && num2 < 30;
        Boolean or = num1 > 5 || num2 < 30;
        Boolean not = !(num1 > 5); //not nega uma expressão booleana, ou seja, se num1 > 5 for true, not será false

        System.out.printf("num1 > 5 && num2 < 30: %b%n", and);
        System.out.printf("num1 > 5 || num2 < 30: %b%n", or);
        System.out.printf("!(num1 > 5): %b%n", not);
    }
}
