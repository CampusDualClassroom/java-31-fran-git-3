package com.campusdual.classroom;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Exercise31 {

    public static void main(String[] args) {
        // Ruta al archivo "lorem.txt"
        String filePath = "src/main/resources/lorem.txt";

        try {
            // Leer todas las líneas del archivo
            List<String> lines = Files.readAllLines(Paths.get(filePath));

            // Imprimir las líneas en la consola
            for (String line : lines) {
                System.out.println(line);
            }

        } catch (IOException e) {
            // Manejo de la excepción si ocurre algún error al leer el archivo
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
