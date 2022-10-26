package com.javarestassured.steps;

public class AuthSteps {
    public static void generateToken() {
        PostLogin l = new PostLogin();
        l.DoLogin();
    }
}
