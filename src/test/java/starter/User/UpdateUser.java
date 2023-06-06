package starter.User;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UpdateUser {
    protected static String url = "https://fakestoreapi.com/users/7";

    @Step("user is on the update user page endpoint")
    public String userOnUpdatePageEndpoint(){
        return url;
    }
    @Step("user is on the request page with endpoint and PUT method")
    public void userRequestPageWithEndpoint(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("email","John@gmail.com");
        requestBody.put("username","johnd");
        requestBody.put("password","m38rmF$");
        requestBody.put("name", new String[]{"firstname", "John", "lastname", "Doe"});
        requestBody.put("address", new String[]{"city","kilcoole", "street","7835 new road", "number","3", "zipcode","12926-3874"});
        requestBody.put("geolocation", new String[]{"lat","-37.3159", "long", "81.1496"});
        requestBody.put("phone", "1-570-236-7033");
        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toString()).put(userOnUpdatePageEndpoint());
    }
    @Step("user receive the response code 200ok")
    public void userReceiveResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
