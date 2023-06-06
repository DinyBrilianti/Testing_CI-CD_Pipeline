package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetLimitResultCart {
    protected static String url ="https://fakestoreapi.com/carts?limit=5";

    @Step("user on the cart Get Limit Result page endpoint")
    public String userOnTheCartGetLimitResultPageEndpoint(){

        return url;
    }
    @Step("user on the request page with endpoint and Get method")
    public void userOnTheRequestPageWithEndpointAndMethod(){
        SerenityRest.given().get(userOnTheCartGetLimitResultPageEndpoint());
    }
    @Step("user should receive a limit result list of cart")
    public void userShouldReceiveALimitResultListOfCart(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive response code 200")
    public void userReceiveResponseCodeOK(){
        restAssuredThat(response -> response.statusCode(200));
    }
}