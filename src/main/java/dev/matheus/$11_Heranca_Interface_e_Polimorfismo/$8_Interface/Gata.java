package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$8_Interface;

public class Gata implements Animal, Mamifero {
    String raca = "Siames";
    @Override
    public void emitirSom() {
        System.out.println("Gata emitindo som");
    }

    @Override
    public void amamentar() {
        System.out.println("Gata amamentando");
    }

    @Override
    public String toString() {
        return "Gata";
    }
}
