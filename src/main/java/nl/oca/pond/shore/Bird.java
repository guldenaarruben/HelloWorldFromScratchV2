package nl.oca.pond.shore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bird {

    static Logger log = LogManager.getLogger(Bird.class);
    static int count = 0;
    protected String text = "floating2";

    public Bird (String aanroep) {
        String text2 = aanroep;
        log.info("text: "+ text2);
        System.out.println(text2);
        count ++;
        log.info("Bird.s.count: "+count);
    }

    // overloading the constructor, in case no parameter is send.
    public Bird () {
        String text2 = "Zonder aanroep gegevens." ;
        System.out.println(text2);
        log.info("text: "+ text2);
        count ++;
        log.info("Bird..count: "+count);
    }


    protected void floatInWater() {
        System.out.println(text);
    }


    public void fly () {
        log.info("Fly!!!");
    }



}
