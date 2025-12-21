package dev.matheus.$05_Tipos_de_Dados;

import java.util.Arrays;

/**
 * Tipos de dados Primitivos e Compostos
 * Primitivos: byte, short, int, long, float, double, boolean, char
 * Compostos: Arrays, Strings
 *
 * var e final:
 * var: Declaração de variáveis com inferência de tipo.
 * final: Declaração de variáveis que não podem ser alteradas após a inicialização.
 */
public class DataTypes {
    public static void main(String[] args) {
        System.out.println("-- Tipos de dados Primitivos e Compostos --");
        System.out.println("Tipos de dados Primitivos:");
        System.out.println("byte: " + Byte.BYTES);
        System.out.println("short: " + Short.BYTES);
        System.out.println("int: " + Integer.BYTES);
        System.out.println("long: " + Long.BYTES);
        System.out.println("float: " + Float.BYTES);
        System.out.println("double: " + Double.BYTES);
        System.out.println("boolean: " + Boolean.TRUE);
        System.out.println("char: " + Character.BYTES);

        //Tipos Númericos
        System.out.println("Tipos Númericos:");
        System.out.println("byte: " + Byte.MIN_VALUE + " a " + Byte.MAX_VALUE);
        System.out.println("short: " + Short.MIN_VALUE + " a " + Short.MAX_VALUE);
        System.out.println("int: " + Integer.MIN_VALUE + " a " + Integer.MAX_VALUE);
        System.out.println("long: " + Long.MIN_VALUE + " a " + Long.MAX_VALUE);

        //Tipos com ponto flutuante
        System.out.println("float: " + Float.MIN_VALUE + " a " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " a " + Double.MAX_VALUE);

        //Tipo caractere
        System.out.println("char: " + Character.MIN_VALUE + " a " + Character.MAX_VALUE);

        //Tipos String  e Array
        System.out.println("String: " + "Olá Mundo!");
        int[] numeros = {23, 12, 51, 51, 12, 99, 123};
        System.out.println("Array: " + Arrays.toString(numeros));


    }
}
