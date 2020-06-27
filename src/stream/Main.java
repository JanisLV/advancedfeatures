package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("John", "Sarah", "Mark", "Tyla", "Ellisha", "Eamonn");
        List<Integer> integerList = Arrays.asList(1, 4, 2346, 123, 76, 11, 0, 0, 62, 23, 50);
//        Stream.of("asdf","sdfasd");
        stringList.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(el -> System.out.println(el));

        System.out.println(integerList.stream()
                .sorted()
                .collect(Collectors.toList()));

        stringList.stream()
                .filter(el -> el.startsWith("E"))
                .forEach(System.out::println);

        integerList.stream()
                .filter(el -> el > 30 && el < 200)
                .filter(el -> el != 33)
                .forEach(System.out::println);
//                .collect(Collectors.toList());

        stringList.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        stringList.stream()
                .map(el -> el.substring(1, el.length() - 1))
                .forEach(System.out::println);

        stringList.stream()
                .sorted(Comparator.reverseOrder()).
                forEach(System.out::println);
    }
}
