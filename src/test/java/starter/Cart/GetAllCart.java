package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCart {
    protected static String url = "https://fakestoreapi.com/carts";

    @Step("user on the cart GET page endpoint")
    public String userOnTheCartGETPageEndpoint(){
        return url;
    }
    @Step("user on the request page with endpoint and get method")
    public void userRequestEndpointAndGetMethod(){
        SerenityRest.given().get(userOnTheCartGETPageEndpoint());
    }
    @Step("user should receive a list of cart")
    public void userShouldReceiveListOfCart(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("I receive response code 200 OK")
    public void iReceiveResponseCode200ok(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
