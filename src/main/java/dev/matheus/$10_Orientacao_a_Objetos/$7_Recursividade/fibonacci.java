package dev.matheus.$10_Orientacao_a_Objetos.$7_Recursividade;

public class fibonacci {

    public static int $fibonacci(int num){
        if(num < 2){
            return 1;
        }
        return $fibonacci(num - 1) + $fibonacci(num - 2);
    }
}


class testfibo{
    public static void main(String[] args) {
        for(int i = 0; i <= 10; i++){
            System.out.println(fibonacci.$fibonacci(i) + " ");
        }
        System.out.println();

//        System.out.println("--------- --------");
//        int fibo = fibonacci.$fibonacci(3);
//        System.out.println(fibo);
    }
}
