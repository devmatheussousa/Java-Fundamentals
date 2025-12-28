package dev.matheus.$10_Orientacao_a_Objetos.$4_Getters_e_Setters;

public class Moto {

    /*
    Encapsulamento -> É o princípio de esconder os detalhes de implementação de um objeto e expor apenas as funcionalidades necessárias.
    Detalhes->
        - Os atributos de uma classe são encapsulados, ou seja, não são acessíveis diretamente de fora da classe.
        - Para acessar ou modificar os atributos, são usados métodos públicos, conhecidos como getters e setters.
    Por que usar encapsulamento?
        - Garante a integridade dos dados, evitando que sejam modificados de forma inválida.
        - Permite a adição de lógica de validação e manipulação de dados antes de serem acessados ou modificados.

    Quando Usar?
        - Quando você deseja controlar o acesso a um atributo ou quando deseja adicionar lógica de validação.
     */
    private String marca;
    private String modelo;
    private int numPassageiro;
    private double capCombustivel;
    private double consumoCombustivel;
    private boolean ligado;
    private boolean desligado;

    public Moto() {
        ligado = true;
        desligado = false;
    }

    public Moto(String marca, String modelo, int numPassageiro, double capCombustivel, double consumoCombustivel) {
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
        System.out.println("A marca do Moto é: " + marca);
        System.out.println("O modelo do Moto é: " + modelo);
        System.out.println("O número de passageiros do Moto é: " + numPassageiro);
        System.out.println("A capacidade de combustível do Moto é: " + capCombustivel);
        System.out.println("O consumo de combustível do Moto é: " + consumoCombustivel);
    }

    public double calcularCombustivel(double km){
        double qtdCombustivel = km / consumoCombustivel;
        System.out.printf("A quantidade de combustível necessário para percorrer %.2f km é: %.2f litros de combustível.\n", km, qtdCombustivel);
        return qtdCombustivel;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void ligarMoto(boolean ligar) {
        if (ligar) {
            System.out.println("O Moto " + modelo + " está Ligando");
            ligar();
        } else {
            System.out.println("O Moto " + modelo + " está Desligando");
            desligar();
        }
    }

    /*
     Getters e Setters -> São métodos usados para acessar e modificar os atributos de uma classe, respetivamente.
     Detalhes->
        - Os métodos getters retornam o valor do atributo correspondente.
        - Os métodos setters recebem um valor e o atribuem ao atributo correspondente.
        - Os métodos setters são frequentemente usados para validar os valores antes de atribuí-los aos atributos.
        - Isso ajuda a garantir que os dados sejam consistentes e válidos.
        - Isso é particularmente útil quando você deseja controlar o acesso a um atributo ou quando deseja adicionar lógica de validação.
    Por que usar Getters e Setters?
        - Permitem encapsular o acesso aos atributos de uma classe, controlando como os dados são lidos e modificados.
        - Isso é particularmente útil quando você deseja adicionar lógica de validação ou manipulação de dados antes de acessar, ou modificar os atributos.
    Quando Usar?
        - Quando você deseja controlar o acesso a um atributo ou quando deseja adicionar lógica de validação.
     */

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

    /*
     * Este método é usado para testar o método ligarMoto.
     * Ele recebe uma string como parâmetro e com base nessa string, chama o método ligarMoto.
     * Se a string for "ligar", chama ligarMoto(true).
     * Se a string for "desligar", chama ligarMoto(false).
     * Se a string for qualquer outra coisa, imprime "Opção inválida".
     */

    public void testeLigarMotor(String texto){
        switch (texto) {
            case "ligar":
                ligarMoto(true);
                break;
            case "desligar":
                ligarMoto(false);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}







