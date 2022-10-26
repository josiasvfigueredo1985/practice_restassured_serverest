package com.javarestassured.requests.Usuarios;

import com.javarestassured.bases.RequestRestBase;

import io.restassured.http.Method;

public class GetUsuarioID extends RequestRestBase {

    public GetUsuarioID(String id){
        requestService = "/usuarios/"+id;
        method = Method.GET;
    }

}
