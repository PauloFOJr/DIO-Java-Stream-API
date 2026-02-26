package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *  Calcule a média dos números maiores que 5:
 * Com a Stream API, calcule a média dos números
 * maiores que 5 e exiba o resultado no console.
 */

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

       Predicate<Integer> maioresQueCinco = numero -> numero > 5;

        double media = numeros.stream()
                .filter(maioresQueCinco)
                .mapToDouble(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(media);
    }
}
