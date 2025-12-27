package dev.matheus.$10_Orientacao_a_Objetos.$1_Classes_e_Atributos.Exer1_Lampada;

public class Lampada {
    String modelo;
    String tensao;
    int potencia;
    String cor;
    String tipoLuz;
    int garantiaMes;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void ligar(boolean ligada) {
        if(ligada) {
            System.out.println("A lamda do modelo " + modelo + " está Ligando na voltage " + tensao);
        }else{
            System.out.println("A lamda do modelo " + modelo + " está Desligando na voltage " + tensao);
        }
    }
}
