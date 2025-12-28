package dev.matheus.$10_Orientacao_a_Objetos.$6_Variaveis_e_metodos_estaticos.exer;

public class exer06 {

    static void imprimirValor(){
        System.out.println("O valor do contador é: " + Contador.getContador());
    }
    public static void main(String[] args){

//        imprimirValor();
//        Contador.incrementar();
//        imprimirValor();
//        Contador.incrementar();
//        imprimirValor();
//        Contador.incrementar();
//        imprimirValor();
//        Contador.incrementar();
//        imprimirValor();
//        Contador.incrementar();

        while (Contador.getContador() < 35){
//            //gera um loop infinito
//            if(Contador.getContador() == 1){
//                Contador.zerar();
//            }


            Contador.incrementar();
            imprimirValor();
        }


            //gerar um número aleatório entre 0 e 10
            int numero = (int) (Math.random() * 5000);
            System.out.println("Número gerado: " + numero);
    }
}
