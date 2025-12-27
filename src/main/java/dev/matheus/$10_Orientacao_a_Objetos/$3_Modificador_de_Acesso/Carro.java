package dev.matheus.$10_Orientacao_a_Objetos.$3_Modificador_de_Acesso;

/**
 * Modificadores de acesso
 * - public: acesso livre, pode ser acessado de qualquer lugar.
 * - private: acesso restrito ao mesmo pacote, não pode ser acessado de fora do pacote.
 * - protected: acesso restrito ao mesmo pacote e subclasses, não pode ser acessado de fora do pacote.
 * - default: Acesso restrito ao mesmo pacote, não pode ser acessado de fora do pacote.
 *
 * Nivel de visivilidade de cada um
 * - public: acesso livre, pode ser acessado de qualquer lugar.
 * - private: acesso restrito ao mesmo pacote, não pode ser acessado de fora do pacote.
 * - protected: acesso restrito ao mesmo pacote e subclasses, não pode ser acessado de fora do pacote.
 * - default: Acesso restrito ao mesmo pacote, não pode ser acessado de fora do pacote.
 */
public class Carro {
    private String marca;
    private String modelo;
    private int numPassageiro;
    private double capCombustivel;
    private double consumoCombustivel;
    private boolean ligado;
    private boolean desligado;

    public Carro() {
        ligado = true;
        desligado = false;
    }

    public Carro(String marca, String modelo, int numPassageiro, double capCombustivel, double consumoCombustivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.numPassageiro = numPassageiro;
        this.capCombustivel = capCombustivel;
        this.consumoCombustivel = consumoCombustivel;
    }

    public void exibirAutonomita() {
        System.out.printf("A autonomia do %s é de %.2f km\n", modelo, capCombustivel * consumoCombustivel);
    }

    public void exibir() {
        System.out.println("A marca do carro é: " + marca);
        System.out.println("O modelo do carro é: " + modelo);
        System.out.println("O número de passageiros do carro é: " + numPassageiro);
        System.out.println("A capacidade de combustível do carro é: " + capCombustivel);
        System.out.println("O consumo de combustível do carro é: " + consumoCombustivel);
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void ligarCarro(boolean ligar) {
        if (ligar) {
            System.out.println("O carro " + modelo + " está Ligando");
            ligar();
        } else {
            System.out.println("O carro " + modelo + " está Desligando");
            desligar();
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getNumPassageiro() {
        return numPassageiro;
    }

    public void setNumPassageiro(int numPassageiro) {
        this.numPassageiro = numPassageiro;
    }

    public double getCapCombustivel() {
        return capCombustivel;
    }

    public void setCapCombustivel(double capCombustivel) {
        this.capCombustivel = capCombustivel;
    }

    public double getConsumoCombustivel() {
        return consumoCombustivel;
    }

    public void setConsumoCombustivel(double consumoCombustivel) {
        this.consumoCombustivel = consumoCombustivel;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isDesligado() {
        return desligado;
    }

    public void setDesligado(boolean desligado) {
        this.desligado = desligado;
    }
}
