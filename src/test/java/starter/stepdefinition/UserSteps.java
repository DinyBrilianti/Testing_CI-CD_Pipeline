package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.Cart.*;
import starter.LoginUser.Login;
import starter.Products.*;
import starter.User.*;

public class UserSteps {
    @Steps
    Login login;
    @Steps
    GetAllUser getAllUser;
    @Steps
    GetSingleUser getSingleUser;
    @Steps
    GetLimitResult getLimitResult;
    @Steps
    GetSortResult getSortResult;
    @Steps
    AddNewUser addNewUser;
    @Steps
    UpdateUser updateUser;
    @Steps
    DeleteUser deleteUser;
    @Steps
    GetAllProducts getAllProducts;
    @Steps
    GetProductByID getProductByID;
    @Steps
    GetLimitResultProduct getLimitResultProduct;
    @Steps
    GetSortResultsProduct getSortResultsProduct;
    @Steps
    GetAllCategories getAllCategories;
    @Steps
    GetInCategory getInCategory;
    @Steps
    AddNewProduct addNewProduct;
    @Steps
    UpdateProduct updateProduct;
    @Steps
    DeleteProduct deleteProduct;
    @Steps
    GetAllCart getAllCart;
    @Steps
    GetCartByID getCartByID;
    @Steps
    GetLimitResultCart getLimitResultCart;
    @Steps
    GetSortResultCart getSortResultCart;
    @Steps
    GetCartsDateRange getCartsDateRange;
    @Steps
    GetUserCarts getUserCarts;
    @Steps
    AddNewProductCart addNewProductCart;
    @Steps
    UpdateProductCart updateProductCart;
    @Steps
    DeleteCart deleteCart;

    ////////////////User Login\\\\\\\\\\\\\\\\
    @Given("user is on the login POST page endpoint")
    public void userIsOnTheLoginPOSTPageEndpoint() {
        login.userOnLoginPageEnpoint();
    }

    @When("user makes request page with the endpoint, POST method and JSON format body")
    public void userMakesRequestPageWithTheEndpointPOSTMethodAndJSONFormatBody() {
        login.userRequestEndpointwithMethodandBody();
    }

    @Then("user get the data bearer token")
    public void userGetTheDataBearerToken(){
        login.userGetBearerToken();
    }

    @And("user receive the response code 200 ok")
    public void userReceiveTheResponseCode200Ok(){
        login.userReceiveResponseCode200OK();
    }


    ////////////////Get All User\\\\\\\\\\\\\\\\\

    @Given("user is on the get all info user page endpoint")
    public void userIsOnTheGetAllInfoUserPageEndpoint() {
        getAllUser.userGetAllInfoUser();
    }

    @When("user is on the request page with an endpoint and a GET method")
    public void userIsOnTheRequestPageWithAnEndpointAndAGETMethod() {
        getAllUser.userRequestPageEndpoint();
    }

    @Then("user get information data")
    public void userGetInformationData() {
        getAllUser.userGetInformationData();
    }

    @And("user receive response code 200 OK")
    public void userReceiveResponseCode200OK() {
        getAllUser.userReceiveResponseCode200();
    }


    /////////////Get a single user\\\\\\\\\\\\\\\\\\
    @Given("user is on the single user by ID Get page endpoint")
    public void userIsOnTheSingleUserByIDGetPageEndpoint() {
        getSingleUser.userGetUserIDOnThePageEndpoint();
    }

    @When("user is on the request page with an endpoint and GET method")
    public void userIsOnTheRequestPageWithAnEndpointAndGETMethod() {
        getSingleUser.userRequestPageWithGetMethode();
    }

    @Then("user get information single user")
    public void userGetInformationSingleUser() {
        getSingleUser.userGetInformationSingleUser();
    }

    @And("user receive the response code 200 OK")
    public void userReceiveTheResponseCode200OK() {
        getSingleUser.userReceiveResponseCode200();
    }


    //////////////////Get limit result\\\\\\\\\\\\\\\\
    @Given("user is on the get limit result info user page endpoint")
    public void userIsOnTheGetLimitResultInfoUserPageEndpoint() {
        getLimitResult.userOnTheGetPageEndpoint();
    }

    @When("user is on the request page with an endpoint params and a GET method")
    public void userIsOnTheRequestPageWithAnEndpointParamsAndAGETMethod() {
        getLimitResult.userRequestPageEndpointparamsWithGetMethode();}

    @Then("user get information limit result")
    public void userGetInformationLimitResult() {
        getLimitResult.userGetInformationLimitResult();
    }

    @And("user receive response code 200OK")
    public void userReceiveResponseCode200Ok() {
        getLimitResult.userReceiveResponseCode();
    }


    //////////////////Get sort result\\\\\\\\\\\\\\\\\\\\
    @Given("user is on the get sort result info user page endpoint")
    public void userIsOnTheGetSortResultInfoUserPageEndpoint() {
        getSortResult.userGetSortResultInfoPageEndpoint();
    }

    @When("user is on the request page with an endpoint params and GET method")
    public void userIsOnTheRequestPageWithAnEndpointParamsAndGETMethod() {
        getSortResult.userOnTheRequestPageEndpoint();
    }

    @Then("user get information sort result")
    public void userGetInformationSortResult() {
        getSortResult.userGetInformationSortResult();
    }

    @And("user receive response code 200 ok")
    public void userReceiveResponseCode200ok() {
        getSortResult.userReceiveResponseCode();
    }


    ///////////////////Add a new user\\\\\\\\\\\\\\\\\
    @Given("user is on the new user page endpoint")
    public void userIsOnTheNewUserPageEndpoint() {
        addNewUser.userOnTheNewUserPageEndpoint();
    }

    @When("user is on the request page with an endpoint and a POST method")
    public void userIsOnTheRequestPageWithAnEndpointAndAPOSTMethod() {
        addNewUser.userOnTheRequestEndpointAndPostMethod();
    }

    @Then("user receive response code OK 200")
    public void userReceiveResponseCodeOK200() {
        addNewUser.userReceiveResponseCode();
    }

    @And("new user that was just created")
    public void newUserThatWasJustCreated() {
    }

    ///////////////Update a user\\\\\\\\\\\\\\\\\\\\
    @Given("user is on the update user page endpoint")
    public void userIsOnTheUpdateUserPageEndpoint() {
        updateUser.userOnUpdatePageEndpoint();
    }

    @When("user is on the request page with endpoint and PUT method")
    public void userIsOnTheRequestPageWithEndpointAndPUTMethod() {
        updateUser.userRequestPageWithEndpoint();
    }

    @And("user receive the response code 200ok")
    public void userReceiveTheResponseCodeOk() {
        updateUser.userReceiveResponseCode();
    }

    @Then("user receive valid data for update data")
    public void userReceiveValidDataForUpdateData() {
    }


    /////////////////Delete User\\\\\\\\\\\\\
    @Given("User is on the delete page endpoint")
    public void userIsOnTheDeletePageEndpoint() {
        deleteUser.userOnTheDeletePageEndpoint();
    }

    @When("user is on the request page endpoint with an delete method")
    public void userIsOnTheRequestPageEndpointWithAnDeleteMethod() {
        deleteUser.userRequestEndpointWithMethodDelete();
    }

    @And("user success delete user")
    public void userSuccessDeleteUser() {
    }

    @Then("user receive response code OK200")
    public void userReceiveResponseCodeOk200() {
        deleteUser.userReceiveResponseCode();
    }

    ////////////Get All Product\\\\\\\\\\\\\\\\\
    @Given("user on the product GET page endpoint")
    public void userOnTheProductGETPageEndpoint() {
        getAllProducts.userOnTheProductGetPage();
    }

    @When("user on the request page with an endpoint and GET method")
    public void userOnTheRequestPageWithAnEndpointAndGETMethod() {
        getAllProducts.useRequestPageEndpointGetMethod();
    }

    @Then("user should receive a list of products")
    public void userShouldReceiveAListOfProducts() {
        getAllProducts.userShouldReceiveListProduct();
    }

    @And("I receive response code 200OK")
    public void iReceiveResponseCode200OK() {
        getAllProducts.IReceiveResponseCode();
    }

    ///////////////Get Product By ID\\\\\\\\\\\\
    @Given("user on the product Get By Id page endpoint")
    public void userOnTheProductGetByIdPageEndpoint() {
        getProductByID.userOnTheProductGetByIDPageEndpoint();
    }

    @When("user on the request page with endpoint and GET method")
    public void userOnTheRequestPageWithEndpointAndGETMethod() {
        getProductByID.userOnRequestPageEndpointMethod();
    }

    @Then("user should receive a category by ID")
    public void userShouldReceiveACategoryByID() {
        getProductByID.userShouldReceiveCategoryByID();
    }

    @And("user receive the Response code 200 OK")
    public void userReceiveTheResponseCode200Ook() {
        getProductByID.userReceiveResponseCode200OK();
    }

    //////////////Get Limit Result Product\\\\\\\\\\\\\\
    @Given("user on the product Get Limit Result page endpoint")
    public void userOnTheProductGetLimitResultPageEndpoint() {
        getLimitResultProduct.userOnRequestPageEndpoint();
    }

    @When("user is on the request page with endpoint and GET method")
    public void userIsOnTheRequestPageWithEndpointAndGETMethod() {
        getLimitResultProduct.userOnRequestPageEndpoint();
    }

    @Then("user should receive a limit result list of product")
    public void userShouldReceiveALimitResultListOfProduct() {
        getLimitResultProduct.userShouldReceiveLimitResult();
    }

    @And("user receive response code 200ok")
    public void userReceiveResponseCode200() {
        getLimitResultProduct.userReceiveResponseCode();
    }

    /////////////Get Sort Results\\\\\\\\\\\\\\\\\\
    @Given("user on the product Get sort result page endpoint")
    public void userOnTheProductGetSortResultPageEndpoint() {
        getSortResultsProduct.userOnProductGetSortResultPageEndpoint();
    }

    @When("user on the request page with an endpoint and method GET")
    public void userOnTheRequestPageWithAnEndpointAndMethodGET() {
        getSortResultsProduct.userRequestPageEndpointGetMethod();
    }

    @Then("user get information sort results")
    public void userGetInformationSortResults() {
        getSortResultsProduct.userGetInformationSortResult();
    }

    @And("user receive response code ok200")
    public void userReceiveResponseCodeok200() {
        getSortResultsProduct.userReceiveResponseCodeOk();
    }

    ////////////////Get all categories\\\\\\\\\\\\
    @Given("user on the category GET page endpoint")
    public void userOnTheCategoryGETPageEndpoint() {
        getAllCategories.userOnTheCategoryGETPageEndpoint();
    }

    @When("user on the request page with Endpoint and GET method")
    public void userOnTheRequestPageWithEndpointAndGetMethod() {
        getAllCategories.userOnTheRequestPageWithEndpointAndGetMethod();
    }

    @Then("user should receive a list of categories product")
    public void userShouldReceiveAListOfCategoriesProduct() {
        getAllCategories.userShouldReceiveAListOfCategoriesProduct();
    }

    @And("user receive the response code 200OK")
    public void userReceiveTheResponseCodeOK() {
        getAllCategories.userReceiveTheResponseCodeOK();
    }

    ///////////Get in category\\\\\\\\
    @Given("user is on the category GET page endpoint")
    public void userIsOnTheCategoryGETPageEndpoint() {
        getInCategory.userIsOnTheCategoryGETPageEndpoint();
    }

    @When("user is on the request page with an endpoint with ID and GET method")
    public void userIsOnTheRequestPageWithAnEndpointWithIDAndGETMethod() {
        getInCategory.userIsOnTheRequestPageWithAnEndpointWithIDAndGETMethod();
    }

    @Then("user should receive a category")
    public void userShouldReceiveACategory() {
        getInCategory.userShouldReceiveACategory();
    }

    @And("user receive the Response Code 200 OK")
    public void userReceiveTheResponseCode200() {
        getInCategory.userReceiveTheResponseCode200();
    }

    //////////////////Add new product\\\\\\\\\\\\\\\\\\\
    @Given("user is on the product POST page endpoint")
    public void userIsOnTheProductPOSTPageEndpoint() {
        addNewProduct.userOnTheProductPostPageEndpoint();
    }

    @When("user is on the request page with the endpoint, method POST and JSON format body")
    public void userIsOnTheRequestPageWithTheEndpointMethodPOSTAndJSONFormatBody() {
        addNewProduct.userRequestPageWithEndpointMethodAndBody();
    }

    @Then("i receive the response code 200 OK")
    public void iReceiveTheResponseCodeOK() {
        addNewProduct.iReceiveTheResponseCode200OK();
    }

    @And("the post add new product that was just created")
    public void thePostAddNewProductThatWasJustCreated() {
    }

    ////////////////Update a product\\\\\\\\\\\\\\\\\
    @Given("user is on the product PUT page endpoint")
    public void userIsOnTheProductPUTPageEndpoint() {
        updateProduct.userIsOnTheProductPUTPageEndpoint();
    }

    @When("user is on the request page with method and body")
    public void userIsOnTheRequestPageWithMethodAndBody() {
        updateProduct.userIsOnTheRequestPageWithMethodAndBody();
    }

    @Then("i receive the response ok 200")
    public void iReceiveTheResponseOk200() {
        updateProduct.iReceiveTheResponseOk200();
    }

    @And("user success update product")
    public void userSuccessUpdateProduct() {
    }

    /////////////Delete a product\\\\\\\\\\\
    @Given("user wants to delete post category with valid ID")
    public void userWantsToDeletePostCategoryWithValidID() {
        deleteProduct.userDeletePostCategoryWithValidID();
    }

    @When("user is on the request page with an endpoint with ID and DELETE method")
    public void userIsOnTheRequestPageWithAnEndpointWithIDAndDELETEMethod() {
        deleteProduct.userRequestPageWithEndpointIDAndDeleteMethode();
    }

    @Then("user receive response code 200 ok and data is null")
    public void userReceiveResponseCode200OkAndDataIsNull() {
        deleteProduct.userReceiveResponseCode200AndDataNull();
    }

    @And("post data with ID 6 has been deleted")
    public void postDataWithID6HasBeenDeleted() {
    }

    ////////////////Get All Cart\\\\\\\\\\\\\\\\\
    @Given("user on the cart GET page endpoint")
    public void userOnTheCartGETPageEndpoint() {
        getAllCart.userOnTheCartGETPageEndpoint();
    }

    @When("user on the request page with endpoint and get method")
    public void userOnRequestPageWithEndpointAndGetMethod() {
        getAllCart.userRequestEndpointAndGetMethod();
    }

    @Then("user should receive a list of cart")
    public void userShouldReceiveAListOfCart() {
        getAllCart.userShouldReceiveListOfCart();
    }

    @And("I receive response code 200 OK")
    public void iReceiveResponseCodeOK() {
        getAllCart.iReceiveResponseCode200ok();
    }

    //////////////Get cart by ID\\\\\\\\\\\\\\\\
    @Given("user is on the cart GET page endpoint")
    public void userIsOnTheCartGETPageEndpoint() {
        getCartByID.userIsOnTheCartGETPageEndpoint();
    }

    @When("user request page with an endpoint with ID and GET method")
    public void userRequestPageWithAnEndpointWithIDAndGETMethod() {
        getCartByID.userRequestPageWithAnEndpointWithIDAndGETMethod();
    }

    @Then("user should receive a cart by ID")
    public void userShouldReceiveACartByID() {
        getCartByID.userShouldReceiveACartByID();
    }

    @And("user receive the Response code 200")
    public void userReceiveTheResponseCodeok200() {
        getCartByID.userReceiveTheResponseCodeok200();
    }

    //////////////////Get Limit Result Cart\\\\\\\\\\\\\\
    @Given("user on the cart Get Limit Result page endpoint")
    public void userOnTheCartGetLimitResultPageEndpoint() {
        getLimitResultCart.userOnTheCartGetLimitResultPageEndpoint();
    }

    @When("user on the request page with endpoint and Get method")
    public void userOnTheRequestPageWithEndpointAndMethod() {
        getLimitResultCart.userOnTheRequestPageWithEndpointAndMethod();
    }

    @Then("user should receive a limit result list of cart")
    public void userShouldReceiveALimitResultListOfCart() {
        getLimitResultCart.userShouldReceiveALimitResultListOfCart();
    }

    @And("user receive response code 200")
    public void userReceiveResponseCodeOK() {
        getLimitResultCart.userReceiveResponseCodeOK();
    }

    ////////////////Get Short Results\\\\\\\\\\
    @Given("user on the get sort results cart page endpoint")
    public void userOnTheGetSortResultsCartPageEndpoint() {
        getSortResultCart.userOnTheGetSortResultsCartPageEndpoint();
    }

    @When("user on request page with endpoint and Get method")
    public void userRequestPageWithEndpointAndGetMethod() {
        getSortResultCart.userRequestPageWithEndpointAndGetMethod();
    }

    @Then("user Should receive a sort results")
    public void userShouldReceiveASortResults() {
        getSortResultCart.userShouldReceiveASortResults();
    }

    @And("user receive response code Ok200")
    public void userReceiveResponseCode() {
        getSortResultCart.userReceiveResponseCode();
    }

    ////////////////////Get carts in date range\\\\\\\\\\\\\\\\
    @Given("user on the get carts in date range page endpoint")
    public void userOnTheGetCartsInDateRangePageEndpoint() {
        getCartsDateRange.userOnTheGetCartsInDateRangePageEndpoint();
    }

    @When("user on request page with get method and endpoint")
    public void userOnRequestPageWithGetMethodAndEndpoint() {
        getCartsDateRange.userOnRequestPageWithGetMethodAndEndpoint();
    }

    @Then("user should receive carts in date range")
    public void userShouldReceiveCartsInDateRange() {
        getCartsDateRange.userShouldReceiveCartsInDateRange();
    }

    @And("user receive response code {int}oK")
    public void userReceiveResponseCodeOK(int arg0) {
        getCartsDateRange.userReceiveResponseCodeOK();
    }

    ///////////////Get user carts\\\\\\\\\\\\\
    @Given("user on the get user carts page endpoint")
    public void userOnTheGetUserCartsPageEndpoint() {
        getUserCarts.userOnTheGetUserCartsPageEndpoint();
    }

    @When("user request page with endpoint and Get method")
    public void userRequestPageWithEndpointAndMethod() {
        getUserCarts.userRequestPageWithEndpointAndMethod();
    }

    @Then("user should receive user carts")
    public void userShouldReceiveUserCarts() {
        getUserCarts.userShouldReceiveUserCarts();
    }

    @And("user receive response code OK")
    public void userReceiveResponseCode200oK() {
        getUserCarts.userReceiveResponseCode200oK();
    }

    ////////////////Add new product cart\\\\\\\\\\\\\\\\
    @Given("user is on the product cart POST page endpoint")
    public void userIsOnTheProductCartPOSTPageEndpoint() {
        addNewProductCart.userIsOnTheProductCartPOSTPageEndpoint();
    }

    @When("user on the request page with the endpoint, method POST and JSON format body")
    public void userOnTheRequestPageWithTheEndpointMethodPOSTAndJSONFormatBody() {
        addNewProductCart.userOnTheRequestPageWithTheEndpointMethodPOSTAndJSONFormatBody();
    }

    @Then("i receive the response code {int}OK")
    public void iReceiveTheResponseCodeOK(int arg0) {
        addNewProductCart.iReceiveTheResponseCodeOK();
    }

    @And("the post add new product cart that was just created")
    public void thePostAddNewProductCartThatWasJustCreated() {
    }

    ////////////////////////Update Product\\\\\\\\\\\\\\
    @Given("user is on the product cart put page endpoint")
    public void userIsOnTheProductCartPutPageEndpoint() {
        updateProductCart.userIsOnTheProductCartPutPageEndpoint();
    }

    @When("user request page with endpoint, put and json body format json")
    public void userRequestPageWithEndpointPutAndJsonBodyFormatJson() {
        updateProductCart.userRequestPageWithEndpointPutAndJsonBodyFormatJson();
    }

    @Then("i receive response code 200")
    public void iReceiveResponseCode200() {
        updateProductCart.iReceiveResponseCode();
    }

    @And("user success update product cart")
    public void userSuccesUpdateProductCart() {
    }

    ///////////////////Delete product Cart\\\\\\\\\\\\\
    @Given("user is on the delete cart page endpoint")
    public void userIsOnTheDeleteCartPageEndpoint() {
        deleteCart.userIsOnTheDeleteCartPageEndpoint();
    }

    @When("user request page with endpoint and Delete method")
    public void userRequestPageWithEndpointAndDeleteMethod() {
        deleteCart.userRequestPageWithEndpointAndDeleteMethod();
    }

    @Then("i receive response code ok{int}")
    public void iReceiveResponseCodeOk(int arg0) {
        deleteCart.iReceiveResponseCodeOk();
    }

    @And("user success delete product cart")
    public void userSuccessDeleteProductCart() {
    }
}
