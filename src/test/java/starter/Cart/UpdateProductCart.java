package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateProductCart {
    protected static String url = "https://fakestoreapi.com/carts/7";

    @Step("user is on the product cart put page endpoint")
    public String userIsOnTheProductCartPutPageEndpoint(){
        return url;
    }
    @Step("user request page with endpoint, put and json body format json")
    public void userRequestPageWithEndpointPutAndJsonBodyFormatJson(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId","3");
        requestBody.put("date","2019-12-10");
        requestBody.put("products","[{productId:1,quantity:3}]");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).put(userIsOnTheProductCartPutPageEndpoint());
    }
    @Step("i receive response code 400")
    public void iReceiveResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
