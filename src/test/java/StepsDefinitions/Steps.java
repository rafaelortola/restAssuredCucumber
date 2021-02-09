package StepsDefinitions;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.BeforeClass;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class Steps {
    private Response response;
    private RequestSpecification request;

    /*@BeforeClass
    public static void login() {
        Map<String, String> login = new HashMap<>();
        login.put("email", "wagner@aquino");
        login.put("senha", "123456");

        String TOKEN = given()
                .body(login)
                .when()
                .post("/logar")
                .then()
                .statusCode(200)
                .extract().path("token");

        RestAssured.requestSpecification.header("Authorization", "JWT " + TOKEN);
    }
    
    

    @Given("^que informe um nome (.*?)$")
    public void informarNome(String nome){
        Map<String, String> login = new HashMap<>();
        login.put("email", "wagner@aquino");
        login.put("senha", "123456");

        String TOKEN = given()
                .body(login)
                .when()
                .post("/logar")
                .then()
                .statusCode(200)
                .extract().path("token");

        RestAssured.requestSpecification.header("Authorization", "JWT " + TOKEN);

        request = given()
                .body("{ \"nome\": \"Rafael Silva\" }");
    }

    @When("^submeto a requisição para a api (.*?)$")
    public void informarAPI(String api){
        response = request.when()
                .post(api);
        System.out.println("-----------------------------------------");
        System.out.println("Response retornado: " + response.prettyPrint());
    }

    @Then("^a API retorna status de sucesso (.*)$")
    public void retornaStatusCode(Integer statusCode){
        response.then().statusCode(statusCode);
    }*/
}
