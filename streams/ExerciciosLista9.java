package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosLista9 {
    public static void main(String[] args) {
//        Exercício 9: Contagem de Strings com uma Letra Específica
//        Dada uma lista de strings, conte quantas strings contêm a letra 'e'.

    List<String> listaComidas = new ArrayList<>();
        listaComidas.add("tomate");
        listaComidas.add("ingá");
        listaComidas.add("alface");
        listaComidas.add("inhame");
        listaComidas.add("banana");
        listaComidas.add("uva");
        listaComidas.add("Ervilha");

        List<String> itensComE = listaComidas.stream()
                        .filter(item -> item.toLowerCase().contains("e"))
                                .toList();

        System.out.println(itensComE);
    }
}
