package com.example.helloworldfromscratchv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static nl.example.ocaexcersises.OcaExcersises.oca_increment_and_decrement_operators;


/*  Guide:

    Use JDK 12.0.2

    Included in GIT:
        /.idea/encodings.xml
        /.idea/misc.xml
        /.idea/modules.xml
        /.iea/vcs.xml
        .gitignore
        ==> contains:
            /.idea => everything is left out when not explicit added.
            /out
*/

public class HelloWorldFromScratchV2 {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

/*
    public static void main(String[] args) {
        System.out.print("Hello World From Scratch V2 \n");
        System.out.print("Added with sogeti laptop: Ruben \"Ruben (sog laptop)\"\n");

    }
*/

    public static void main(String[] args) {




        System.out.println("test: HelloWorldFromScratch");
        // used: https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html
        //
        // --------- setup your java/intellij/maven/subversion local environment
        // 1) installed the JDK
        // 2) create directory structure
        //    *  c:\DEV\
        //    *  C:\DEV\maven\apache-maven-3.6.1    // is installation of maven; on installation "apache-maven-x.x.x" is being created
        //    *  C:\DEV\maven\repo                  // local repo
        //    *  C:\DEV\SVNRepository               // going to be used for local subversion repo
        //    *  C:\DEV\Workspace\Trunk             // map for creating projectmaps like 'HelloWorldFromScratch' and checkout specific project from VCS( eg subversion)
        //    *  C:\DEV\Workspace\Branch            // map for creating projectmaps like 'HelloWorldFromScratch' and checkout specific project from VCS( eg subversion)
        //
        // 3) install maven in "C:\DEV\maven\apache-maven-3.6.1"
        // 4) install TortoiseSVN
        // 5a) add Windows environment variables
        //      create "windows: environment variables" \\ if it is not found, it can be a different version of windows 10 (pro or something), or it can be disabled by the system admin
        //      Windows 10 \ 'Start' \ Settings \ System Info \ Advanced Settings \ Environment variables
        //      * JAVA_HOME     = "C:\Program Files\Java\jdk-12.0.2"  // insert without quotes ; location where JDK is installed during step 1//value can be updated to newer version locations.
        //      * M2_HOME       = "C:\DEV\maven\apache-maven-3.6.1"
        //      * MAVEN_HOME    = "C:\DEV\maven\apache-maven-3.6.1"
        // 5b) add to your path:
        //      * "%JAVA_HOME%\bin"                     // without quotes
        //      * "%M2_HOME%\bin"                       // without quotes
        //      * "C:\Program Files\TortoiseSVN\bin"    // without quotes // location where SVN is installed during step 4
        // 6) create local SVN repository
        //      A) file explorer
        //      B) go to map "C:\DEV"
        //      C) select the previous by you created (step2) map "SVNRepository"
        //      D) mouse-right-button \ pop-up \ TortoiseSVN \ Create repository here  ==> this map is made to a SVN repository
        // 7a) Intellij environment
        //      A) maven settings
        //          * CTRL-SHIFT-A :"maven settings" or "File \ Settings \ Build, Execution, Deployment \ Build tools \ Maven"
        //              * "Maven home directory": "C:/DEV/maven/apache-maven-3.6.1"
        //              * "User setting file": "C:\DEV\maven\apache-maven-3.6.1\conf\settings.xml"      // zie settings.xml voor configs
        //              * "Local repository": "C:\DEV\maven\repo"
        //  7b) Intellij plugins: File \ Settings\ Plugin
        //          * if no plugins are displayed, there is probably no connection to internet.
        //          * if you are behind a proxy, add the proxy; "plugins \ tab 'service'-button "
        //          * if you have added a proxy and it still does not work. You can try to creat an px-proxy. Configure the proxy in the px.proxy, and px.proxy in intellij \ plugin \ proxy settting
        //          * in case youo want to work with cucumber:
        //              A) add: plugin gherking
        //              B) add: plugin cucumber for java
        //
        // 8) settings.xml
        //  * location: "C:\DEV\maven\apache-maven-3.6.1\conf\settings.xml"
        //      A) <localRepository>C:\DEV\Maven\repo\</localRepository>
        //      B) add proxy if you are behind a proxy. (if e.g. the maven repository (on internet) can't be reached)
        //
        //  misc 1: change repository url, but same repository:
        //  a) go to project dir
        //  b) svn relocate old_location new_location
        //  c) svn relocate svn://192.168.178.17/HelloWorldFromScratch/Trunk svn://127.0.0.1/HelloWorldFromScratch/Trunk
        //  d) chek \project\.idea\misx.xml => check urls; change if required; i have done this before step c. But probably step 'c' takes care of that.
        //

        System.out.println("used: https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html");


        System.out.println ("svn");
        System.out.println ("1) https://subversion.apache.org/quick-start");

        System.out.println ("svn://192.168.178.17");


        // svn quickstart
        // https://subversion.apache.org/quick-start
        // https://en.wikibooks.org/wiki/Subversion/Setting_up_server_under_Windows
//        Start the server service
//        sc create SVNserve binpath= "C:\Program Files\TortoiseSVN\bin\svnserve.exe --service --root \"C:\DEV\SVNRepository"" displayname= "Subversion Repository" depend= Tcpip start= auto
//        Start the service:
//        net start SVNserve
        // http://svnbook.red-bean.com/en/1.8/svn.serverconfig.svnserve.html



// extra comment test svn

        oca_increment_and_decrement_operators();
        //while_end_of_short();
        for_each_test();
        understanding_advanced_flow_control();
        oca_SearchSample();
        oca_Strings () ;
        oca_Arrays();
        oca_ArraysList();
    }

//    public static void oca_increment_and_decrement_operators() {
//        // page 58 , 59
//        System.out.println ("OCA: Modulo");
//        System.out.println ("OCA: Modulo: 11%3 ");
//        System.out.println ( 11 %3);
//        System.out.println ("OCA: Modulo: -11%3 ");
//        System.out.println ( -11 %3);
//
//
//        int x = 3;
//        System.out.println ("x= "+ x);
//        int a= ++x;
//        System.out.println ("x= "+ x);
//        System.out.println ("a=++x= "+a);
//        System.out.println ("x= "+ x);
//        int b = x--;
//        System.out.println ("x= "+ x);
//        System.out.println ("b=x--= "+b);
//        System.out.println ("x= "+ x);
//        int c = --x;
//        System.out.println ("x= "+ x);
//        System.out.println ("c=--x= "+c);
//        System.out.println ("x= "+ x);
//
//        System.out.println ("--x= "+c);
//        System.out.println ("x= "+ x);
//
//        x = 3;
//        int y = ++x * 5 / x-- + --x;
//
//        System.out.println ("x= "+ x);
//        System.out.println ("y= "+ y);
//
//
//    }

    public static void while_end_of_short (){
        short teller = 0;
        int telNul =0;
        int overflow=0;
        int telSwitchSign=0;

        // bij bewekren wordt shot naar int gecast en kan dus tot 32767
        while (telNul < 2 && overflow < 33000)
        {
            System.out.println("Teller: "+teller);
            System.out.println("Teller: "+teller);
            if (teller == -32766)
                System.out.println("Teller: "+teller);

            if ((teller<0) && (teller-1) > 0)
                telSwitchSign++;
            // binnen deze if wordt wel doorgeteld. En is de wrap-around nog niet zichtbaar. Pas bij "teller--" statement in de volgende regeld vind de wraparound plaats.


            teller--;
            overflow++;
            if (teller == 0)
                telNul++;


            System.out.println("Teller: "+teller);
            System.out.println("telNul: " + telNul);
            System.out.println("telSwitchSign: " + telSwitchSign);
            System.out.println("overflow: " + overflow);


        }

    }


    public static void for_each_test () {
        final String [] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";

        for (String name : names )
        {
            System.out.println(name + ", ");
        }



        java.util.ArrayList<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        System.out.println(values);
        values.add("Kevin");
        System.out.println(values);
        values.add("Roger");
        System.out.println(values);

        for (String value : values)
        {
            System.out.println(value + ", ");
        }


        String[] names2 = new String[3];
        for (String name2 : names2)
        {
            System.out.println(name2 + ", ");

        }
    }

    public static void understanding_advanced_flow_control(){

        int [][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};

        for (int[] mySimpleArray : myComplexArray) {
            for (int i=0; i < mySimpleArray.length; i++){
                System.out.println(mySimpleArray[i]+"\t");
            }
        }

        System.out.println("end");
    }

    public static void oca_SearchSample () {
        // int [][] list  = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        int [][] list  = {{1,13,5},{1,2,5},{2,7,2}};
        int searchValue = 2;
        int positionX = -1;
        int positionY = -1;

        System.out.println("oca_SearchSample : A");


        PARENT_LOOP: for(int i=0; i<list.length; i++ )
        {
            for (int j=0; j<list[i].length; j++) {
                System.out.println("A Value "+list[i][j]+" at: "+ "{"+i+","+j+")");
//                System.out.println("A Value "+list[i][j]+" found at: "+ "{"+positionX+","+positionY+")");
                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    System.out.println("Break!!!! A: ");
                    break PARENT_LOOP;
                }

            }
        }
        if (positionX==-1 || positionY==-1) {
            System.out.println("A Value "+searchValue+" not found");
        } else {
            System.out.println("A Value "+searchValue+" found at: "+ "{"+positionX+","+positionY+")");
        }



/////////////////////////////////
        System.out.println("oca_SearchSample : B");
        searchValue = 2;
        positionX = -1;
        positionY = -1;


        PARENT_LOOP: for(int i=0; i<list.length; i++ )
        {

            for (int j=0; j<list[i].length; j++) {
                System.out.println("B in J LOOP Value "+list[i][j]+" at: "+ "{"+i+","+j+")");
//                System.out.println("B Value "+list[i][j]+" found at: "+ "{"+positionX+","+positionY+")");

                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    System.out.println("Break!!!! B: ");

                    break ;
                }
            }

        }
        if (positionX==-1 || positionY==-1) {
            System.out.println("B Value "+searchValue+" not found");
        } else {
            System.out.println("B Value "+searchValue+" found at: "+ "{"+positionX+","+positionY+")");
        }//


        /////////////////////////////////
        System.out.println("oca_SearchSample : C");
        searchValue = 2;
        positionX = -1;
        positionY = -1;


        PARENT_LOOP: for(int i=0; i<list.length; i++ )
        {

            for (int j=0; j<list[i].length; j++) {
                System.out.println("C in J LOOP Value "+list[i][j]+" at: "+ "{"+i+","+j+")");
//                System.out.println("B Value "+list[i][j]+" found at: "+ "{"+positionX+","+positionY+")");

                if (list[i][j] == searchValue) {
                    positionX = i;
                    positionY = j;
                    System.out.println("Break!!!! C: no break");

                    //break ;
                }
            }

        }
        if (positionX==-1 || positionY==-1) {
            System.out.println("C Value "+searchValue+" not found");
        } else {
            System.out.println("C Value "+searchValue+" found at: "+ "{"+positionX+","+positionY+")");
        } //

        System.out.println("\n\n; Continue statement: outer/first loop\n");

        FIRST_CHAR_LOOP: for (int a=1; a<= 4; a++) {
            System.out.print ( ANSI_RED + " outer"+ANSI_RESET+" loop Continue; values:  " + a + "\n");
            for (char x = 'a'; x <= 'c' ; x++) {
                System.out.print (" inner loop Continue; values:  " + a + x+"\n");
                if ( a==2 || x == 'b') {
                    System.out.print (" IF Continue; CONTINUE; values:  " + a + x+"\n");
                    continue FIRST_CHAR_LOOP;
                }
                //  continue ;
                System.out.print ("NO continue triggered; first char loop:  " + a + x+"\n");
            }
        }

        System.out.println("\n\n; Continue statement: inner loop\n");
        B_FIRST_CHAR_LOOP: for (int a=1; a<= 4; a++) {
            System.out.print ( ANSI_RED + " Outer "+ANSI_RESET+"loop Continue; values:  " + a +"\n");
            for (char x = 'a'; x <= 'c' ; x++) {
                System.out.print (" Inner loop Continue; values:  " + a + x+"\n");
                if ( a==2 || x == 'b') {
                    //       continue FIRST_CHAR_LOOP;
                    System.out.print (" IF Continue; CONTINUE; values:  " + a + x+"\n");
                    continue;
                }
                System.out.print ("NO continue triggered; inner char loop:  " + a + x+"\n");
            }
        }


        System.out.println("\n\n; Break statement: outer loop\n");

        BREAK_FIRST_CHAR_LOOP: for (int a=1; a<= 4; a++) {
            System.out.print ( ANSI_RED+" outer"+ANSI_RESET+" loop; values:  " + a +"\n");
            for (char x = 'a'; x <= 'c' ; x++) {

                System.out.print (" inner loop; values:  " + a + x+"\n");
                if ( a==2 || x == 'b') {
                    System.out.print (" BREAK; IF values; BREAK; :  " + a + x+"\n");
                    break BREAK_FIRST_CHAR_LOOP;
                }
                System.out.print (" NO Break; first char loop:  " + a + x+"\n");
            }
        }


        System.out.println("\n\n; Break statement: inner loop\n");

        B_BREAK_FIRST_CHAR_LOOP: for (int a=1; a<= 4; a++) {
            System.out.print ( ANSI_RED+" outer"+ANSI_RESET+" loop; values:  " + a +"\n");
            for (char x = 'a'; x <= 'c' ; x++) {

                System.out.print (" inner loop; values:  " + a + x+"\n");
                if ( a==2 || x == 'b') {
                    // break BREAK_FIRST_CHAR_LOOP;
                    System.out.print (" Break; IF; BREAK: :  " + a + x+"\n");
                    break;
                }
                System.out.print (" Break; inner loop char loop:  " + a + x+"\n");
            }
        }


        for (int i=0; i<10; ){
            //i = i++;
            i++;
            System.out.println(i + "; ");
            System.out.println("Hello World \n");

        }


    }


    public static void oca_Strings () {

        StringBuilder sb = new StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);




    }

    public static void oca_Arrays() {

        //int[] numbers = {2,4,6,8};
        int[] numbers = {12,2,4,19,6,8};

        int result;

        for ( int number: numbers) {

            System.out.println ("Waarde:"+  number);
        }
        Arrays.sort(numbers);
        for ( int number: numbers) {

            System.out.println ("Waarde:"+  number);
        }

        System.out.println(Arrays.binarySearch(numbers, 2));
        System.out.println(Arrays.binarySearch(numbers, 4));
        System.out.println(Arrays.binarySearch(numbers, 1));
        System.out.println(Arrays.binarySearch(numbers, 3));
        System.out.println(Arrays.binarySearch(numbers, 9));



        int [][] twoD = new int [3][2];
        for (int i=0; i < twoD.length;i++){
            for (int j=0; j < twoD[i].length; j++) {
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

    public static void oca_arrays_verify_else_insert(int[] intArray, int value){
        //Arrays.


    }


    public static void oca_ArraysList() {
        List<String> birds = new ArrayList<>();
        birds.add("Hawk");
        birds.add(1,"Robin");
        birds.add(0,"Blue jay");
        birds.add(1,"Cardinal");
        System.out.println(birds);

        birds.add("Hawk");
        System.out.println(birds.remove("test"));
        System.out.println(birds.remove("Robin"));
        System.out.println(birds);

        System.out.println(birds.remove("Hawk"));
        System.out.println(birds.remove(2));
        System.out.println(birds);
        System.out.println(birds.size());
        birds.set(1,"Ruben");
        System.out.println(birds);
        System.out.println(birds.size());


        // Converting between array an list
        ArrayList<String> ALTest= new ArrayList<>();
        ALTest.add("Laptop");
        ALTest.add("Desktop");

        String[] stringArray1 = ALTest.toArray(new String[0]);

        System.out.println(stringArray1.length);
        System.out.println(stringArray1);


        for (String waarde : stringArray1)
        {
            System.out.print(waarde);
        }



        String [] array = {"hawk","robin","light"};
        List<String> list = Arrays.asList(array);

        System.out.print("\narray object: " + array);
        System.out.print("\nlist object: " + list);


    }

}
