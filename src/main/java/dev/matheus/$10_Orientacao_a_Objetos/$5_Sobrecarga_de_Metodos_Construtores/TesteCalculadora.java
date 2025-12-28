package dev.matheus.$10_Orientacao_a_Objetos.$5_Sobrecarga_de_Metodos_Construtores;

public class TesteCalculadora {
    public static void main(String[] args) {
        MinhaCalculadora calc = new MinhaCalculadora();
        int resultado = calc.soma(1, 2, 3, 4);
        System.out.println(resultado);
        System.out.println(calc.soma(new int[]{5, 5, 5, 5, 5, 5, 5}));
    }
}
