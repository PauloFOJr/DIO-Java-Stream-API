package DesafiosStreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * Agrupe os números em pares e ímpares:
 * Utilize a Stream API para agrupar os números em duas listas separadas, uma contendo os números
 * pares e outra contendo os números ímpares da lista original, e exiba os resultados no console.
 */
public class Desafio16 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> particionados = numeros.stream()
                .collect(Collectors.partitioningBy(numero -> numero % 2 == 0));

        List<Integer> pares = particionados.get(true);
        List<Integer> impares = particionados.get(false);

        System.out.println("Pares " + pares);
        System.out.println("Ímpares " + impares);

//        Predicate<Integer> numeroPar = numero ->{
//            if (numero % 2 == 0) {
//                System.out.println(numero);
//            }
//            return false;
//        };
//
//        Predicate<Integer> numeroImpar = numero ->
//        {
//            if (numero % 2 != 0) {
//                System.out.println(numero);
//            }
//            return false;
//        };
//
//       List<Integer> pares = numeros.stream()
//               .filter(numeroPar)
//               .toList();
//
//       List<Integer> impares =numeros.stream()
//               .filter(numeroImpar)
//               .toList();
    }
}
