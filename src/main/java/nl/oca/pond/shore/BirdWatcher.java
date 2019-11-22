package nl.oca.pond.shore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BirdWatcher {

    static Logger log = LogManager.getLogger(Bird.class);

    public void watchBird () {

        log.info("");
        Bird bird = new Bird();
        bird.floatInWater();

        System.out.println(bird.text);


    }
}
