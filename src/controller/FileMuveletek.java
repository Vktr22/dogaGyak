package controller;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.charset.Charset;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class FileMuveletek {

    // --------------------------------------------------------
    // 1) Vesszővel elválasztott NÉVSOR beolvasása (1 sor)
    // --------------------------------------------------------
    public static List<String> nevekBeolvasasa(String fajlNev) {
        try {
            String content = Files.readString(
                    Path.of(fajlNev),
                    Charset.forName("UTF-8")
            );

            // split + pucolás
            return pucol(content.split(","));

        } catch (IOException e) {
            System.out.println("Hiba a fájl beolvasása során: " + e.getMessage());
            return new ArrayList<>();  // üres lista hiba esetén
        }
    }

    // --------------------------------------------------------
    // 2) Több sor beolvasása -> List<String>
    // --------------------------------------------------------
    public static List<String> sorokBeolvasasa(String fajlNev) {
        try {
            List<String> sorok = Files.readAllLines(
                    Path.of("nevekEgySorban.txt"),
                    Charset.forName("UTF-8")
            );

            // minden sor pucolva tér vissza
            return sorok.stream()
                    .map(String::trim)
                    .filter(s -> !s.isEmpty())
                    .collect(Collectors.toList());

        } catch (IOException e) {
            System.out.println("Hiba a fájl beolvasása során: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    // --------------------------------------------------------
    // Pucolás metódus: eltávolítja a felesleges szóközöket
    // --------------------------------------------------------
    private static List<String> pucol(String[] tomb) {
        return List.of(tomb).stream()
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());
    }
}