package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetAllProducts {
    protected static String url = "https://fakestoreapi.com/products";

    @Step("user on the product GET page endpoint")
    public String userOnTheProductGetPage(){
        return url;
    }
    @Step("user on the request page with an endpoint and GET method")
    public void useRequestPageEndpointGetMethod(){
        SerenityRest.given().get(userOnTheProductGetPage());
    }
    @Step("user should receive a list of products")
    public void userShouldReceiveListProduct(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("I receive response code 200OK")
    public void IReceiveResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
