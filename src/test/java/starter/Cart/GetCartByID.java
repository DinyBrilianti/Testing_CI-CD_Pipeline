package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCartByID {
    protected static String url = "https://fakestoreapi.com/carts/5";

    @Step("user is on the cart GET page endpoint")
    public String userIsOnTheCartGETPageEndpoint(){
        return url;
    }
    @Step("user request page with an endpoint with ID and GET method")
    public void userRequestPageWithAnEndpointWithIDAndGETMethod(){
        SerenityRest.given().get(userIsOnTheCartGETPageEndpoint());
    }
    @Step("user should receive a cart by ID")
    public void userShouldReceiveACartByID(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive the Response code 200 OK")
    public void userReceiveTheResponseCodeok200(){
        restAssuredThat(response -> response.statusCode(200));
    }

}
