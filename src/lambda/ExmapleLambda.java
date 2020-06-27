package lambda;

import com.company.Person;

import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ExmapleLambda {

    public void personExample() {
        Person johnSmith = new Person("John", "Smith", 15);

        Predicate<Person> adultPersonTest = johnSmith::isAdult;
        System.out.println(adultPersonTest.test(johnSmith));


        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt();
        int randomNumber = randomNumberSupplier.get();

        Operator op = (x1,x2) -> {
            int result = x1+x2;
            System.out.println(result);
//            return;
        };
        op.test(1,2);


    }
}
