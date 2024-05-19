package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

public class exemplo2 {
    public static void main(String[] args) {
        List<String> names = List.of("Alice", "Bob", "Annie", "John", "Andrew");
        List<String> namesStartingWithA = new ArrayList<>();

        for (String name : names) {
            if (name.startsWith("A")) {
                namesStartingWithA.add(name);
            }
        }

        System.out.println(namesStartingWithA);

    List<String> namesStreams = List.of("Alice", "Bob", "Annie", "John", "Andrew");
    List<String> namesStreamsStartingWithA = namesStreams.stream()
            .filter(name -> name.startsWith("A"))
            .collect(Collectors.toList());

        System.out.println(namesStreamsStartingWithA);
    }
}
