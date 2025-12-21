package dev.matheus.$09_Operadores_Java;

public class $01_Operadores_Aritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        // Adição
        int adicao = a + b;
        System.out.println("Adição: " + adicao);

        // Subtração
        int subtracao = a - b;
        System.out.println("Subtração: " + subtracao);


        // Multiplicação
        int multiplicacao = a * b;
        System.out.println("Multiplicação: " + multiplicacao);

        // Divisão
        double m = 20;
        double z = 2;
        if(z == 0){
            throw  new ArithmeticException("Divisão por zero");
        }else{
            double divisao = m / z;
            System.out.println("Divisão: " + divisao);
        }


        //-- Operadores de Incremento e Decremento
        int x = 10;
        System.out.println("Incremento: " + (++x));
        System.out.println("Decremento: " + (--x));

        //pos fixo
        System.out.println("Incremento: " + (x++));
        System.out.println("Decremento: " + (x--));

        //pre fixo
        System.out.println("Incremento: " + (++x));
        System.out.println("Decremento: " + (--x));
    }
}
