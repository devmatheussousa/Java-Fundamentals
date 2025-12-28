package dev.matheus.$10_Orientacao_a_Objetos.$4_Getters_e_Setters;

import dev.matheus.$10_Orientacao_a_Objetos.$3_Modificador_de_Acesso.Carro;

public class TesteMoto {
    public static void main(String[] args) {
        Moto honda150 = new Moto("Honda", "CBR150", 2, 60, 12);
        honda150.exibir();
        honda150.exibirAutonomita();
        honda150.calcularCombustivel(200);
        honda150.ligarMoto(false);
        honda150.ligarMoto(true);
    }
}
