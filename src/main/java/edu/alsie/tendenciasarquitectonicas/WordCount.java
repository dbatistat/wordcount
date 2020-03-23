package edu.alsie.tendenciasarquitectonicas;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public interface WordCount {
    static List<Map.Entry<String, Long>> count(String text) {
        return Arrays.stream(SanatizeText.sanatize(text).split(" "))
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .sorted((valuePrevius, currentValue) -> Long.compare(currentValue.getValue(), valuePrevius.getValue()))
            .collect(Collectors.toList());
    }
}
