package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExerciciosLista7 {
    public static void main(String[] args) {
//        Exercício 7: Maior Número Par
//        Dada uma lista de números inteiros, encontre o maior número par presente na lista.

    List<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(9);
        listaNumeros.add(28);
        listaNumeros.add(29);
        listaNumeros.add(98);
        listaNumeros.add(16);
        listaNumeros.add(32);
        listaNumeros.add(240);

        Optional<Integer> maiorParOptional = listaNumeros.stream()
                .filter(item -> item % 2 == 0)
                .max(Comparator.naturalOrder());

        List<Integer> maiorPar = maiorParOptional
                .map(List::of)
                .orElseGet(ArrayList::new);


        System.out.println(maiorPar);
    }
}
