package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ExerciciosLista13 {
    public static void main(String[] args) {
//        Exercício 13: Contagem de Palavras
//        Dada uma lista de frases, crie um mapa onde a chave é uma palavra e o valor
//        é o número de vezes que essa palavra aparece em todas as frases.

    List<String> listaFrases = Arrays.asList(
            "O gato está no telhado",
            "O cachorro está no quintal",
            "O gato e o cachorro estão no quintal",
            "O telhado é alto"
    );

        Map<String, Long> contagemPalavras = listaFrases.stream().flatMap(frase -> Arrays.stream(frase.split("\\s+")))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));


        contagemPalavras.forEach((palavra, contagem) ->
                System.out.println(palavra + ": " + contagem));

    }
}
