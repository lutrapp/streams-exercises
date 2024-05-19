package streams;

import java.util.ArrayList;
import java.util.List;

public class ExerciciosLista14 {
    public static void main(String[] args) {
//        Exercício 14: Soma Condicional
//        Dada uma lista de números inteiros, calcule a soma de todos os números que são múltiplos de 3.

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

        Integer listaNumerosMultiplosDe3 = listaInteiros.stream()
                .filter(item -> item%3 == 0)
                .reduce(0, Integer::sum);


        System.out.println(listaNumerosMultiplosDe3);
    }
}
