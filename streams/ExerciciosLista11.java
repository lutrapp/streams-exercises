package streams;

import streams.util.Pessoa;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ExerciciosLista11 {
    public static void main(String[] args) {
//        Exercício 11: Lista de Idades
//        Dada uma lista de objetos Pessoa (com atributos nome e idade), filtre as pessoas com idade maior que 18, transforme a lista de pessoas em uma lista de nomes.
        List<Pessoa> lista = List.of(
                new Pessoa("Luci", 42),
                new Pessoa("Bernardo", 16),
                new Pessoa("Gabi", 19),
                new Pessoa("Emiliano", 44),
                new Pessoa("Hercules", 12));

        List<String> nomesMaior18 = lista.stream()
                .filter(pessoa -> pessoa.getIdade() >18)
                .map(Pessoa::getNome)
                .collect(Collectors.toList());

        System.out.println(nomesMaior18);

        //com hashmap
        Map<String,Integer> listaMap = new HashMap<String, Integer>();
        listaMap.put("Luci", 42);
        listaMap.put("Rosa", 69);
        listaMap.put("Bernardo", 16);
        listaMap.put("Gabi", 19);
        listaMap.put("Emiliano", 44);
        listaMap.put("Hercules", 12);


        List<String> nomesMaiorde18Map = listaMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 18 && entry.getValue()<60)
//                .map(item -> item.getKey())
                .map(Map.Entry::getKey)
//                .collect(Collectors.toList());
                .toList();


        System.out.println(nomesMaiorde18Map);
    }

}
