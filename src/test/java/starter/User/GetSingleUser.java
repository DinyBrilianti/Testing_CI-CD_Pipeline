package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSingleUser {
    protected static String url = "https://fakestoreapi.com/users/1";

    @Step("user is on the single user by ID Get page endpoint")
    public String userGetUserIDOnThePageEndpoint(){
        return url;
    }
    @Step("user is on the request page with an endpoint and GET method")
    public void userRequestPageWithGetMethode(){
        SerenityRest.given().get(userGetUserIDOnThePageEndpoint());
    }
    @Step("user get information single user")
    public void userGetInformationSingleUser(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive the response code 200 OK")
    public void userReceiveResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
