package dev.matheus.$10_Orientacao_a_Objetos.$3_Modificador_de_Acesso;

public class TesteVeiculo {
    public static void main(String[] args) {
        Carro ferrari = new Carro("Ferrari", "F8 Tributo", 2, 60, 12);
        ferrari.exibir();
        ferrari.exibirAutonomita();
        ferrari.ligarCarro(false);
    }
}
