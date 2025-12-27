package dev.matheus.$10_Orientacao_a_Objetos.$1_Classes_e_Atributos.Exer1_Lampada;

public class Exer_1Test_Lampada {
    public static void main(String[] args){

        Lampada lampada = new Lampada();

        lampada.modelo = "Fluorescente";
        lampada.tensao = "220V";
        lampada.potencia = 100;
        lampada.cor = "Branca";
        lampada.tipoLuz = "LED";
        lampada.garantiaMes = 12;
        lampada.tipos = new String[]{"LED", "Incandescente", "Fluorescente"};
        lampada.tipoAbajur = true;
        System.out.printf("Modelo: %s%n Tensão: %s%n Potência: %d%n Cor: %s%n Tipo de Luz: %s%n Garantia: %d meses%n Tipos: %s%n Tipo Abajur: %b%n ",
                lampada.modelo, lampada.tensao, lampada.potencia, lampada.cor, lampada.tipoLuz,
                lampada.garantiaMes, String.join(", ", lampada.tipos), lampada.tipoAbajur);

        lampada.ligar(true);


    }
}
