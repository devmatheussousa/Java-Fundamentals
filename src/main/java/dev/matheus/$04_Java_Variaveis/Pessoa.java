package dev.matheus.$04_Java_Variaveis;

/**
 * 1- Variáveis Locais: Declaradas dentro de um método ou bloco de código.
 * 2- Variáveis de Instância: Declaradas dentro de uma classe, mas fora de qualquer método.
 * 3- Variáveis estáticas: Declaradas com a palavra-chave static. Elas pertencem à classe em vez de à instância da classe.
 */
public class Pessoa {
    String nome; //Variaveil de instancia
    Integer idade;
    public final static Double saldoInicial = 0.0; //Variável estática

    public void exibirInfo(){
        Double saldo = 540.0; //varial local
        System.out.printf("Meu nome é %s e eu tenho %d anos e meu saldo é R$: %.2f%n ", nome, idade, saldo);
    }

    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        System.out.println("Saldo inicial era: R$: " + Pessoa.saldoInicial);
        pessoa.nome = "João";
        pessoa.idade = 25;
        pessoa.exibirInfo();
    }
}
