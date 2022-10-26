package com.javarestassured.requests.Usuarios;

import com.javarestassured.bases.RequestRestBase;

import io.restassured.http.Method;

public class DeleteUsuarioByID extends RequestRestBase {
    public DeleteUsuarioByID(String id){
        requestService = "/usuarios/"+id;
        method = Method.DELETE;
    }

}
