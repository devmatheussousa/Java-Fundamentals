package dev.matheus.$06_Conversao_de_tipo;

/**
 * Conversão de tipo, também conhecida como *type casting*, é o processo de converter um valor de um tipo de dado para outro.
 * Em Java, existem dois tipos principais de conversão:
 *
 */
public class ConversaoDeTipos {

    public static void main(String[] args) {

        // Conversão implícita (automática)
        // Quando um valor é convertido para um tipo de dado mais genérico, a conversão é implícita.
        int meuInteiro = 100;
        double meuDouble = meuInteiro;
        System.out.println("meuInteiro: " + meuInteiro);
        System.out.println("meuDouble: " + meuDouble);

        // Conversão explícita (manual)
        // Quando um valor é convertido para um tipo de dado mais específico, a conversão é explícita.
        double meuDouble2 = 100.5;
        int meuInteiro2 = (int) meuDouble2;
        System.out.println("meuDouble2: " + meuDouble2);
        System.out.println("meuInteiro2: " + meuInteiro2);
    }
}
