package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllCategories {
    protected static String url = "https://fakestoreapi.com/products/categories";

    @Step("user on the category GET page endpoint")
    public String userOnTheCategoryGETPageEndpoint(){
        return url;
    }
    @Step("user on the request page with Endpoint and GET method")
    public void userOnTheRequestPageWithEndpointAndGetMethod(){
        SerenityRest.given().get(userOnTheCategoryGETPageEndpoint());
    }
    @Step("user should receive a list of categories product")
    public void userShouldReceiveAListOfCategoriesProduct(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive the response code Ok")
    public void userReceiveTheResponseCodeOK(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
