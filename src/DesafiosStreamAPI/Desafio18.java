package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Verifique se todos os números da lista são iguais:
 * Utilizando a Stream API, verifique se todos os números
 * da lista são iguais e exiba o resultado no console.
 */
public class Desafio18 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Set<Integer> itensRepetidos = new HashSet<>();

        Predicate<Integer> numerosRepetidos = numero -> !itensRepetidos.add(numero);

        List<Integer> duplicados = numeros.stream()
                .filter(numerosRepetidos)
                .distinct()
                .toList();

        System.out.println(duplicados);
    }
}
