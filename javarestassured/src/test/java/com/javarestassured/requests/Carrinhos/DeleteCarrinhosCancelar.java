package com.javarestassured.requests.Carrinhos;

import com.javarestassured.bases.RequestRestBase;

import io.restassured.http.Method;

public class DeleteCarrinhosCancelar extends RequestRestBase {
    public DeleteCarrinhosCancelar(){
        requestService = "/carrinhos/cancelar-compra";
        method = Method.DELETE;

}
}