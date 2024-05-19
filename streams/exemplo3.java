package streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class exemplo3 {
    public static void main(String[] args) {
        List<String> filteredLines = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith("A")) {
                    filteredLines.add(line.toUpperCase());
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(filteredLines);

        try (Stream<String> lines = Files.lines(Paths.get("input.txt"))) {
            List<String> filteredLinesStream = lines.filter(line -> line.startsWith("A"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList());

            System.out.println(filteredLinesStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

