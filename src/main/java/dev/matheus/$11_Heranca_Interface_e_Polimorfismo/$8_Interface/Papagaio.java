package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$8_Interface;

public class Papagaio implements Animal, Ave {

    @Override
    public void emitirSom() {
        System.out.println("Papagaio emitindo som");
    }

    @Override
    public void voar() {
        System.out.println("Papagaio voando");
    }

    @Override
    public String toString() {
        return "Papagaio";
    }
}
