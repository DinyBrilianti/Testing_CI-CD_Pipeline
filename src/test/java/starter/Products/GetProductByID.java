package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetProductByID {
    protected static String url = "https://fakestoreapi.com/products/1";

    @Step("user on the product Get By Id page endpoint")
    public String userOnTheProductGetByIDPageEndpoint(){
        return url;
    }
    @Step("user on the request page with endpoint and GET method")
    public void userOnRequestPageEndpointMethod(){
        SerenityRest.given().get(userOnTheProductGetByIDPageEndpoint());
    }
    @Step("user should receive a category by ID")
    public void userShouldReceiveCategoryByID(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive the Response code 200 OK")
    public void userReceiveResponseCode200OK(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
