package dev.matheus.$10_Orientacao_a_Objetos.$2_Construtores_E_Codigos_De_Inicializacao;

public class Car {

    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    /**
     * Construtor da classe Car.
     * Inicializa o número de passageiros como 4.
     * Esse e chamando de construtor padrao sem argumentos
     * Isso significa que quando um objeto Car é criado sem fornecer valores para seus atributos,
     * o construtor padrao é chamado automaticamente.
     * Pode usar para inicializar os atributos com valores padrao.
     */
    public Car(){
        numPassageiros = 4;
        System.out.println("A classe Car foi instanciada");
    }

    /**
     * Construtor da classe Car.
     * Inicializa os atributos marca, modelo e numPassageiros.
     * Esse construtor já receber argumentos passados nas aspas para inicializar os atributos do objeto.
     * Isso significa que quando um objeto Car é criado com argumentos,
     * o construtor com argumentos é chamado automaticamente.
     * Pode usar para inicializar os atributos com valores fornecidos.
     * @param marca
     * @param modelo
     * @param numPassageiros
     */
    public Car(String marca, String modelo, int numPassageiros) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiros = numPassageiros;
    }

    void exibirAutonomia(){
        System.out.printf("A autonomia do %s é de %.2f km\n", modelo, capCombustivel * consumoCombustivel);
    }
}
