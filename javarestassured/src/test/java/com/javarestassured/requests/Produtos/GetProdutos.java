package com.javarestassured.requests.Produtos;

import com.javarestassured.bases.RequestRestBase;

import io.restassured.http.Method;

public class GetProdutos extends RequestRestBase {

    public GetProdutos(){
        requestService = "/produtos";
        method = Method.GET;
    }
    public GetProdutos(String id){
        requestService = "/produtos?_id="+id;
        method = Method.GET;
    }
    public GetProdutos(String id, String nome, String preco,String descricao, String quantidade){
        requestService = "/produtos?_id="+id+"&nome="+nome+"&preco="+preco+"&descricao="+descricao+"&quantidade="+quantidade;
        method = Method.GET;
    }
}
