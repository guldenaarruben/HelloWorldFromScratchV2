package com.example.helloworldfromscratchv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static nl.example.ocaexcersises.OcaExcersises.*;


/*  Guide:

    Use JDK 12.0.2

    Included in GIT:
        /.idea/encodings.xml
        /.idea/misc.xml
        /.idea/modules.xml
        /.iea/vcs.xml
        .gitignore
            /out    * will be generated
            /.idea  * initially excluded, add explicit files which should be commited to git
        ==> contains:
            /.idea => everything is left out when not explicit added.
            /out

        20191107-001; Created artifact configuration for the JAR
                (https://www.jetbrains.com/help/idea/creating-and-running-your-first-java-application.html)
                1) From the main menu, select File | Project Structure Ctrl+Shift+Alt+S and click Artifacts.
                2) Click the Add button, point to JAR and select From modules with dependencies.
                3) To the right of the Main Class field, click the Browse button and select HelloWorld (com.example.helloworld) in the dialog that opens.
                4) IntelliJ IDEA creates the artifact configuration and shows its settings in the right-hand part of the Project Structure dialog.
                5) Apply the changes and close the dialog.

                #Build the JAR artifact﻿
                1) From the main menu, select Build | Build Artifacts.
                2) Point to HelloWorld:jar and select Build.
                3) If you now look at the out/artifacts folder, you'll find your JAR there.

                # Create a run configuration for the packaged application
                1) Press Ctrl+Shift+A, find and run the Edit Configurations action.
                2) In the Run/Debug Configurations dialog, click the Add button and select JAR Application.
                3) Name the new configuration: HelloWorldJar.
                4) In the Path to JAR field, click the Browse button and specify the path to the JAR file on your computer.
                5) Under Before launch, click the Add button, select Build Artifacts | HelloWorld:jar in the dialog that opens.
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
        oca_dateTime();

    }




}
