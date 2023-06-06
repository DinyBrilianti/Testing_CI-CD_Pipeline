package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetLimitResultProduct {
    protected static String url ="https://fakestoreapi.com/products?limit=5";

    @Step("user on the product Get Limit Result page endpoint")
    public String userOnProductGetLimitResult(){
        return url;
    }
    @Step("user is on the request page with endpoint and GET method")
    public void userOnRequestPageEndpoint(){
        SerenityRest.given().get(userOnProductGetLimitResult());
    }
    @Step("user should receive a limit result list of product")
    public void userShouldReceiveLimitResult(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive response code 200ok")
    public void userReceiveResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
