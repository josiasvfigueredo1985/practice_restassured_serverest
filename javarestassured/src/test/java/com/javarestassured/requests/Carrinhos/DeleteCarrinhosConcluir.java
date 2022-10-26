package com.javarestassured.requests.Carrinhos;

import com.javarestassured.bases.RequestRestBase;

import io.restassured.http.Method;

public class DeleteCarrinhosConcluir extends RequestRestBase {
    public DeleteCarrinhosConcluir(){
        requestService = "/carrinhos/concluir-compra";
        method = Method.DELETE;
    }
}
