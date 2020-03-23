package edu.alsie.tendenciasarquitectonicas;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        PrintWordCount.print(WordCount.count(FileToText.getText(args[0])));
    }
}
