package edu.alsie.tendenciasarquitectonicas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public interface FileToText {
    static String getText(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }
}
