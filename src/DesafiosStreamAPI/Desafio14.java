package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.IntStream;

/**
 *Encontre o maior número primo da lista:
 */
public class Desafio14 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Predicate<Integer> primo = numero -> {
            if ( numero <= 1) return false;
            return IntStream.rangeClosed(2, (int) Math.sqrt(numero))
                    .noneMatch(divisor -> numero % divisor ==0);
            };

        Optional<Integer> resultado = numeros.stream()
                .filter(primo)
                .max(Integer::compare);

        System.out.println(resultado);

        }
    }

