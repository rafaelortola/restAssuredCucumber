package StepsDefinitions;

import Class.Usuario;
import Json.CadastraUsuarioClass;
import Suporte.GeradorDeEmail;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Before;

import java.util.ArrayList;

import static io.restassured.RestAssured.given;


public class PostSteps {

    private Response response;
    private RequestSpecification request;

    //Instancia da classe CadastraUsuario
    CadastraUsuarioClass novoUsuario = new CadastraUsuarioClass();

    @Before
    public void init(){
        System.out.println("-----------------------------------------------------------");
        System.out.println("CENÁRIO DE TESTE");
    }

    @Given("que eu solicite a criacao de um usuario")
    public void criaUsuario(){
        request = given();
    }

    @And("^que o usuário informe um nome (.*)$")
    public void informarNomeUsuario(String nomeUsuario){
        String pegaNome = nomeUsuario;

        if (pegaNome.isEmpty()){
            Assert.fail("O campo 'NOME' está em branco");
        }
        else {
            novoUsuario.setNomeFinal(nomeUsuario);
        }
    }

    @And("^que o usuario informe um email (.*)$")
    public void informarEmailUsuario(String email){
        String pegaEmail = email;

        if (pegaEmail.isEmpty()){
            Assert.fail("O campo 'EMAIL' está em branco");
        }

        else{
            novoUsuario.setEmailFinal(email);
        }
    }

    @And("que informo um email gerado automaticamente")
    public void informarEmailAutomaticamente(){
            GeradorDeEmail GeradorDeEmailAutomatico = new GeradorDeEmail();
            String pegaEmailAuto = GeradorDeEmailAutomatico.toString().substring(24, 30).concat("@gmail.com");
            novoUsuario.setEmailFinal(pegaEmailAuto);
    }

    @And("^que o usuario informe um genero (.*)$")
    public void informarGeneroUsuario(String genero){
      //generoFinal = genero;
        novoUsuario.setGeneroFinal(genero);
    }

    @And("^que o usuario informe um status (.*)$")
    public void informarStatusUsuario(String status){
       //statusFinal = status;
        novoUsuario.setStatusFinal(status);
    }

    @When("submeto a requisição para a api fazer um POST")
    public void submeterRequisicao(){
         //RequestSpecification req = RestAssured.given();
         //req
        RequestSpecification request = RestAssured.given();
        request.header("Authorization", "Bearer 1462abb9755f839183b2183def5317232202dfe987ae871bf81a85b18c294d6c")
                .header("Content-Type", "application/json");

        response = request.body(novoUsuario.payloadNovoUsuario())
                .post("https://gorest.co.in/public-api/users");
    }


    @Then("^a API retorna (.*?)$")
    public void retornaStatusSucessoPOST(Integer statusCode){
        response.then()
                .statusCode(statusCode)
                .extract()
                .response()
                .prettyPrint();
    }

    @And("^deve exibir a seguinte mensagem (.*)$")
    public void deveExibirMensagemDeCritica(String mensagemCritica){
        ArrayList<String> pegaMensagem = (response.getBody().path("data.message"));
        String atual = pegaMensagem.get(0);

        if(mensagemCritica.equals(atual)){
            Assert.assertEquals(mensagemCritica, atual);
        }
        else {
            Assert.fail("Mensagem incorreta!");
        }
    }
}
