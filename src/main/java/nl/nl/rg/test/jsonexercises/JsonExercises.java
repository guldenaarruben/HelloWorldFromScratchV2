package nl.nl.rg.test.jsonexercises;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import org.json.JSONObject;



public class JsonExercises {

    static Logger log = LogManager.getLogger(JsonExercises.class);



    public void readJSON_file() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        log.info("@Given ::JSON file" );
        String file = "C:\\DEV\\Workspace\\Trunk\\oca_HWFS_v5\\HelloWorldFromScratchV2\\src\\main\\resources\\testdata\\profiel16b\\response001.json";
        //Toegevoegd tbv testen

        // todo aanpassen voor verzoek
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String json = "";
        int count=0;

        try {
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();


            while (line != null) {
                count++;
                log.debug ("count: "+count+ "  Line:" + line );
                sb.append(line);
                sb.append("\n");
                line = reader.readLine();
            }
            json = sb.toString();

        }
        catch (Exception e){
            log.info (e);
        }
        finally {
            reader.close();
        }

        log.info("result of readJsonFile: \n" + json);

        //log.info("****json: " + json.toString());
        JSONObject tmpJsonobj1 = new JSONObject(json);
        log.info("****tmpJsonobj1: " + tmpJsonobj1);



//        verzoek_JSONObject = new Verzoek_HaalGegevens_JsonObject();
//        verzoek_JSONObject.setJsonResultObj(tmpJsonobj1);
    }



    public void readJSON_file(String arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        log.info("@Given ::JSON file" );
        String file = "C:\\Dev\\Workspace\\Trunk\\vernieuwing-integratie-test\\src\\test\\resources\\testdata\\profiel16b\\response001.json";
        //Toegevoegd tbv testen

        // todo aanpassen voor verzoek
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String json = "";
        try {
            StringBuilder sb = new StringBuilder();
            String line = reader.readLine();

            while (line != null) {
                sb.append(line);
                sb.append("\n");
                line = reader.readLine();
            }
            json = sb.toString();
        } finally {
            reader.close();
        }

        log.info("result of reasJsonFile: \n" + json);
        //log.info("****json: " + json.toString());
        JSONObject tmpJsonobj1 = new JSONObject(json);
        //log.info("****tmpJsonobj1: " + tmpJsonobj1);



//        verzoek_JSONObject = new Verzoek_HaalGegevens_JsonObject();
//        verzoek_JSONObject.setJsonResultObj(tmpJsonobj1);
    }






}
