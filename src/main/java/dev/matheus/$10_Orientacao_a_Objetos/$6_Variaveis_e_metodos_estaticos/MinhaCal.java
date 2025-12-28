package dev.matheus.$10_Orientacao_a_Objetos.$6_Variaveis_e_metodos_estaticos;

public class MinhaCal {

    /**
     * Metodos estaticos são aqueles que podem ser chamados sem a necessidade de instanciar a classe.
     *
     * Detalhes ->
     *      - Podem ser chamados diretamente pela classe.
     *      - Não necessitam de um objeto para serem invocados.
     *      - São úteis para operações que não dependem do estado de um objeto específico.
     *Oque e ?
     *      - Metodos estaticos são aqueles que podem ser chamados sem a necessidade de instanciar a classe.
     *Por que usar ?
     *      - Quando um metodo é estatico, ele pode ser chamado mesmo antes de criar uma instância da classe.
     *      - Isso é útil quando o metodo não depende do estado de um objeto específico.
     *      - Por exemplo, um metodo estatico pode ser usado para calcular o fatorial de um número.
     *Quando usar?
     *      - Quando você precisa realizar uma operação que não depende do estado de um objeto específico.
     *      - Por exemplo, um metodo estatico pode ser usado para calcular o fatorial de um número.
     *
     */
    public static int soma(int num1, int num2){
        return num1 + num2;
    }

    //Sobrecarga do metodo soma com tres parametros
    public static int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    //Sobrecarga do metodo soma com quatro parametros
    public static int soma(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }

    public static int calcularInteiros(int[] nums){
        int total = 0;
        for(int i = 0; i < nums.length; i++){
            total += nums[i];
        }
        return total;
    }
}
