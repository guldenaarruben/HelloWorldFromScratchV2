package nl.oca.lambda;


public class CheckIfHopper implements CheckTrait {

    public boolean test(Animal a) {
        return a.canHop();
    }


}
