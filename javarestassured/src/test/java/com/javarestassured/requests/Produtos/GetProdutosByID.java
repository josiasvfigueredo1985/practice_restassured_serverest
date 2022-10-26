package com.javarestassured.requests.Produtos;

import com.javarestassured.bases.RequestRestBase;

import io.restassured.http.Method;

public class GetProdutosByID extends RequestRestBase {

    public GetProdutosByID(String id){
        requestService = "/produtos/"+id;
        method = Method.GET;
    }
}
