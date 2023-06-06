package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AddNewProductCart {
    protected static String url = "https://fakestoreapi.com/carts";

    @Step("user is on the product cart POST page endpoint")
    public String userIsOnTheProductCartPOSTPageEndpoint(){
        return url;
    }
    @Step("user on the request page with the endpoint, method POST and JSON format body")
    public void userOnTheRequestPageWithTheEndpointMethodPOSTAndJSONFormatBody(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId","5");
        requestBody.put("date","2020-02-03");
        requestBody.put("products","[{productId:5,quantity:1},{productId:1,quantity:5}]");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userIsOnTheProductCartPOSTPageEndpoint());
    }
    @Step("i receive the response code {int}OK")
    public void iReceiveTheResponseCodeOK(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
