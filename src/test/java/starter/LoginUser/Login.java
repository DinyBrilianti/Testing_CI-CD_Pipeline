package starter.LoginUser;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.lastResponse;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected static  String url = "https://fakestoreapi.com/auth/login";
    public String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJzdWIiOjIsInVzZXIiOiJtb3JfMjMxNCIsImlhdCI6MTY4Mzc5OTI5M30.lmE08Av2iAGbn4POY4N7T5YWUjTJEIFQoG0Iwbfesis";
    @Step("user is on the login POST page endpoint")
    public String userOnLoginPageEnpoint() {
        return url;
    }
    @Step("user makes request page with the endpoint, POST method and JSON format body")
    public void userRequestEndpointwithMethodandBody() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "mor_2314");
        requestBody.put("password", "83r5^_");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userOnLoginPageEnpoint());
    }
    @Step("user get the data bearer token")
    public String userGetBearerToken() {
        token = lastResponse().getBody().jsonPath().get("data");
        return token;
    }
    @Step("user receive the response code 200 ok")
    public void userReceiveResponseCode200OK() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
