package dev.matheus.$10_Orientacao_a_Objetos.$6_Variaveis_e_metodos_estaticos;

import java.util.ArrayList;
import java.util.List;

public class TesteMinhaCalc {

    public static void main(String[] args) {

        int somarDoisValores = MinhaCal.soma(1, 2);
        System.out.println(somarDoisValores);

        int somarTresValores = MinhaCal.soma(1, 2, 3);
        System.out.println(somarTresValores);

        int somarQuatroValores = MinhaCal.soma(1, 2, 3, 4);
        System.out.println(somarQuatroValores);

        List<Integer> lista = new ArrayList<>();
        lista.add(somarDoisValores);
        lista.add(somarTresValores);
        lista.add(somarQuatroValores);

        int somarLista = MinhaCal.calcularInteiros(lista.stream().mapToInt(Integer::intValue).toArray());
        System.out.println(somarLista);
    }
}
