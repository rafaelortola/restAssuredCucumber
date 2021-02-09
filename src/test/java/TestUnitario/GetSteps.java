package TestUnitario;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.is;

public class GetSteps {

    private Response response;
    private RequestSpecification request;
    public Integer idFinal;
    private static RequestSpecification TOKEN;

    @Test
    public void informarNome() {
        idFinal = 1579;
        String a = given()
                .header("Authorization", "5d55ade274b2bd5f520dcc1e365ee287217950409617e4ce6d350b8edb75639d")
                .body(idFinal)
        .when()
                .get("https://gorest.co.in/public-api/users/" + idFinal.toString())
        .then()
                .statusCode(200)
                .body("data.name", is("Ala_MaKota"))
                .extract()
                .response()
                .prettyPrint();
    }

    @Test
    public void validarRetornoDoCampoName(){
        idFinal = 1548;
        String a = given()
                .header("Authorization", "5d55ade274b2bd5f520dcc1e365ee287217950409617e4ce6d350b8edb75639d")
                .body(idFinal)
                .when()
                .get("https://gorest.co.in/public-api/users/" + idFinal.toString())
                .then()
                .statusCode(200)
                .extract().response().prettyPrint();
    }
}
