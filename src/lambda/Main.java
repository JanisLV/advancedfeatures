package lambda;

import com.company.Person;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
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

        float one = 1;
        float two = 2;
        Operator op = (x1, x2) -> {
            return x1 + x2;
        };
        float result = op.test(one, two);
        op = (x1, x2) -> x1 - x2;
        result = op.test(two,one);
        op = (x1, x2) -> x1 * x2;
        op = (x1, x2) -> x1 / x2;

        List<Integer> numbers = new ArrayList<>(List.of(
           1,2,3,4,5,6,7
        ));

        op = (x1, x2) -> {
            return x1 + x2;
        };
        float sum = 0;
        for (Integer number : numbers) {
            sum = op.test(sum, number);
        }
        System.out.println(sum);

        List<String> text =
                List.of("test","even more test");

        text.sort(String::compareToIgnoreCase);
        text.size();

        Function<List<String>, Integer> stringListLengthFunction = s -> s.size();
        System.out.println(stringListLengthFunction.apply(List.of("ABCDE")));

    }


}
