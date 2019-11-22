package nl.oca.pond.shore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Bird {

    static Logger log = LogManager.getLogger(Bird.class);

    protected String text = "floating";
    protected void floatInWater() {
        System.out.println(text);
    }
}
