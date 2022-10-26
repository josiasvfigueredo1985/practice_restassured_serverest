package com.javarestassured.requests.Produtos;

import com.javarestassured.bases.RequestRestBase;
import com.javarestassured.utils.GeneralUtils;

import io.restassured.http.Method;

public class PostProdutos extends RequestRestBase {
    public PostProdutos(){
        requestService = "/produtos";
        method = Method.POST;
    }

    public void setJsonBodyUsingJsonFile(String nome,String preco,String descricao,String quantidade){
        jsonBody = GeneralUtils.readFileToAString(GeneralUtils.ReturnProjectPath()+"/jsons/Produto.json")
                               .replace("$nome", nome)
                               .replace("$preco",  preco)
                               .replace("$descricao", descricao)
                               .replace("$quantidade", quantidade);
    }
}
