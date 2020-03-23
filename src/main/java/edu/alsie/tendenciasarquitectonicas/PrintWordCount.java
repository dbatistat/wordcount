package edu.alsie.tendenciasarquitectonicas;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public interface PrintWordCount {
    static void print(List<Map.Entry<String, Long>> entries) {
        System.out.println("*********************");
        System.out.println("Rank  Word  Quantity");
        System.out.println("*********************");
        IntStream.range(0, entries.size())
            .mapToObj(index -> String.format("%2d    %-4s    %5d", index + 1, entries.get(index).getKey(), entries.get(index).getValue()))
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
}
