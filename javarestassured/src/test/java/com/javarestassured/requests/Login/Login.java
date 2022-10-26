package com.javarestassured.requests.Login;

import com.javarestassured.bases.RequestRestBase;
import com.javarestassured.utils.GeneralUtils;

import io.restassured.http.Method;

public class Login extends RequestRestBase {
    public Login(){
        requestService = "/login";
        method = Method.POST;
    }

    public void setJsonBodyUsingJsonFile( String email, String password){
        jsonBody = GeneralUtils.readFileToAString(GeneralUtils.ReturnProjectPath()+"./jsons/Login.json")
                               .replace("$email", String.valueOf(email))
                               .replace("$password", String.valueOf(password));
                              
    }
}
