package com.javarestassured.requests.Produtos;

import com.javarestassured.bases.RequestRestBase;

import io.restassured.http.Method;

public class DeleteProdutosByID extends RequestRestBase {
    public DeleteProdutosByID(String id){
        requestService = "/produtos/"+id;
        method = Method.DELETE;
    }
}
