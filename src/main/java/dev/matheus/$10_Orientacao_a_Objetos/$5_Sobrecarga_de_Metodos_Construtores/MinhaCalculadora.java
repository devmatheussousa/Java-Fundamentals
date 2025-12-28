package dev.matheus.$10_Orientacao_a_Objetos.$5_Sobrecarga_de_Metodos_Construtores;

public class MinhaCalculadora {

    /**
     * Sobrecarga do metodo (Override) soma com dois parametros
     * Oque e sobre carga de metodos?
     * Quando temos dois ou mais metodos com o mesmo nome, mas com parametros diferentes
     * Isso e chamado de sobre carga de metodos
     * detalhes ->
     *      - O metodo soma com dois parametros, soma dois numeros inteiros
     *      - O metodo soma com tres parametros, soma tres numeros inteiros
     *      - O metodo soma com quatro parametros, soma quatro numeros inteiros
     *Por que usar sobre carga de metodos?
     *      - Quando temos um metodo que pode ser usado de diferentes formas, podemos usar sobre carga de metodos
     *      - Isso facilita a utilizacao do metodo, pois o usuario não precisa se preocupar com os parametros
     *      - O usuario pode chamar o metodo soma com dois parametros, ou com tres parametros, ou com quatro parametros
     *Quando Usar?
     *      - Quando temos um metodo que pode ser usado de diferentes formas, podemos usar sobre carga de metodos
     */
    //Metodo soma com dois parametros
    public int soma(int num1, int num2){
        return num1 + num2;
    }

    //Sobrecarga do metodo soma com tres parametros
    public int soma(int num1, int num2, int num3){
        return num1 + num2 + num3;
    }

    //Sobrecarga do metodo soma com quatro parametros
    public int soma(int num1, int num2, int num3, int num4){
        return num1 + num2 + num3 + num4;
    }


    public int soma(int[] vetorInteiros){
        int total = 0;
        for(int i = 0; i < vetorInteiros.length; i++){
            total += vetorInteiros[i];
        }
        return total;
    }
}
