package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetInCategory {
    protected static String url = "https://fakestoreapi.com/products/category/jewelery";

    @Step("user is on the category GET page endpoint")
    public String userIsOnTheCategoryGETPageEndpoint() {
        return url;
    }
    @Step("user is on the request page with an endpoint with ID and GET method")
    public void userIsOnTheRequestPageWithAnEndpointWithIDAndGETMethod() {
        SerenityRest.given().get(userIsOnTheCategoryGETPageEndpoint());
    }
    @Step("user should receive a category")
    public void userShouldReceiveACategory() {
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive the Response Code 200 OK")
    public void userReceiveTheResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
