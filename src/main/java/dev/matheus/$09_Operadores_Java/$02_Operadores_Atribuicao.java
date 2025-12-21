package dev.matheus.$09_Operadores_Java;

/**
 * Operadores de Atribuição
 * = -> Atribui o valor do operador direito ao operador esquerdo
 * += -> Adiciona o valor do operador direito ao operador esquerdo e atribui o resultado ao operador esquerdo
 * -= -> Subtrai o valor do operador direito ao operador esquerdo e atribui o resultado ao operador esquerdo
 * *= -> Multiplica o valor do operador direito ao operador esquerdo e atribui o resultado ao operador esquerdo
 * /= -> Divide o valor do operador direito ao operador esquerdo e atribui o resultado ao operador esquerdo
 * %= -> Calcula o resto da divisão do valor do operador direito ao operador esquerdo e atribui o resultado ao operador esquerdo
 * &= -> Realiza a operação de AND bit a bit entre o operador esquerdo e o operador direito, e atribui o resultado ao operador esquerdo
 * |= -> Realiza a operação de OR bit a bit entre o operador esquerdo e o operador direito, e atribui o resultado ao operador esquerdo
 * ^= -> Realiza a operação de XOR bit a bit entre o operador esquerdo e o operador direito, e atribui o resultado ao operador esquerdo
 * <<= -> Desloca os bits do operador esquerdo para a esquerda pelo número de posições especificado pelo operador direito,
 * e atribui o resultado ao operador esquerdo
 * >>= -> Desloca os bits do operador esquerdo para a direita pelo número de posições especificado pelo operador direito,
 * e atribui o resultado ao operador esquerdo
 */
public class $02_Operadores_Atribuicao {

    public static void main(String[] args) {
        System.out.println("--- Sistema de Operadores de Atribuição ---");

        int a = 10;
        int b = 20;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a += b;
        System.out.println("a += b: " + a);

        a -= b;
        System.out.println("a -= b: " + a);

        //a = a * b
        a *= b;
        System.out.println("a *= b: " + a);

        a /= b;
        System.out.println("a /= b: " + a);

        a %= b;
        System.out.println("a %= b: " + a);

        a &= b;
        System.out.println("a &= b: " + a);

        a |= b;
        System.out.println("a |= b: " + a);

        a ^= b;
        System.out.println("a ^= b: " + a);

        a <<= b;
        System.out.println("a <<= b: " + a);

        a >>= b;
        System.out.println("a >>= b: " + a);

        System.out.println("-- Outros exemplos --");
        String nome = "Matheus ";
        String sobreNome = "Sousa Araujo";
        nome += sobreNome;

        System.out.println(nome);
    }


}
