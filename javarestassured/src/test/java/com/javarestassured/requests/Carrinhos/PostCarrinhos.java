package com.javarestassured.requests.Carrinhos;

import com.javarestassured.bases.RequestRestBase;
import com.javarestassured.utils.GeneralUtils;

import io.restassured.http.Method;

public class PostCarrinhos extends RequestRestBase {
    public PostCarrinhos(){
        requestService = "/carrinhos";
        method = Method.POST;
    }

    public void setJsonBodyUsingJsonFile(String idProduto,String Squantidade){
        jsonBody = GeneralUtils.readFileToAString("/jsons/Carrinho.json")
                               .replace("$idProduto", idProduto)
                               .replace("$quantidade", Squantidade);
    }
}
