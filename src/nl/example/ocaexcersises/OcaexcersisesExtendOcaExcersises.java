package nl.example.ocaexcersises;

//import static nl.example.ocaexcersises.OcaExcersises.*;


public class OcaexcersisesExtendOcaExcersises extends OcaExcersises {


    public static void oca_extends_testsame_package ()
    {
        // oca_extends_testsame_package: test accessible classes
        System.out.println("\n\n");
        System.out.println("***************************************************************");
        System.out.println("OcaexcersisesExtendOcaExcersises extends OcaExcersises        .");
        System.out.println("oca_extends_testsame_package: test accessible classes         .");
        System.out.println("***************************************************************");


        oca_accessModifierPublic();
        //oca_accessModifierPrivate();
        // red underlined + on mouse over => 'oca_accessModifierPrivate()' has private access in 'nl.example.ocaexcersises.OcaExcersises'
        //
        oca_accessModifierProtected();
        oca_access_test_samePackage_sameClass();


        OcaExcersises test1 = new OcaExcersises();

        test1.oca_accessModifierPublic();
        test1.oca_access_test_samePackage_sameClass();
        test1.oca_accessModifierProtected();
        // accessModifierPrivate is not available.



    }


}
