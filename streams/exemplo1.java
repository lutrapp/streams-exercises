package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exemplo1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbers = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            }
        }

        System.out.println(evenNumbers);

        List<Integer> numbersStreams = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> evenNumbersStreams = numbersStreams.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNumbersStreams);
    }

}
