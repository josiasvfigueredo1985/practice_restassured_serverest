package com.javarestassured.steps;

import org.testng.Assert;

import com.javarestassured.GlobalParameters;
import com.javarestassured.utils.NameGenerator;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostNewUser {

    private String name = NameGenerator.fullNameGenerator();
    private String email = GlobalParameters.AUTHENTICATOR_USER;
    private String password = GlobalParameters.AUTHENTICATOR_PASSWORD;
    private String baseURI = GlobalParameters.URL_DEFAULT;

    private void CreateUser() {
        RestAssured.baseURI = this.baseURI;
        RequestSpecification request = RestAssured.given();

        String requestParams = "{\"nome\": \"" + name + "\",\"email\": \"" + email
                + "\",\"password\": \"" + password + "\",\"administrador\": \"true\"}";

        request.header("Content-Type", "application/json");
        request.body(requestParams);

        request.post("/usuarios");
    }

    public void CreateNewUser() {
        CreateUser();
    }
}
