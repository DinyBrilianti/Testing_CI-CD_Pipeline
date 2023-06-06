package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateProduct {
    protected static String url = "https://fakestoreapi.com/products/7";

    @Step("user is on the product PUT page endpoint")
    public String userIsOnTheProductPUTPageEndpoint(){
        return url;
    }
    @Step("user is on the request page with method and body")
    public void userIsOnTheRequestPageWithMethodAndBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","test product");
        requestBody.put("price","13.5");
        requestBody.put("description","lorem ipsum set");
        requestBody.put("image","https://i.pravatar.cc");
        requestBody.put("category","electronic");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).put(userIsOnTheProductPUTPageEndpoint());
    }
    @Step("i receive the response ok 200")
    public void iReceiveTheResponseOk200(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
