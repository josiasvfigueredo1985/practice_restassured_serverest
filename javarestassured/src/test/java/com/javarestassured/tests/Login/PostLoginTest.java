package com.javarestassured.tests.Login;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;
import org.testng.annotations.Test;

import com.javarestassured.bases.TestBase;
import com.javarestassured.requests.Login.Login;

import io.restassured.response.ValidatableResponse;

public class PostLoginTest extends TestBase {
    Login login;

    @Test
    public void realizarLogin() {
        // Parameters
        String email = "fulano@qa.com";
        String password = "teste";
        String message = "Login realizado com sucesso";

        // Flow
        login = new Login();
        login.setJsonBodyUsingJsonFile(email, password);
        ValidatableResponse response = login.executeRequest();

        // Assertions
        response.statusCode(200);
        response.body("message", equalTo(message));
        response.body("authorization", containsString("Bearer"));
    }

}
