package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosLista10 {
    public static void main(String[] args) {
//        Exercício 10: Ordenação de Strings
//        Dada uma lista de strings, filtre as strings que têm mais de 4 caracteres,
//        transforme todas em minúsculas e ordene-as alfabeticamente.

    List<String> listaPalavras = new ArrayList<>();
        listaPalavras.add("torta");
        listaPalavras.add("ave");
        listaPalavras.add("café");
        listaPalavras.add("PasTel");
        listaPalavras.add("bolinho");

        List<String> ordenadasEMaiorQue4 = listaPalavras.stream()
                .filter(x -> x.length()>4)
                .map(x -> x.toLowerCase())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(ordenadasEMaiorQue4);
    }
}
