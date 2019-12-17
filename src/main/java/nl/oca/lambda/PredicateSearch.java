package nl.oca.lambda;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateSearch {

    static Logger log = LogManager.getLogger(PredicateSearch.class);

    public static void mainPredicateSearch(String[] Args){
        log.info("********** start mainPredcateSearch");
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));

        print(animals, a -> a.canHop());
        log.info("********** close mainPredcateSearch");
    }


    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        log.info("********** start PredcateSearchPrint");
        for (Animal animal : animals) {
            if (checker.test(animal))
                log.info("Checker: " + checker + "; animal: " + animal + "; hopper: "+animal.canHop()+ "; swimmer: "+animal.canSwim());
        }

        log.info("********** close PredcateSearchPrint");
    }
}
