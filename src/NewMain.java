import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class NewMain {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        String countryKey = "Poland";
//        Map<String, String> countries = new HashMap<>();
//        countries.put(countryKey, "Warsaw");
//        countries.put(countryKey, "Berlin");
//        for(Map.Entry<String, String> dictionary: countries.entrySet()) {
//            String country = dictionary.getKey();
//            String capital = dictionary.getValue();
//            System.out.printf("%s : %s\n", country, capital);
//        }

//        File absoluteFile = new File("C:/myDirectory/myFile.txt");
        File relativeFile = new File("src/myFile.txt");
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(relativeFile))) {
//            String fileLine;
//            while ((fileLine = bufferedReader.readLine()) != null) {
//                System.out.println(fileLine);
//            }
//        }
//
//        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(relativeFile, true))) {
//            String fileLine = "file line";
//            bufferedWriter.write(fileLine);
//        }
//
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(relativeFile))) {
//            String fileLine;
//            while ((fileLine = bufferedReader.readLine()) != null) {
//                System.out.println(fileLine);
//            }
//
//        }

//        Person p = new Person("Me","Mi");
//        try (FileOutputStream fileOutputStream = new FileOutputStream(relativeFile);
//             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
//            objectOutputStream.writeObject(p);
//        }
//
//        Person person;
//        try (FileInputStream fileInputStream= new FileInputStream(relativeFile);
//             ObjectInputStream objectInputStream =
//                     new ObjectInputStream(fileInputStream)) {
//            person = (Person) objectInputStream.readObject();
//        }
//        System.out.println(person);
//        System.out.println(person.equals(p));

        Path path = Paths.get("src/myFile.txt");
        List<String> fileLines = Files.readAllLines(path);
        System.out.println(fileLines.size());

        List<String> fileLines3 = new ArrayList<>(Arrays.asList("first line", "second line"));
        fileLines3.add("third line");
        Files.write(path, fileLines3, StandardOpenOption.APPEND);
    }
}
