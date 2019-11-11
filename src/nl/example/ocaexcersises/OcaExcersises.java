package nl.example.ocaexcersises;

import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OcaExcersises {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static void oca_increment_and_decrement_operators() {
        // Increment and decrement operators.
        System.out.println("\n\n");
        System.out.println("*************************************************************************");
        System.out.println("oca_increment_and_decrement_operators: Increment and decrement operators.");
        System.out.println("*************************************************************************");

        // OCA: page 58 , 59
        System.out.println("OCA: Modulo");
        System.out.println("OCA: Modulo: 11%3 ");
        System.out.println(11 % 3);
        System.out.println("OCA: Modulo: -11%3 ");
        System.out.println(-11 % 3);


        int x = 3;
        System.out.println("x= " + x);
        int a = ++x;
        System.out.println("x= " + x);
        System.out.println("a=++x= " + a);
        System.out.println("x= " + x);
        int b = x--;
        System.out.println("x= " + x);
        System.out.println("b=x--= " + b);
        System.out.println("x= " + x);
        int c = --x;
        System.out.println("x= " + x);
        System.out.println("c=--x= " + c);
        System.out.println("x= " + x);

        System.out.println("--x= " + c);
        System.out.println("x= " + x);

        x = 3;
        int y = ++x * 5 / x-- + --x;

        System.out.println("x= " + x);
        System.out.println("y= " + y);


    }


    public static void while_end_of_short() {
        // While: end of short.
        System.out.println("\n\n");
        System.out.println("****************************************");
        System.out.println("while_end_of_short: While: end of short.");
        System.out.println("****************************************");

        short teller = 0;
        int telNul = 0;
        int overflow = 0;
        int telSwitchSign = 0;

        // bij bewerken wordt short naar int gecast en kan dus tot 32767
        while (telNul < 2 && overflow < 33000) {
            System.out.println("Teller: " + teller);
            System.out.println("Teller: " + teller);
            if (teller == -32766)
                System.out.println("Teller: " + teller);

            if ((teller < 0) && (teller - 1) > 0)
                telSwitchSign++;
            // binnen deze if wordt wel doorgeteld. En is de wrap-around nog niet zichtbaar. Pas bij "teller--" statement in de volgende regeld vind de wraparound plaats.


            teller--;
            overflow++;
            if (teller == 0)
                telNul++;


            System.out.println("Teller: " + teller);
            System.out.println("telNul: " + telNul);
            System.out.println("telSwitchSign: " + telSwitchSign);
            System.out.println("overflow: " + overflow);


        }

    }


    public static void for_each_test() {
        // Flow control: for each.
        System.out.println("\n\n");
        System.out.println("****************************************");
        System.out.println("for_each_test: Flow control: for each.  ");
        System.out.println("****************************************");

        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";

        for (String name : names) {
            System.out.println(name + ", ");
        }


        java.util.ArrayList<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        System.out.println(values);
        values.add("Kevin");
        System.out.println(values);
        values.add("Roger");
        System.out.println(values);

        for (String value : values) {
            System.out.println(value + ", ");
        }


        String[] names2 = new String[3];
        for (String name2 : names2) {
            System.out.println(name2 + ", ");

        }
    }

    public static void understanding_advanced_flow_control() {
        // Advanced flow control.
        System.out.println("\n\n");
        System.out.println("*********************************************************************");
        System.out.println("oca_Searunderstanding_advanced_flow_control: Advanced flow control.  ");
        System.out.println("*********************************************************************");


        int[][] myComplexArray = {{5, 2, 1, 3}, {3, 9, 8, 9}, {5, 7, 12, 7}};

        for (int[] mySimpleArray : myComplexArray) {
            for (int i = 0; i < mySimpleArray.length; i++) {
                System.out.println(mySimpleArray[i] + "\t");
            }
        }

        System.out.println("end");
    }

    public static void oca_SearchSample() {
        // Search with loop.
        System.out.println("\n\n");
        System.out.println("*************************************");
        System.out.println("oca_SearchSample: Search with loop.  ");
        System.out.println("*************************************");

        // int [][] list  = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        int[][] list = {{1, 13, 5}, {1, 2, 5}, {2, 7, 2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        System.out.println("oca_SearchSample : A");


        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                System.out.println("A Value " + list[i][j] + " at: " + "{" + i + "," + j + ")");
//                System.out.println("A Value "+list[i][j]+" found at: "+ "{"+positionX+","+positionY+")");
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    System.out.println("Break!!!! A: ");
                    break PARENT_LOOP;
                }

            }
        }
        if (positionX == -1 || positionY == -1) {
            System.out.println("A Value " + searchValue + " not found");
        } else {
            System.out.println("A Value " + searchValue + " found at: " + "{" + positionX + "," + positionY + ")");
        }


/////////////////////////////////
        System.out.println("oca_SearchSample : B");
        searchValue = 2;
        positionX = -1;
        positionY = -1;


        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list[i].length; j++) {
                System.out.println("B in J LOOP Value " + list[i][j] + " at: " + "{" + i + "," + j + ")");
//                System.out.println("B Value "+list[i][j]+" found at: "+ "{"+positionX+","+positionY+")");

                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    System.out.println("Break!!!! B: ");

                    break;
                }
            }

        }
        if (positionX == -1 || positionY == -1) {
            System.out.println("B Value " + searchValue + " not found");
        } else {
            System.out.println("B Value " + searchValue + " found at: " + "{" + positionX + "," + positionY + ")");
        }//


        /////////////////////////////////
        System.out.println("oca_SearchSample : C");
        searchValue = 2;
        positionX = -1;
        positionY = -1;


        PARENT_LOOP:
        for (int i = 0; i < list.length; i++) {

            for (int j = 0; j < list[i].length; j++) {
                System.out.println("C in J LOOP Value " + list[i][j] + " at: " + "{" + i + "," + j + ")");
//                System.out.println("B Value "+list[i][j]+" found at: "+ "{"+positionX+","+positionY+")");

                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    System.out.println("Break!!!! C: no break");

                    //break ;
                }
            }

        }
        if (positionX == -1 || positionY == -1) {
            System.out.println("C Value " + searchValue + " not found");
        } else {
            System.out.println("C Value " + searchValue + " found at: " + "{" + positionX + "," + positionY + ")");
        } //

        System.out.println("\n\n; Continue statement: outer/first loop\n");

        FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            System.out.print(ANSI_RED + " outer" + ANSI_RESET + " loop Continue; values:  " + a + "\n");
            for (char x = 'a'; x <= 'c'; x++) {
                System.out.print(" inner loop Continue; values:  " + a + x + "\n");
                if (a == 2 || x == 'b') {
                    System.out.print(" IF Continue; CONTINUE; values:  " + a + x + "\n");
                    continue FIRST_CHAR_LOOP;
                }
                //  continue ;
                System.out.print("NO continue triggered; first char loop:  " + a + x + "\n");
            }
        }

        System.out.println("\n\n; Continue statement: inner loop\n");
        B_FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            System.out.print(ANSI_RED + " Outer " + ANSI_RESET + "loop Continue; values:  " + a + "\n");
            for (char x = 'a'; x <= 'c'; x++) {
                System.out.print(" Inner loop Continue; values:  " + a + x + "\n");
                if (a == 2 || x == 'b') {
                    //       continue FIRST_CHAR_LOOP;
                    System.out.print(" IF Continue; CONTINUE; values:  " + a + x + "\n");
                    continue;
                }
                System.out.print("NO continue triggered; inner char loop:  " + a + x + "\n");
            }
        }


        System.out.println("\n\n; Break statement: outer loop\n");

        BREAK_FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            System.out.print(ANSI_RED + " outer" + ANSI_RESET + " loop; values:  " + a + "\n");
            for (char x = 'a'; x <= 'c'; x++) {

                System.out.print(" inner loop; values:  " + a + x + "\n");
                if (a == 2 || x == 'b') {
                    System.out.print(" BREAK; IF values; BREAK; :  " + a + x + "\n");
                    break BREAK_FIRST_CHAR_LOOP;
                }
                System.out.print(" NO Break; first char loop:  " + a + x + "\n");
            }
        }


        System.out.println("\n\n; Break statement: inner loop\n");

        B_BREAK_FIRST_CHAR_LOOP:
        for (int a = 1; a <= 4; a++) {
            System.out.print(ANSI_RED + " outer" + ANSI_RESET + " loop; values:  " + a + "\n");
            for (char x = 'a'; x <= 'c'; x++) {

                System.out.print(" inner loop; values:  " + a + x + "\n");
                if (a == 2 || x == 'b') {
                    // break BREAK_FIRST_CHAR_LOOP;
                    System.out.print(" Break; IF; BREAK: :  " + a + x + "\n");
                    break;
                }
                System.out.print(" Break; inner loop char loop:  " + a + x + "\n");
            }
        }


        for (int i = 0; i < 10; ) {
            //i = i++;
            i++;
            System.out.println(i + "; ");
            System.out.println("Hello World \n");

        }


    }


    public static void oca_Strings() {
        // Strings
        System.out.println("\n\n");
        System.out.println("*************************************");
        System.out.println("oca_Strings: Strings Stringbuilder.  ");
        System.out.println("*************************************");

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);


        String s = "purr";
        System.out.println("\n\n");
        System.out.println(s);
        s += " test";  // wordt nieuw object gecreerd waar de waarde ingezet wordt.
        System.out.println(s);

        //StringBuilder b = "rumble";  /// not allowed
        StringBuilder b = new StringBuilder("rumble");
        b.append(4).deleteCharAt(3).delete(3, b.length() - 1);
        s = "stringbuilder";
        System.out.println("\n\n");
        System.out.println(s);
        System.out.println(b);


    }

    public static void oca_Arrays() {
        //Arrays
        System.out.println("\n\n");
        System.out.println("*************************************");
        System.out.println("oca_Arrays: Arrays.                  ");
        System.out.println("*************************************");
        //int[] numbers = {2,4,6,8};
        int[] numbers = {12, 2, 4, 19, 6, 8};

        int result;

        for (int number : numbers) {

            System.out.println("Waarde:" + number);
        }
        Arrays.sort(numbers);
        for (int number : numbers) {

            System.out.println("Waarde:" + number);
        }

        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));


        int[][] twoD = new int[3][2];
        for (int i = 0; i < twoD.length; i++) {
            for (int j = 0; j < twoD[i].length; j++) {
                System.out.println(twoD[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] inner : twoD) {
            for (int num : inner) {
                System.out.println(num);

            }
        }

    }

    public static void oca_arrays_verify_else_insert(int[] intArray, int value) {
        //Arrays.


    }


    public static void oca_ArraysList() {
        //ArrayList and List
        System.out.println("\n\n");
        System.out.println("*************************************");
        System.out.println("oca_ArraysList: ArrayList and List.  ");
        System.out.println("*************************************");

        List<String> birds = new ArrayList<>();
        birds.add("Hawk");
        birds.add(1, "Robin");
        birds.add(0, "Blue jay");
        birds.add(1, "Cardinal");
        System.out.println(birds);

        birds.add("Hawk");
        System.out.println(birds.remove("test"));
        System.out.println(birds.remove("Robin"));
        System.out.println(birds);

        System.out.println(birds.remove("Hawk"));
        System.out.println(birds.remove(2));
        System.out.println(birds);
        System.out.println(birds.size());
        birds.set(1, "Ruben");
        System.out.println(birds);
        System.out.println(birds.size());


        // Converting between array an list
        ArrayList<String> ALTest = new ArrayList<>();
        ALTest.add("Laptop");
        ALTest.add("Desktop");

        String[] stringArray1 = ALTest.toArray(new String[0]);

        System.out.println(stringArray1.length);
        System.out.println(stringArray1);


        for (String waarde : stringArray1) {
            System.out.print(waarde);
        }


        String[] array = {"hawk", "robin", "light"};
        List<String> list = Arrays.asList(array);

        System.out.print("\narray object: " + array);
        System.out.print("\nlist object: " + list);
        System.out.print("\n\n");


        // list
        List<String> list2 = new ArrayList<String>();
        list2.add("one");
        list2.add("two");
        list2.add("seven");

        for (String q : list2) {
            System.out.println(q + " ");

        }
    }


    public static void oca_dateTime() {
        //Manipulating date time
        System.out.println("\n\n");
        System.out.println("*************************************");
        System.out.println("oca_dateTime: Manipulating date time.");
        System.out.println("*************************************");
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime);

        oca_workingWithPeriods();

    }


    public static void oca_workingWithPeriods() {
        LocalDate start = LocalDate.of(2015, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2015, Month.MARCH, 30);
        //Period period = Period.ofMonths(1);
        Period period = Period.ofWeeks(2);
        oca_workingWithPeriods_performAnimalEnrichment(start, end, period);
    }

    public static void oca_workingWithPeriods_performAnimalEnrichment(LocalDate start, LocalDate end, Period period) {
        LocalDate upTo = start;

        while (upTo.isBefore(end)) {    // check if still before end
            System.out.println("Give new toy: " + upTo);
            upTo = upTo.plus(period);
        }
    }

    public static void oca_accessModifierPublic() {
        // oca_accessModifierPublic: accessible from any class.
        System.out.println("\n\n");
        System.out.println("*****************************************************");
        System.out.println("oca_accessModifierPublic: accessible from any class. ");
        System.out.println("*****************************************************");

    }

    private static void oca_accessModifierPrivate() {
        // oca_accessModifierPrivate: accessible from this class.
        System.out.println("\n\n");
        System.out.println("******************************************************");
        System.out.println("oca_accessModifierPrivate: accessible from this class.");
        System.out.println("******************************************************");

    }


    protected static void oca_accessModifierProtected() {
        // oca_accessModifierProtected: accessible from classes in the same package.
        System.out.println("\n\n");
        System.out.println("*************************************************************************");
        System.out.println("oca_accessModifierProtected: accessible from classes in the same package.");
        System.out.println("*************************************************************************");

    }

    public static void oca_access_test_samePackage_sameClass() {

        System.out.println("\n\n");
        System.out.println("*************************************************************************");
        System.out.println("call from same package and same class");
        oca_accessModifierPublic();
        oca_accessModifierPrivate();
        oca_accessModifierProtected();
        System.out.println("\n\n");
        System.out.println("***************************************************************");


    }

}