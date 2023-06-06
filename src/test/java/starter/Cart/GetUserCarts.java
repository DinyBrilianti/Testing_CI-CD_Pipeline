package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetUserCarts {
    protected static String url = "https://fakestoreapi.com/carts/user/2";

    @Step("user on the Get user carts page endpoint")
    public String userOnTheGetUserCartsPageEndpoint(){
        return url;
    }
    @Step("user request page with endpoint and Get method")
    public void userRequestPageWithEndpointAndMethod(){
        SerenityRest.given().get(userOnTheGetUserCartsPageEndpoint());
    }
    @Step("user should receive user carts")
    public void userShouldReceiveUserCarts(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive response code OK")
    public void userReceiveResponseCode200oK(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
