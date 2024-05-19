package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosLista8 {
    public static void main(String[] args) {
//        Exercício 8: Agrupamento por Paridade
//        Dada uma lista de números inteiros, agrupe-os em dois grupos: números pares e números ímpares.

    List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(1);
        listaInteiros.add(2);
        listaInteiros.add(3);
        listaInteiros.add(4);
        listaInteiros.add(5);
        listaInteiros.add(6);

        List<Integer> listaPar = listaInteiros.stream()
                        .filter(num -> num %2 == 0)
                                .toList();

        List<Integer> listaimpar = listaInteiros.stream()
                .filter(num -> num %2 != 0)
                .toList();

        System.out.println("lista impar: " + listaimpar);
        System.out.println("lista par: " + listaPar);
    }
}
