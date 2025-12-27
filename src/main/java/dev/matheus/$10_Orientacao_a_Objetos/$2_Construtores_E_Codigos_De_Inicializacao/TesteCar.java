package dev.matheus.$10_Orientacao_a_Objetos.$2_Construtores_E_Codigos_De_Inicializacao;

public class TesteCar {
    public static void main(String[] args) {
        Car van = new Car("Pickup", "Mini Van", 5);
        van.capCombustivel = 50.0;
        van.consumoCombustivel = 10.0;

        System.out.println("A marca da van é: " + van.marca);
        System.out.println("O modelo da van é: " + van.modelo);
        System.out.println("A capacidade de combustível da van é de: " + van.capCombustivel);
        System.out.println("O consumo de combustível da van é de: " + van.consumoCombustivel);
        System.out.println("O número de passageiros da van é: " + van.numPassageiros);
        van.exibirAutonomia();
    }
}
