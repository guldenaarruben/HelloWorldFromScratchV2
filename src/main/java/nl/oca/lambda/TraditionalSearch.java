package nl.oca.lambda;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.*;

public class TraditionalSearch {

    static Logger log = LogManager.getLogger(TraditionalSearch.class);

    public static void mainTraditionalSearch(String [] Args) {

        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        log.info("********** => print(animals, new CheckIfHopper()); ");
        print(animals, new CheckIfHopper());        // pass class that does the check

        log.info("********** => print(animals, a -> a.canSwim()); ");
        print(animals, a -> a.canSwim());

        log.info("********** => print(animals, a -> a.canHop());");
        print(animals, a -> a.canHop());

    }

    private static void print(List<Animal> animals, CheckTrait checker) {

        log.info("print: START");
        for(Animal animal : animals) {
            log.info("For lus: " + animal.toString() + ", "+ animal.canHop() +", " + animal.canSwim());
            if (checker.test(animal))                   // the general check
                log.info("TRUE:" + animal + " ");
        }
        System.out.println();
        log.info("print: END");
    }
}
