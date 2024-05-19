package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosLista4 {
    public static void main(String[] args) {
//        Exercício 4: Concatenação de Strings
//        Dada uma lista de strings, filtre as strings que contêm a letra 'a', transforme todas em maiúsculas e concatene todas em uma única string.

    List<String> listaPalavras = new ArrayList<>();
        listaPalavras.add("almoço");
        listaPalavras.add("tábua");
        listaPalavras.add("mouse");
        listaPalavras.add("cabana");
        listaPalavras.add("Amarilis");
        listaPalavras.add("manta");

        String stringsComAConcatenadas = listaPalavras.stream()
                .filter(palavra -> palavra.toLowerCase().contains("a"))
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(""));

        System.out.println(stringsComAConcatenadas);
    }
}
