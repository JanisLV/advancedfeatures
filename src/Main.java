import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Thread.sleep(1000l);
        Path relativePath = Paths.get("src/text.txt");
        List<String> fileLines = Files.readAllLines(relativePath);
        System.out.println(fileLines);
        int wordCount = 0;
        int specialCharCounter = 0;
        int findWordCounter = 0;
        String find = "Lorem";
        for (String fileLine : fileLines) {
            String[] s = fileLine.split(" ");
            for (String s1 : s) {
                if (s1.equals(find)) {
                    findWordCounter++;

                }
            }
            wordCount += s.length;
            for (int i = 0; i < fileLine.length(); i++) {
                if (fileLine.charAt(i) == '.'
                        || fileLine.charAt(i) == ' '
                        || fileLine.charAt(i) == ','
                        || fileLine.charAt(i) == '0') {
                    specialCharCounter++;
                }
            }
        }
        System.out.println(findWordCounter);
        System.out.println(wordCount);
        System.out.println(specialCharCounter);


    }
}
