package com.javarestassured.requests.Usuarios;

import com.javarestassured.bases.RequestRestBase;
import com.javarestassured.utils.GeneralUtils;
import com.javarestassured.utils.NameGenerator;

import io.restassured.http.Method;

public class PostUsuario extends RequestRestBase {
    public PostUsuario(){
        requestService = "/usuarios";
        method = Method.POST;
    }

    public void setJsonBodyUsingJsonFile(String email, String password, String administrador){
        jsonBody = GeneralUtils.readFileToAString(GeneralUtils.ReturnProjectPath()+"/jsons/Usuario.json")
                               .replace("$nome", NameGenerator.fullNameGenerator())
                               .replace("$email", email)
                               .replace("$password", password)
                               .replace("$administrador", administrador);
    }
}
