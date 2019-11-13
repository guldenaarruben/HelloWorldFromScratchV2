package nl.oca.pond.swan;

import nl.oca.pond.shore.Bird;

public class Swan extends Bird {

    public void swim() {
        floatInWater();
        System.out.println(text);

    }


    public void helpOtherSwanSwim() {
        Swan other = new Swan();
        other.floatInWater();
        other.swim();
        System.out.println(other.text);

    }


    public void helpOtherBirdSwim () {
        Bird other = new Bird();
        //other.floatInWater(); ==> not available here.
    }
}
