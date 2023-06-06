package starter.Products;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AddNewProduct {
    protected static String url = "https://fakestoreapi.com/products";

    @Step("user is on the product POST page endpoint")
    public String userOnTheProductPostPageEndpoint() {
        return url;
    }
    @Step("user is on the request page with the endpoint, method POST and JSON format body")
    public void userRequestPageWithEndpointMethodAndBody() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("title","13.5");
        requestBody.put("description","lorem ipsum set");
        requestBody.put("image","https://i.pravatar.cc");
        requestBody.put("category","electronic");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userOnTheProductPostPageEndpoint());
    }
    @Step("i receive the response code 200 OK")
    public void iReceiveTheResponseCode200OK() {
        restAssuredThat(response -> response.statusCode(200));
    }
}
