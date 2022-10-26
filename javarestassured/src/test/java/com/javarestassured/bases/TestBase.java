package com.javarestassured.bases;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.javarestassured.GlobalParameters;
import com.javarestassured.steps.AuthSteps;
import com.javarestassured.utils.ExtentReportsUtils;

import java.lang.reflect.Method;

public abstract class TestBase {
    @BeforeSuite
    public void beforSuite() {
        new GlobalParameters();
        ExtentReportsUtils.createReport();
        // When the token must be generated before all the tests
        AuthSteps.generateToken();

    }

    @BeforeMethod
    public void beforeTest(Method method) {
        ExtentReportsUtils.addTest(method.getName(), method.getDeclaringClass().getSimpleName());
        // When the token must be generated before each test
        // AuthSteps.generateToken();
    }

    @AfterMethod
    public void afterTest(ITestResult result) {
        ExtentReportsUtils.addTestResult(result);
    }

    @AfterSuite
    public void afterSuite() {
        ExtentReportsUtils.generateReport();
    }
}
