package dev.matheus.$09_Operadores_Java;

/**
 * Operadores relacionais (ou de comparação) são usados para comparar dois valores e determinar a relação entre eles.
 * Eles sempre retornam um valor booleano: `true` se a relação for verdadeira, e `false` se for falsa. São fundamentais para estruturas de
 * controle de fluxo, como `if` e `while`.
 *
 * | Operador | Descrição        | Exemplo  | Resultado                            | Notas                                           |
 * | -------- | ---------------- | -------- | ------------------------------------ | ----------------------------------------------- |
 * | `==`     | Igual a          | `a == b` | `true` se `a` é igual a `b`          | Para objetos, compara referências, não valores. |
 * | `!=`     | Diferente de     | `a != b` | `true` se `a` é diferente de `b`     |                                                 |
 * | `>`      | Maior que        | `a > b`  | `true` se `a` é maior que `b`        |                                                 |
 * | `<`      | Menor que        | `a < b`  | `true` se `a` é menor que `b`        |                                                 |
 * | `>=`     | Maior ou igual a | `a >= b` | `true` se `a` é maior ou igual a `b` |                                                 |
 * | `<=`     | Menor ou igual a | `a <= b` | `true` se `a` é menor ou igual a `b` |                                                 |
 */
public class $02_Operadores_Relacionais {

    public static void main(String[] args) {

        Integer num1 = 10;
        Integer num2 = 20;

        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);

        Boolean igual = num1 == num2;
        Boolean diferente = num1 != num2;
        Boolean maior = num1 > num2;
        Boolean menor = num1 < num2;
        Boolean maiorOuIgual = num1 >= num2;
        Boolean menorOuIgual = num1 <= num2;

        System.out.printf("Num1 == a Num2: %b%n", igual);
        System.out.printf("Num1 != de Num2: %b%n", diferente);
        System.out.printf("Num1 > que Num2: %b%n", maior);
        System.out.printf("Num1 < que Num2: %b%n", menor);
        System.out.printf("Num1 >= que Num2: %b%n", maiorOuIgual);
        System.out.printf("Num1 <= que Num2: %b%n", menorOuIgual);

    }

}
