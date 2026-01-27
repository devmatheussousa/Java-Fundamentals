package dev.matheus.$11_Heranca_Interface_e_Polimorfismo.$8_Interface;

public class Teste {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro();
        Gata gata = new Gata();
        Papagaio papagaio = new Papagaio();

        cachorro.emitirSom();
        gata.emitirSom();
        papagaio.emitirSom();

        cachorro.amamentar();
        gata.amamentar();
        papagaio.voar();
    }
}
