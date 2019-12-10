package nl.oca.pond.shore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bird {

    static Logger log = LogManager.getLogger(Bird.class);
    static String tab = "";

    static {
        log.info("Static; log.info + =====>>>> Begin class Bird; START initializer");
        log.info("Static; log.info + =====>>>> add(1)");
        add(1, "static, initializer", tab);
    }

    static int count = 0;
    protected String text = "floating2";

    static {
        log.info("Static; log.info + =====>>>> add(2)");
        add(2, "static, initializer", tab);
    }

//    static void add(int num, String soortAanroep) {
//        /*System.out.print("[add] print static void: " + num +"\n")*/;
//        log.info("[\\add] log.info static void: add("+ num + ") Aanroep vanuit: " + soortAanroep  ); }

    static void add(int num, String soortAanroep, String tab) {
        /*System.out.print("[add] print static void: " + num +"\n")*/;
        log.info(tab + "[\\add] log.info static void: add("+ num + ") Aanroep vanuit: " + soortAanroep  ); }

    //Bird() {add(5);};
    {add(3, "non static, initializer", tab);}
    static { log.info("Static; log.info + new Bird()  "); new Bird(); }
    static { log.info("Static; log.info + new Bird(String)  "); new Bird("Bird(string) aangeroepen vanuit static initializer"); }
    {add(4, "non static, initializer", tab);}



    static {
        log.info("Static; log.info + =====>>>> Begin class Bird; END initializer");
        add(1, "static, initializer", tab);
    }


    // overloading the constructor, in case no parameter is send.
    public Bird () {

        String tab = "\t";
        log.info(tab + "Bird(); Constructor START: ");
        String text2 = "Zonder aanroep gegevens." ;
        //System.out.println(text2);
        log.info(tab + "Bird(); text: "+ text2);
        count ++;
        log.info(tab + "Bird(); Bird..count: "+count);
        log.info(tab + "Bird(); Constructor; + add(5)"); add(5, "constructor", tab);
        log.info(tab + "Bird(); Constructor END: ");
    }

    public Bird (String aanroep) {
        String tab = "\t\t";
        log.info(tab + "Bird(s); Constructor START: ");
        String text2 = aanroep;
        log.info(tab + "Bird(s); text: "+ text2);
        count ++;
        log.info(tab + "Bird(s); Bird.s.count: "+count);
        log.info(tab + "Bird(s); Constructor; + add(6)"); add(6, "constructor", tab);
        log.info(tab + "Bird(s); Constructor END: ");
    }


    protected void floatInWater() {
        log.info("floatInWater: " +text);
    }


    public void fly () {
        log.info("Fly!!!");
    }



}
