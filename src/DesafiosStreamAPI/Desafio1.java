package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Mostre a lista na ordem numérica:
 * Crie um programa que utilize a Stream API para ordenar
 * a lista de números em ordem crescente e a exiba no console.
 */


public class Desafio1 {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Comparator<Integer> ordemCrescente = Integer::compareTo;

        List<Integer> numerosOrdemCrescente = numeros.stream()
                .sorted(ordemCrescente)
                .toList();

//        numerosOrdemCrescente.forEach((System.out::println));
        System.out.println(numerosOrdemCrescente);
    }
}
