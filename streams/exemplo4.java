package streams;

import java.util.ArrayList;
import java.util.List;

public class exemplo4 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<String> evenNumberStrings = new ArrayList<>();

        for (Integer number : numbers) {
            if (number % 2 == 0) {
                evenNumberStrings.add(String.valueOf(number));
            }
        }

        String result = "";
        for (String s : evenNumberStrings) {
            result += s;
        }

        System.out.println(result);

        List<Integer> numbersStreams = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        String resultStreams = numbersStreams.stream()
                .filter(number -> number % 2 == 0)
                .map(String::valueOf)
                .reduce("", String::concat);

        System.out.println(result);
    }
}

