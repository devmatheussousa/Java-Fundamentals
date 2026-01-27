package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$8_Interface;

public class Cachorro implements Animal, Mamifero {
    Long tamanho = 100L;
    String raca = "PitBul Americano";
    @Override
    public void emitirSom() {
        System.out.println("Cachorro emitindo som");
    }

    @Override
    public void amamentar() {
        System.out.println("Cachorro amamentando");
    }

    @Override
    public String toString() {
        return "Cachorro";
    }
}
