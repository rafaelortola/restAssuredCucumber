package StepsDefinitions;

import Class.Usuario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.fail;

public class GetSteps {

    private Response response;
    private ValidatableResponse json;
    private RequestSpecification request;
    public Integer idFinal;

    @Before
    public void init(){
        System.out.println("");
        System.out.println("");
    }


    @Given("^que o usuário informe um id (.*?)$")
    public void informarId(Integer id){
        idFinal = id;
        Usuario userId = new Usuario(id);
                given()
                        .header("Authorization", "dc812aae71f795f80c6a69688bbdf64b73f108e9177a97ba1e2207e11cbc0496")
                        .body(userId);
    }

    @When("submeto a requisição para a api fazer um GET")
    public void submeterRequisicao(){
        response = when()
                .get("https://gorest.co.in/public-api/users/" + this.idFinal);
        System.out.println("ID Pesquisado: https://gorest.co.in/public-api/users/" + this.idFinal);
    }

    @Then("^a API retorna status de sucesso (.*?)$")
    public void retornaStatusSucessoGET(Integer statusCode){
        Response json = (Response) response.then()
                .statusCode(statusCode)
                .extract();

        if (response.getStatusCode() != HttpStatus.SC_OK) {
            fail("Falha na requisição" + response.getStatusCode());
        }
        else {
            System.out.println("Status Code: " + response.getStatusCode());
            System.out.println("Response Retornado: " + json.prettyPrint());
        }
    }

    @And("^deve assumir no campo name o valor (.*)$")
    public void validaDadosDeRetornoCampoName(String nome){
        response.then()
                .body("data.name", is(nome));
    }

    @Then("a API retorna status de insucesso GET")
    public void retornaStatusInsucessoGET(){
        Response json = (Response) response.then()
                .statusCode(200)
                .extract();

        Integer pega = response.getBody().path("code");

        if (pega == HttpStatus.SC_NOT_FOUND) {
            //fail("Falha na requisição" + response.getStatusCode());
            System.out.println("Mensagem: Usuário não encontrado!");
            System.out.println("Código: " + pega + " - NOT FOUND");
        }
        else {
            System.out.println("Status Code: " + response.getStatusCode());
            System.out.println("Response Retornado: " + json.prettyPrint());
        }
    }

    @And("^deve exibir a mensagem (.*)$")
    public void validaMensagemRetorno404NotFound(String mensagem){
        response.then();

        String pega = response.getBody().path("data.message");

        if (pega.equals(mensagem)) {
            //fail("Falha na requisição" + response.getStatusCode());
            System.out.println("Mensagem: " + pega);
            System.out.println("");
        }
        else {
            fail("Mensagem incorreta: " + mensagem);
        }
    }
}
