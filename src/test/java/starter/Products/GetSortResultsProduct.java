package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetSortResultsProduct {
    protected static String url = "https://fakestoreapi.com/products?sort=desc";

    @Step("user on the product Get sort result page endpoint")
    public String userOnProductGetSortResultPageEndpoint(){
        return url;
    }
    @Step("user on the request page with an endpoint and method GET")
    public void userRequestPageEndpointGetMethod(){
        SerenityRest.given().get(userOnProductGetSortResultPageEndpoint());
    }
    @Step("user get information sort results")
    public void userGetInformationSortResult(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive response code ok200")
    public void userReceiveResponseCodeOk(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
