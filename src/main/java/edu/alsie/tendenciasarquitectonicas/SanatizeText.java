package edu.alsie.tendenciasarquitectonicas;

public interface SanatizeText {
    static String sanatize(String text) {
        return text.replaceAll("[<>\\[\\],.!`';-]", "")
            .replaceAll("[\n]", " ")
            .replaceAll("( )+", " ")
            .toLowerCase();
    }
}
