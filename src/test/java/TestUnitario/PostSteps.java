package TestUnitario;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

public class PostSteps {

    private Response response;
    private RequestSpecification request;
    public Integer idFinal;
    private static RequestSpecification TOKEN;

    private static String validRequest = "{\n" +
            "  \"name\": \"rafael xxx\",\n" +
            "  \"email\": \"rafaeltest1@gmail.com\",\n" +
            "  \"gender\": \"Male\",\n" +
            "  \"status\": \"Active\" \n" +
            "}";

    @Test
    public void CadastrarNovoUsuario() {
        given()
                .header("Authorization", "Bearer 1462abb9755f839183b2183def5317232202dfe987ae871bf81a85b18c294d6c")
                .contentType(ContentType.JSON)
                .body(validRequest)
                .when()
                .post("https://gorest.co.in/public-api/users")
                .then()
                .log().all()
                .statusCode(200)
                .extract()
                .response()
                .prettyPrint();
    }
}
