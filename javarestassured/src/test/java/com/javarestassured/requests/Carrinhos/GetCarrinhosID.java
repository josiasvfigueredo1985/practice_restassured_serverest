package com.javarestassured.requests.Carrinhos;

import com.javarestassured.bases.RequestRestBase;

import io.restassured.http.Method;

public class GetCarrinhosID extends RequestRestBase {
    public GetCarrinhosID(String id){
        requestService = "/carrinhos/"+id;
        method = Method.GET;
    }
}
