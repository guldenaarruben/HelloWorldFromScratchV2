package nl.example.ocaexcersises;

public class OcaExcersises {


    public static void oca_increment_and_decrement_operators() {
        // page 58 , 59
        System.out.println ("OCA: Modulo");
        System.out.println ("OCA: Modulo: 11%3 ");
        System.out.println ( 11 %3);
        System.out.println ("OCA: Modulo: -11%3 ");
        System.out.println ( -11 %3);


        int x = 3;
        System.out.println ("x= "+ x);
        int a= ++x;
        System.out.println ("x= "+ x);
        System.out.println ("a=++x= "+a);
        System.out.println ("x= "+ x);
        int b = x--;
        System.out.println ("x= "+ x);
        System.out.println ("b=x--= "+b);
        System.out.println ("x= "+ x);
        int c = --x;
        System.out.println ("x= "+ x);
        System.out.println ("c=--x= "+c);
        System.out.println ("x= "+ x);

        System.out.println ("--x= "+c);
        System.out.println ("x= "+ x);

        x = 3;
        int y = ++x * 5 / x-- + --x;

        System.out.println ("x= "+ x);
        System.out.println ("y= "+ y);


    }
}
