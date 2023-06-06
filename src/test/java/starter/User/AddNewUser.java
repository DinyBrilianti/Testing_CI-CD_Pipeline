package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class AddNewUser {
    protected static String url = "https://fakestoreapi.com/users";

    @Step("user is on the new user page endpoint")
    public String userOnTheNewUserPageEndpoint(){
        return url;
    }
    @Step("user is on the request page with an endpoint and a POST method")
    public void userOnTheRequestEndpointAndPostMethod(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","John@gmail.com");
        requestBody.put("username","johnd");
        requestBody.put("password","m38rmF$");
        requestBody.put("name", new String[]{"firstname", "John", "lastname", "Doe"});
        requestBody.put("address", new String[]{"city","kilcoole", "street","7835 new road", "number","3", "zipcode","12926-3874"});
        requestBody.put("geolocation", new String[]{"lat","-37.3159", "long", "81.1496"});
        requestBody.put("phone", "1-570-236-7033");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).post(userOnTheNewUserPageEndpoint());
    }
    @Step("user receive response code OK 200")
    public void userReceiveResponseCode(){
        restAssuredThat(response ->  response.statusCode(200));
    }
}
