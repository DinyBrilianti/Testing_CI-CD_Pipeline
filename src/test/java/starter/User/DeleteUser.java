package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteUser {
    protected static String url = "https://fakestoreapi.com/users/6";

    @Step("User is on the delete page endpoint")
    public String userOnTheDeletePageEndpoint(){
        return url;
    }
    @Step("user is on the request page endpoint with an delete method")
    public void userRequestEndpointWithMethodDelete(){
        SerenityRest.given().delete(userOnTheDeletePageEndpoint());
    }
    @Step("user receive response code OK200")
    public void userReceiveResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
