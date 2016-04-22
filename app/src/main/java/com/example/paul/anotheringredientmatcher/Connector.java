package com.example.paul.anotheringredientmatcher;

/**
 * Created by Paul on 4/12/2016.
 */
public class Connector {

    protected void connect(String ingredient) throws Exception {

        System.out.println(ingredient+"in the connector");
        String[] recipes = {};
        String baseURL = "http://www.recipepuppy.com/api/?i=" + ingredient + "&p=1&format=xml";
        String query = "";
        String resultQuery = "//recipe";
        ///
        String recipe = RestfulServiceSupport.queryWithXMLReturn( baseURL, query, resultQuery );
        System.out.println( "Ingredient " + ingredient + " recipies" + recipe);

        // call the exist rest service to convert state name to state code
       /* baseURL = "http://52.26.87.189:8080/exist/rest/db/simplefares/stateZones.xml";
        query = "?_query=data(//state[@name='" + stateName + "']/@code)";
        resultQuery = "//exist:value";
        String stateCode = RestfulServiceSupport.queryWithXMLReturn( baseURL, query, resultQuery );
        System.out.println( "State name: " + stateName + " has the following code: " + stateCode );

        // call the exist rest service to convert state code to zone
        baseURL = "http://52.26.87.189:8080/exist/rest/db/simplefares/stateZones.xml";
        query = "?_query=data(//state[@code='" + stateCode + "']/../@id)";
        resultQuery = "//exist:value";
        recipes[1] = RestfulServiceSupport.queryWithXMLReturn( baseURL, query, resultQuery );

        System.out.println( "The zone for state: " + stateCode + " is: " + recipes[1] );
*/
/*

        baseURL = "http://52.26.87.189:8080/exist/rest/db/simplefares/airfareRules.xml";
        query = "?_query=data(//antecedent[contains(@from,'" + zones[0] + "') and contains(@to,'" + zones[1] + "')]/../consequent/@fare)";

        System.out.println(query);
        resultQuery = "//exist:value";
        String fare = RestfulServiceSupport.queryWithXMLReturn( baseURL, query, resultQuery );

        System.out.println(fare + zones[0]+zones[1] );*/

    }
}
