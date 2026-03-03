package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *Agrupe os valores ímpares múltiplos de 3 ou de 5:
 * Utilize a Stream API para agrupar os valores ímpares
 * múltiplos de 3 ou de 5 e exiba o resultado no console.
 */

public class Desafio10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> multiplos =numero -> {
            return numero % 3 == 0;
        };



        List<Integer> multiplosDeTres = numeros.stream()
                .filter(multiplos)
                .toList();

        System.out.println(multiplosDeTres);
    }
    }

