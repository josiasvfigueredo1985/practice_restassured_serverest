package com.javarestassured.requests.Usuarios;

import com.javarestassured.bases.RequestRestBase;
import com.javarestassured.utils.GeneralUtils;

import io.restassured.http.Method;

public class PutUsuario extends RequestRestBase {
    public PutUsuario(String id){
        requestService = "/usuarios/"+id;
        method = Method.PUT;
    }
    public void setJsonBodyUsingJsonFile(String nome, String email, String password, String administrador){
        jsonBody = GeneralUtils.readFileToAString(GeneralUtils.ReturnProjectPath()+"/jsons/Usuario.json")
                               .replace("$nome", nome)
                               .replace("$email", email)
                               .replace("$password", password)
                               .replace("$administrador", administrador);
    }
  
}
