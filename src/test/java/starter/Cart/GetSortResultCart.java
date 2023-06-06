package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSortResultCart {
    protected static String url = "https://fakestoreapi.com/carts?sort=desc";

    @Step("user on the get sort results cart page endpoint")
    public String userOnTheGetSortResultsCartPageEndpoint(){
        return url;
    }
    @Step("user on request page with endpoint and Get method")
    public void userRequestPageWithEndpointAndGetMethod(){
        SerenityRest.given().get(userOnTheGetSortResultsCartPageEndpoint());
    }
    @Step("user Should receive a sort results")
    public void userShouldReceiveASortResults(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive response code Ok200")
    public void userReceiveResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
