package com.javarestassured.tests.Usuarios;
/* package com.javarestassuredtemplate.tests.Usuarios;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.Login.Login;
import com.javarestassuredtemplate.steps.ManageIds;
import com.javarestassuredtemplate.utils.GeneralUtils;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyData;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

public class PostUsuariosTests extends TestBase {
    Login postPetRequest;

    @Test
    public void inserirPetComTodosDadosValidosUsandoJavaObjectNoTeste(){

        //Parameters
        String message = "Cadastro realizado com sucesso";
        String id = "";

        //Flow
        postPetRequest = new PostPetRequest();
        postPetRequest.setJsonBodyUsingJavaObject(pet);
        ValidatableResponse response = postPetRequest.executeRequest();

        //Assertions
        response.statusCode(statusCodeEsperado);
        response.body("id",equalTo(id),
                "category.id", equalTo(categoryId),
                "category.name", equalTo(categoryName);

                // Save id to json file
                ManageIds.saveIdToJson(response, "_id", "idUsuario");
                // Execute delete Method to avoid data conflict and garbage
    }
}
 */