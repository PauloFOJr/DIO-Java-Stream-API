package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Remova todos os valores ímpares:
 * Utilize a Stream API para remover os valores ímpares
 * da lista e imprima a lista resultante no console.
 */

public class Desafio4 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Function<Integer,Integer> removerValoresImpares = numeroImpar -> {
            if (numeroImpar % 2 == 0) {
                System.out.println(numeroImpar);
            }
            return numeroImpar;
        };

        List<Integer> listaSemNumeroImpares = numeros.stream()
                .map(removerValoresImpares)
                .toList();
    }
}
