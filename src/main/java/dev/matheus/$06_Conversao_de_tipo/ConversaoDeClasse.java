package dev.matheus.$06_Conversao_de_tipo;

public class ConversaoDeClasse {

    public static void main(String[] args) {


        //Upcasting (conversão implícita)
        // Quando um objeto é convertido para uma superclasse, a conversão é implícita.
        Animal animal = new Cachorro(); // Upcasting implícito
        animal.fazerSom(); // Chama o método fazerSom() da classe Cachorro

        //Downcasting (conversão explícita)
        // Quando um objeto é convertido para uma subclasse, a conversão é explícita.
        Cachorro cachorro = (Cachorro) animal; // Downcasting explícito
        cachorro.latir(); // Chama o método latir() da classe Cachorro

        // Exemplo de ClassCastException
        try {
            Gato gato = (Gato) animal; // Isso causará uma ClassCastException
        } catch (ClassCastException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}


// Classes de exemplo para demonstração de upcasting/downcasting
class Animal {
    public void fazerSom() {
        System.out.println("Animal faz um som.");
    }
}

class Cachorro extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Cachorro late.");
    }

    public void latir() {
        System.out.println("Woof woof!");
    }
}

class Gato extends Animal {
    @Override
    public void fazerSom() {
        System.out.println("Gato mia.");
    }

    public void miar() {
        System.out.println("Meow!");
    }
}
