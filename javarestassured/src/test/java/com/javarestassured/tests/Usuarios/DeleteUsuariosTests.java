package com.javarestassured.tests.Usuarios;
/* package com.javarestassuredtemplate.tests.Usuarios;

import com.javarestassuredtemplate.bases.TestBase;
import com.javarestassuredtemplate.requests.Login.Login;
import io.restassured.response.ValidatableResponse;
import org.apache.http.HttpStatus;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.equalTo;

public class PostUsuarioTests extends TestBase {
    Login postPetRequest;

    @Test
    public void cadastraUsuario(){
      
    }
/*
    @Test
    public void inserirPetComTodosDadosValidosUsandoJavaObjectNoTeste(){
        //Parâmetros
        int id = 9998;
        int categoryId = 9998;
        String categoryName = "cão";
        String name = "Malte";
        String photoUrl1 = "http://photododog.com/image123.png";
        String photoUrl2 = "http://photododog.com/image456.png";
        int tagId1 = 9998;
        String tagName1 = "macho";
        int tagId2 = 9988;
        String tagName2 = "maltes";
        String status = "available";
        int statusCodeEsperado = HttpStatus.SC_OK;

        //Serialização do Json em um objeto java
        Pet pet = new Pet();
        pet.setId(id);

        Category category = new Category();
        category.setId(categoryId);
        category.setName(categoryName);
        pet.setCategory(category);

        pet.setName(name);
        pet.setPhotoUrls(new String[]{photoUrl1, photoUrl2});

        Tag tag1 = new Tag();
        tag1.setId(tagId1);
        tag1.setName(tagName1);
        Tag tag2 = new Tag();
        tag2.setId(tagId2);
        tag2.setName(tagName2);
        pet.setTags(new Tag[]{tag1, tag2});

        pet.setStatus(status);

        //Fluxo
        postPetRequest = new PostPetRequest();
        postPetRequest.setJsonBodyUsingJavaObject(pet);
        ValidatableResponse response = postPetRequest.executeRequest();

        //Asserções
        response.statusCode(statusCodeEsperado);
        response.body("id",equalTo(id),
                "category.id", equalTo(categoryId),
                "category.name", equalTo(categoryName),
                "name", equalTo(name),
                "photoUrls[0]", equalTo(photoUrl1),
                "photoUrls[1]", equalTo(photoUrl2),
                "tags[0].id", equalTo(tagId1),
                "tags[0].name", equalTo(tagName1),
                "tags[1].id", equalTo(tagId2),
                "tags[1].name", equalTo(tagName2),
                "status", equalTo(status));
    }

    
}
 */