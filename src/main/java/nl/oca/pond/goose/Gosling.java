package nl.oca.pond.goose;

import nl.oca.pond.shore.Bird;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Gosling extends Bird {

    static Logger log = LogManager.getLogger(Gosling.class);
    public void swim() {

        log.info("");
        floatInWater();
        System.out.println(text);




    }

}
