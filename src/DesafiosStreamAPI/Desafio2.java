package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Imprima a soma dos números pares da lista:
 * Utilizando a Stream API, realize a soma dos números
 * pares da lista e exiba o resultado no console.
 **/

public class Desafio2 {

    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> somarPares = numero -> (numero % 2) == 0;

        List<Integer> numerosParesSomados = Collections.singletonList(numeros.stream()
                .filter(somarPares)
                .mapToInt(Integer::intValue)
                .sum());

        System.out.println(numerosParesSomados);

    }
}
