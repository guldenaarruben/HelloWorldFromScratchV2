package nl.lambda.excersises;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class java7Solution {


        static Logger log = LogManager.getLogger(nl.lambda.excersises.lambdaExcersisMain.class);

        public static void main(String[] Args) {


            List<Person> people = Arrays.asList(
                    new Person("Charles", "Dickens", 68),
                    new Person("Lewis", "Caroll", 42),
                    new Person("Thomas", "Carlyle", 51),
                    new Person("Charlotte", "Bronte", 45),
                    new Person("Matthew", "Arnold", 39)
            );

            log.info(people);
            log.info("\n\n: LAMBDA SORT");
            Collections.sort(people, (p1, p2 )-> p1.getLastName().compareTo(p2.getLastName()));
            log.info(people.toString());

            Collections.sort(people, new Comparator<Person>() {

                @Override
                public int compare(Person o1, Person o2) {
                    return o1.getLastName().compareTo(o2.getLastName());
                }

            });

            printAll(people);

            printAllLastnameStartWithC(people);

            printConditionally(people, new Condition(){

                @Override
                public boolean test(Person p) {
                    return p.getLastName().startsWith("C");
                }
            });





            log.info(people);

            Collections.sort(people, Comparator.comparing((Person person) -> person.getLastName().startsWith("C")));
            people.stream().forEach(System.out::println);
            //people.sort(Comparator.comparing(people..getlastName).thenComparing(Compartor.comparing(people::firstName));

            //log.info(Person -> person.getLastName().startsWith("C"));

            // Collections.sort(people, Comparator.comparing((Person person) -> person.getLastName()));
            // people.stream().forEach(System.out::println);

            //log.info(person -> person.getLastName().startsWith("C"));


            // 1: sort list by last name
            // 2; print all elements in the list
            // 3; print people with last names with C.
        }


        private static void printConditionally (List<Person> people, Condition condition) {

        log.info("Method:printConditionally\n");
        for (Person p : people)
            {
                if (condition.test(p))
                    log.info("printConditionally: "+p);
            }
        }

        interface Condition{
            boolean test(Person p);

    }

        private static void printAll (List<Person> people) {

            log.info("Method:PrintAll\n");
            for (Person p : people)
            {
                log.info("printAll: "+p);
            }
        }

    private static void printAllLastnameStartWithC (List<Person> people) {

        log.info("Method:printAllLastnameStartWithC\n");
        for (Person p : people)
        {
            if (p.getLastName().startsWith("C"))
            log.info("printAllLastnameStartWithC: "+p);
        }
    }

    }


