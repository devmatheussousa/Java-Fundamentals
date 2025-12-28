package dev.matheus.$10_Orientacao_a_Objetos.$6_Variaveis_e_metodos_estaticos.exer;

public class Contador {
    private static int contador;

    public static void incrementar(){
        contador++;
    }

    public static void zerar(){
        contador = 0;
    }

    public static int getContador(){
        return contador;
    }
}
