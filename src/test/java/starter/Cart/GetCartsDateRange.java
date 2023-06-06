package starter.Cart;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class GetCartsDateRange {
    protected static String url = "https://fakestoreapi.com/carts?startdate=2019-12-10&enddate=2020-10-10";
    @Step("user on the get carts in date range page endpoint")
    public String userOnTheGetCartsInDateRangePageEndpoint(){
        return url;
    }
    @Step("user on request page with get method and endpoint")
    public void userOnRequestPageWithGetMethodAndEndpoint(){
        SerenityRest.given().get(userOnTheGetCartsInDateRangePageEndpoint());
    }
    @Step("user should receive carts in date range")
    public void userShouldReceiveCartsInDateRange(){
        restAssuredThat(response -> response.log().all());
    }
    @Step("user receive response code {int}oK")
    public void userReceiveResponseCodeOK(){
        restAssuredThat(response -> response.statusCode(200));
    }
}
