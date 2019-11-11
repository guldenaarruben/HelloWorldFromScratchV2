package nl.example.ocaexcersises;

import static nl.example.ocaexcersises.OcaExcersises.*;

public class OcaExcersises2ndClassSamePackage {

    public static void oca_access_test_samePackage_diffClass() {
        // oca_access_test: test accessible classes
        System.out.println("\n\n");
        System.out.println("***************************************************************");
        System.out.println("oca_access_test: test accessible classes                      .");
        System.out.println("***************************************************************");


        System.out.println("\n\n");
        System.out.println("call from same package: different class");
        oca_accessModifierPublic();
        // oca_accessModifierPrivate();
        // when method changed to private, java compiler gave error.
        oca_accessModifierProtected();
        System.out.println("\n\n");
        System.out.println("***************************************************************");
    }


}
