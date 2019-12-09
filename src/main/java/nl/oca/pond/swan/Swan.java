package nl.oca.pond.swan;

import nl.oca.pond.shore.Bird;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// because of Extends there is also created an instance of Bird.
public class Swan extends Bird {

    static Logger log = LogManager.getLogger(Bird.class);

    static int count=0;

    // constructor
    public Swan (){
        count++;                            // counts instances of Swan
        log.info("Swan count: "+ count);
    }

    public void swim() {

        log.info("Swan.swim");
        floatInWater();
        System.out.println(text);

    }

    public int  getCount() {
        return count;
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
