package nl.lambda.excersises;
import nl.lambda.excersises.Person;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;
import java.util.*;

public class lambdaExcersisMain {

    static Logger log = LogManager.getLogger(lambdaExcersisMain.class);

    public static void main(String[] Args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 68),
                new Person("Lewis", "Caroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        log.info("UNSORTED:: "+people);
        log.info("\n\n");
        //log.info(people.toString());

        // 1: sort list by last name
        log.info("\n\n: LAMBDA SORT");
        Collections.sort(people, (p1, p2 )-> p1.getLastName().compareTo(p2.getLastName()));
        log.info("Sort list by lastname: "+people);
        //people.stream().forEach(System.out::println);


        // 2; print all elements in the list
        log.info("\n\n: LAMBDA SORT: p-> true");
        printConditionally(people, p -> true);

        // 3; print all elements in the list lastname startswith C
        log.info("\n\n: LAMBDA SORT: p-> p.getLastName().startsWith(\"C\")");
        printConditionally(people, p -> p.getLastName().startsWith("C"));


        log.info("\n\n: LAMBDA SORT: p-> p.getFirstName().startsWith(\"C\")");
        printConditionally(people, p -> p.getFirstName().startsWith("C"));

        log.info("\n\n: LAMBDA SORT: p-> p.getAge()<50");
        printConditionally(people, p -> p.getAge()<50);

    }


    private static void printConditionally (List<Person> people, Condition condition) {

        log.info("Method:printConditionally\n");
        log.info("Condition: "+condition.toString());
        for (Person p : people)
        {
            if (condition.test(p))
                log.info("printConditionally: "+p);
        }
    }

    interface Condition{
        boolean test(Person p);

    }

}
