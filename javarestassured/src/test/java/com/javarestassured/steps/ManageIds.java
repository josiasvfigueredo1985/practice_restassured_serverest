package com.javarestassured.steps;

import com.javarestassured.utils.GeneralUtils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class ManageIds {

    // Method to fetch the id from a post request and save it on the  Ids.json file
    public static void saveIdToJson(ValidatableResponse response, String idKeyResponse, String jsonIdKey) {
        // idKey: atribute name from Ids.json
        // idKeyResponse: atribute name from response body
        // idValue: value fetched from the response body
        JsonPath jsonPath = new JsonPath(response.toString());
        String idValue = jsonPath.getString(idKeyResponse);
        GeneralUtils.WriteInJsonFile("/jsons/Ids.json", jsonIdKey, idValue);
    }
    
    // Override to accept Response
    public static void saveIdToJson(Response response, String idKeyResponse, String jsonIdKey) {
        // idKey: atribute name from Ids.json
        // idKeyResponse: atribute name from response body
        // idValue: value fetched from the response body
        JsonPath jsonPath = new JsonPath(response.asString());
        String idValue = jsonPath.getString(idKeyResponse);
        GeneralUtils.WriteInJsonFile("/jsons/Ids.json", jsonIdKey, idValue);
    }

}
