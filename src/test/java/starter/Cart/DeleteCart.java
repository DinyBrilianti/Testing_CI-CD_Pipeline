package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class DeleteCart {
    protected static String url = "https://fakestoreapi.com/carts/6";

    @Step("user is on the delete cart page endpoint")
    public String userIsOnTheDeleteCartPageEndpoint(){
        return url;
    }
    @Step("user request page with endpoint and Delete method")
    public void userRequestPageWithEndpointAndDeleteMethod(){
        SerenityRest.given().delete(userIsOnTheDeleteCartPageEndpoint());
    }
    @Step("i receive response code ok{int}")
    public void iReceiveResponseCodeOk(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
