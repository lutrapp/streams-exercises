package streams;

import streams.util.Pessoa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciciosLista3 {
    public static void main(String[] args) {
//        Exercício 3: Quadrados de Números Ímpares
//        Dada uma lista de números inteiros, filtre os números ímpares, eleve-os ao quadrado e colecione os resultados em uma nova lista.


    List<Integer> listaInteiros = new ArrayList<>();
        listaInteiros.add(9);
        listaInteiros.add(2);
        listaInteiros.add(3);
        listaInteiros.add(5);
        listaInteiros.add(14);
        listaInteiros.add(28);
        listaInteiros.add(7);
        listaInteiros.add(9);
        listaInteiros.add(44);
        listaInteiros.add(76);

        List<Integer> listaImparQuadrado = listaInteiros.stream()
                .filter(item -> item%2 != 0)
                .map(item -> item*item)
                .toList();

        System.out.println(listaImparQuadrado);
    }
}
