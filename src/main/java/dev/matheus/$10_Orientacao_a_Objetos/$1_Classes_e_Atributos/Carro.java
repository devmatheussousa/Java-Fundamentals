package dev.matheus.$10_Orientacao_a_Objetos.$1_Classes_e_Atributos;

/**
 * Classe que representa um carro.
 * Obejto: e uma instancia da classe com Operador new
 * Atributos: Caracteristicas do objeto
 * Modelo: Marca e tipo do carro
 * Cor: Cor do carro
 * Ano: Ano de fabricação do carro etc.
 */
public class Carro {
    //Oque e clean code -> E forma de escrever e organizar nosso codigos de forma que seja facil de entender e de manter
    // Nome de variaveis -> Deve ser descritivo e intuitivo
    String marca;
    String modelo;
    int numPassageiros; // Quantidade de passageiros que o carro pode transportar
    double capCombustivel; // Capacidade de combustivel do carro em litros
    double consumoCombustivel; // Consumo de combustivel do carro em km/litro

    //Metodo simples sem retorno -> void
    //Ele exibir a autonomia do carro baseado na capacidade de combustivel e no consumo de combustivel
    void exibirAutonomia(){
        System.out.println("A autonomia do carro é: " + medirAutonomia() + " km");
    }

    double medirAutonomia(){
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel(double km){
        return km / consumoCombustivel;
    }
}
