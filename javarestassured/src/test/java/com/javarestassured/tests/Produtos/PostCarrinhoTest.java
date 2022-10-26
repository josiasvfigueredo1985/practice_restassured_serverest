package com.javarestassured.tests.Produtos;

import org.testng.annotations.Test;

import com.javarestassured.steps.Produtos;

public class PostCarrinhoTest {
    
    @Test
    public void test() {
      Produtos p = new Produtos();
      p.criaNovoCarrinho();
  
    }
    
}
