package nl.example.ocaexcersises;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class oca_Static {

    static Logger log = LogManager.getLogger(oca_Static.class);

    private static String name = "Static class";
    public static void first() {}
    public static void second() {}
    public void third () { System.out.println(name); //log.debug(name);
        }

    public static void mainStatic (String args[]) {
        first();
        second();
        //  third();  // doe snot compile
        new oca_Static().third();
        //third();

        log.info("mainStatic");
        log.debug("mainStatic");

    }

}
