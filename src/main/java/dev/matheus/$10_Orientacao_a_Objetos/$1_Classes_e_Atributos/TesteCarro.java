package dev.matheus.$10_Orientacao_a_Objetos.$1_Classes_e_Atributos;

public class TesteCarro {
    public static void main(String[] args) {
        // Criando um objeto da classe Carro
        Carro van = new Carro();
        van.marca = "Ford";
        van.modelo = "Ford";
        van.numPassageiros = 8;
        van.capCombustivel = 90.0;
        van.consumoCombustivel = 14.0;

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 5;
        fusca.capCombustivel = 40.0;
        fusca.consumoCombustivel = 11.0;



        // Imprimindo as informações do carro
        System.out.printf("""
                        Marca van: %s
                        Modelo van: %s
                        Numero de Passageiros van: %d
                        Capacidade de Combustivel van: %.2f
                        Consumo de Combustivel van: %.2f
                        <p/>
                        Marca fusca: %s
                        Modelo fusca: %s
                        Numero de Passageiros fusca: %d
                        Capacidade de Combustivel fusca: %.2f
                        Consumo de Combustivel fusca: %.2f
                        <p/>
                        """, van.marca, van.modelo, van.numPassageiros, van.capCombustivel, van.consumoCombustivel,
                                fusca.marca, fusca.modelo, fusca.numPassageiros, fusca.capCombustivel, fusca.consumoCombustivel

        );

        // Chamando o método exibirAutonomia\

        //1 - Primeira forma de obter a autonomia do carro
        double autonomia = van.medirAutonomia();
        System.out.println("A autonomia da van é: " + autonomia + " km");

        //2 - Segunda forma de obter a autonomia do carro
        fusca.exibirAutonomia();


        //comando git para ingnorar um arquivo
    }
}
