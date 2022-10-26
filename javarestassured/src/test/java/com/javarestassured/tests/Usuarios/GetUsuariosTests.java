package com.javarestassured.tests.Usuarios;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.Test;

import com.javarestassured.bases.TestBase;
import com.javarestassured.requests.Usuarios.GetUsuarios;
import com.javarestassured.steps.Usuario;

import static org.hamcrest.Matchers.*;

public class GetUsuariosTests extends TestBase {
  GetUsuarios usuarios;

  @Test
  public void listarUsuariosCadastrados() {
    // Parameters
    String nome = "Fulano da Silva";

    
    // Flow
    usuarios = new GetUsuarios();
    ValidatableResponse response = usuarios.executeRequest();

    // Assertions
    response.statusCode(200);
    response.assertThat().body(containsString(nome));
  }
}
