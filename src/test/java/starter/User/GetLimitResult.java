package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetLimitResult {
    protected static String url = "https://fakestoreapi.com/users?limit=5";

    @Step("user is on the get limit result info user page endpoint")
    public String userOnTheGetPageEndpoint(){
        return url;
    }
    @Step("user is on the request page with an endpoint params and a GET method")
    public void userRequestPageEndpointparamsWithGetMethode(){
        SerenityRest.given().get(userOnTheGetPageEndpoint());
    }
    @Step("user get information limit result")
    public void userGetInformationLimitResult(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive response code 200OK")
    public void userReceiveResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
