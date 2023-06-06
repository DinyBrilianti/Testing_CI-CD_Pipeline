package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSortResult {
    protected static String url = "https://fakestoreapi.com/users?sort=desc";

    @Step("user is on the get sort result info user page endpoint")
    public String userGetSortResultInfoPageEndpoint(){
        return url;
    }
    @Step("user is on the request page with an endpoint params and GET method")
    public void userOnTheRequestPageEndpoint(){
        SerenityRest.given().get(userGetSortResultInfoPageEndpoint());
    }
    @Step("user get information sort result")
    public void userGetInformationSortResult(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive response code 200 ok")
    public void userReceiveResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
