package com.javarestassured.requests.Usuarios;

import com.javarestassured.bases.RequestRestBase;

import io.restassured.http.Method;

public class GetUsuarios extends RequestRestBase {
    public GetUsuarios(){
        requestService = "/usuarios";
        method = Method.GET;
    }

    public GetUsuarios(String adm){
        requestService = "/usuarios?administrador="+adm;
        method = Method.GET;
    }

    public GetUsuarios(String id,String nome, String email){
        requestService = "/usuarios?_id="+id+"&nome="+nome+"&email="+email;
        method = Method.GET;
    }
}
   