package nl.example.ocaexcersises;

public class Gorilla {

    public static int count;
    public static void addGorilla() {count++;}
    public void babyGorilla() {count++;}
    public void announceBabies () {
        addGorilla();
        babyGorilla();
    }

    public static void announceBabiesToEveryone() {
        addGorilla();
        // babyGorilla(); // does not compile  // static method cant call instance method

    }

    public int total;
    //public static double average = total / count;   // does not compile   // static cant use instance variable

}
