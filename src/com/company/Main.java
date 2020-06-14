package com.company;

import java.io.*;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        // write your code here


        File absoluteFile = new File("/home/deniss/Downloads/myFile.txt");
        File relativeFile = new File("src/com/company/myFile.txt");

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(relativeFile))) {
            String fileLine;
            while ((fileLine = bufferedReader.readLine()) != null) {
                System.out.println(fileLine);
            }
        }
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
//            String fileLine = "file line";
//            bufferedWriter.write(fileLine);
//        }
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(relativeFile, true))) {
            String fileLine = "\nappended file line";
            bufferedWriter.write(fileLine);
        }

        System.out.println("0-0-0-0-");
        Path absolutePath = Paths.get("/home/deniss/Downloads/myFile.txt");
        Path relativePath = Paths.get("src/com/company/myFile.txt");

        List<String> fileLines = Files.readAllLines(absolutePath);
        System.out.println("1" + fileLines);
        List<String> fileLines1 = Files.readAllLines(absolutePath, Charset.forName("UTF-8"));
        System.out.println("2" + fileLines1);
        List<String> fileLines2 = Arrays.asList("first line", "second line");
        System.out.println("3" + fileLines2);
        Files.write(absolutePath, fileLines);
        Files.write(absolutePath, fileLines, StandardOpenOption.APPEND);
        Path a = Paths.get("/home/deniss/Downloads/emptyFolder");
        Files.createDirectory(a);

        HelloPrinter helloPrinter = new HelloPrinter(24);
        Thread tr1 = new Thread(helloPrinter);
        tr1.start();

        List<Integer> nts = new ArrayList<>();
        Operation oper = (asdf, b) -> asdf + b;
        float sum = 0;
        for (Integer nt : nts) {
            sum = oper.operation(sum, nt);

        }
    }
}
