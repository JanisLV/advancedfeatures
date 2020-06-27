package lambda;

import com.company.Person;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> testString = s -> s.length() > 0;

        Runnable myRunnable = () -> System.out.println("Running a runnable");
        myRunnable.run();
        Predicate<String> startsWithABCTest = s -> s.startsWith("ABC");
        System.out.println(startsWithABCTest.test("ABCDEF"));

        Function<String, Integer> stringLengthFunction = s -> s.length();
        System.out.println(stringLengthFunction.apply("ABCDE"));

        ExmapleLambda e = new ExmapleLambda();
        e.personExample();


    }


}
