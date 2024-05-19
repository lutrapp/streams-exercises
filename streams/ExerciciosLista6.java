package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExerciciosLista6 {
    public static void main(String[] args) {
//        Exercício 6: Nomes com "J"
//        Dada uma lista de nomes, filtre aqueles que começam com "J" e colecione os nomes filtrados em uma lista.       Dada uma lista de números inteiros, filtre os números ímpares, eleve-os ao quadrado e colecione os resultados em uma nova lista.


    List<String> listaNomes = new ArrayList<>();
        listaNomes.add("Juliana");
        listaNomes.add("jair");
        listaNomes.add("Lucas");
        listaNomes.add("Ruja");
        listaNomes.add("gabi");
        listaNomes.add("Juba");


        List<String> nomesComJ= listaNomes.stream()
                .filter(nome -> nome.toLowerCase().startsWith("j"))
                .collect(Collectors.toList());



        System.out.println(nomesComJ);
    }
}
