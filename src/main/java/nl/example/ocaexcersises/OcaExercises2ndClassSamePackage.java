package nl.example.ocaexcersises;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static nl.example.ocaexcersises.OcaExcersises.*;

public class OcaExercises2ndClassSamePackage {

    static Logger log = LogManager.getLogger(OcaExercises2ndClassSamePackage.class);

    public static void oca_access_test_samePackage_diffClass() {

        log.info("");
        // oca_access_test: test accessible classes
        System.out.println("\n\n");
        System.out.println("***************************************************************");
        System.out.println("oca_access_test: test accessible classes                      .");
        System.out.println("***************************************************************");


        System.out.println("\n\n");
        System.out.println("call from same package: different class");
        oca_accessModifierPublic();
        //oca_accessModifierPrivate();
        // when method changed to private, java compiler gave error.
        oca_accessModifierProtected();
        System.out.println("\n\n");
        System.out.println("***************************************************************");
    }



}
