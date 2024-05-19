package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ExerciciosLista5 {
    public static void main(String[] args) {
//        Exercício 5: Soma de Quadrados
//        Dada uma lista de números inteiros, eleve todos ao quadrado e calcule a soma de todos os quadrados.

    List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(3);

        int somaQuadrados = listaInteiros.stream()
                .map(item -> item*item)
                .reduce(0, Integer::sum);

        System.out.println(somaQuadrados);
    }
}
