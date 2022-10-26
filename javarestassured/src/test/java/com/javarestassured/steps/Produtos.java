package com.javarestassured.steps;

import com.javarestassured.jsonObjects.Items;
import com.javarestassured.jsonObjects.Produto;

public class Produtos {
    // Create a new product

    public void criaNovoCarrinho(){

        Produto p = new Produto();
        Items i = new Items();
        
        i.setIdProduto("jdjududne");
        i.setQuantidade(2);
        
        String produto = p.getProdutos().toString();

        System.out.println(produto);
    }
    //Delete a product by ID
}
