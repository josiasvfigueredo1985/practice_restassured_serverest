package com.javarestassured.steps;

import com.javarestassured.GlobalParameters;
import com.javarestassured.utils.GeneralUtils;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PostLogin {

    private String email = GlobalParameters.AUTHENTICATOR_USER;
    private String password = GlobalParameters.AUTHENTICATOR_PASSWORD;
    private String baseURI = GlobalParameters.URL_DEFAULT;
    private String authorization = null;
    PostNewUser postNewUser;

    private Response Login() {
        RestAssured.baseURI = this.baseURI;
        RequestSpecification request = RestAssured.given();

        String responseBody = "{\"email\": \"" + email + "\",\"password\": \"" + password + "\"}";

        request.header("Content-Type", "application/json");
        request.body(responseBody);

        Response response = request.post("/login");

        return response;
    }

    public void DoLogin() {
        int stts = Login().statusCode();
        postNewUser = new PostNewUser();

        if (stts == 200) {
            authorization = GeneralUtils.ReturnResponseJsonValue(Login(), "authorization");
            GlobalParameters.setToken(authorization);
        } else if (stts != 200) {
            postNewUser.CreateNewUser();
            Login();
            authorization = GeneralUtils.ReturnResponseJsonValue(Login(), "authorization");
            GlobalParameters.setToken(authorization);
        }
    }
}
