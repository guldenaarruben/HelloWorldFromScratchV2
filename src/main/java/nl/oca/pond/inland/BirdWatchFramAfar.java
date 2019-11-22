package nl.oca.pond.inland;

import nl.oca.pond.shore.Bird;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BirdWatchFramAfar {

    static Logger log = LogManager.getLogger(BirdWatchFramAfar.class);

    public void WatchBird(){

        log.info("");
        Bird bird = new Bird();
        //bird.floatInWater(); => not possible.
    }

}
