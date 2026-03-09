package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 * Filtrar os números primos da lista:
 * Com a ajuda da Stream API, filtre os
 * números primos da lista e exiba o resultado no console.
 */
public class Desafio17 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> primo = numero -> {
            if ( numero <= 1) return false;
            return IntStream.rangeClosed(2, (int) Math.sqrt(numero))
                    .noneMatch(divisor -> numero % divisor ==0);
        };

        List<Integer> numerosPrimos = numeros.stream()
                .filter(primo)
                .toList();

        System.out.println(numerosPrimos);
    }
}
