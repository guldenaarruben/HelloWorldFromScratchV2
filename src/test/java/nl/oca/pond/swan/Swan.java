package nl.oca.pond.swan;

import nl.oca.pond.shore.Bird;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Swan extends Bird {

    static Logger log = LogManager.getLogger(Bird.class);

    public void swim() {

        log.info("");
        floatInWater();
        System.out.println(text);

    }


    public void helpOtherSwanSwim() {
        log.info("");
        Swan other = new Swan();
        other.floatInWater();
        other.swim();
        System.out.println(other.text);

    }


    public void helpOtherBirdSwim () {
        log.info("");
        Bird other = new Bird();
        //other.floatInWater(); ==> not available here.
    }
}
