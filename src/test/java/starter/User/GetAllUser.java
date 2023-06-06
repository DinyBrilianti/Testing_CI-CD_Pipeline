package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllUser {
    public String url = "https://fakestoreapi.com/users";

    @Step("user is on the get all info user page endpoint")
    public String userGetAllInfoUser(){
        return url;
    }
    @Step("user is on the request page with an endpoint and a GET method")
    public void userRequestPageEndpoint(){
        SerenityRest.given().get(userGetAllInfoUser());
    }
    @Step("user get information data")
    public void userGetInformationData(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive response code 200 OK")
    public void userReceiveResponseCode200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
