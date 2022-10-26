package com.javarestassured.requests.Carrinhos;

import com.javarestassured.bases.RequestRestBase;

import io.restassured.http.Method;

public class GetCarrinhos extends RequestRestBase {

    public GetCarrinhos(){
        requestService = "/carrinhos";
        method = Method.GET;
    }

    public GetCarrinhos(String id){
        requestService = "/carrinhos?_id=hhhhg5juj&precoTotal=22&quantidadeTotal=5&idUsuario=ikkiki";
        method = Method.GET;
    }

    public GetCarrinhos(String id, String precoTotal, String quantidadeTotal, String idUsuario){
        requestService = "/carrinhos?_id="+id+"&precoTotal="+precoTotal+"&quantidadeTotal="+quantidadeTotal+"&idUsuario="+idUsuario;
        method = Method.GET;
    }
}
