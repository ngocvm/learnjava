package com.ngocvm.example.Day123;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFiles {
    private static void zipFiles(String... filePaths) {
        try {
            File firstFile = new File(filePaths[0]);
            String zipFileName = firstFile.getName().concat(".zip");
            FileOutputStream fos = new FileOutputStream(zipFileName);
            ZipOutputStream zos = new ZipOutputStream(fos);

            for (String file : filePaths) {
                zos.putNextEntry(new ZipEntry(new File(file).getName()));
                byte[] bytes = Files.readAllBytes(Paths.get(file));
                zos.write(bytes, 0, bytes.length);
                zos.closeEntry();
            }

            zos.close();
        } catch (FileNotFoundException ex) {
            System.err.println("A file does not exist: " + ex);
        } catch (IOException ex) {
            System.err.println("IO error: " + ex);
        }
    }

    public static void main(String[] args) {
        String[] filePaths = {"data.ser", "books.txt"};
        zipFiles(filePaths);
    }
}
