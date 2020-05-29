package com.ngocvm.example.Day121;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class NioExamples {
    public static void main(String[] args) throws IOException {
        Path file = Paths.get("Hello2.java");
        try {
            Files.createFile(file);
        } catch (FileAlreadyExistsException ex) {
            System.err.format("File %s already exist %n", file);
        } catch (IOException ex) {
            System.err.format("Error creating file %s%n", file);
        }

        Path dir = Paths.get("NIO Examples");
//        Files.createDirectory(dir);

        //--- lists only sub directories in the current directory
        Path currentDir = Paths.get(".");
        DirectoryStream.Filter<Path> filter = new DirectoryStream.Filter<Path>() {
            @Override
            public boolean accept(Path entry) throws IOException {
                return Files.isDirectory(entry);
            }
        };

        try (DirectoryStream<Path> stream = Files.newDirectoryStream(currentDir, filter)) {
            for (Path file1: stream) {
                System.out.println(file1.getFileName());
            }
        } catch (IOException | DirectoryIteratorException ex) {
            System.err.println(ex);
        }

        Path photo = Paths.get("Photo.png");
        try {
            byte[] bytes = Files.readAllBytes(photo);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        Path code = Paths.get("Hello.java");
        try {
            List<String> lines = Files.readAllLines(code);
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }

        //--- appends bytes read from file1 to file2
        Path file1 = Paths.get("Hello.java");
        Path file2 = Paths.get("NewHello.java");
        try {
            byte[] bytes = Files.readAllBytes(file1);
            Files.write(file2, bytes, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            System.err.println(ex);
        }

        List<String> lines = new ArrayList<>();
        lines.add("---------------------------------");
        lines.add("Copyright (C) by Nam Ha Minh");
        lines.add("All rights Reserved");

        try {
            Files.write(file2, lines, StandardOpenOption.APPEND);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
