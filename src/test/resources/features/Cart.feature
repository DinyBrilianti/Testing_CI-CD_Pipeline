Feature: As a user feature, I have be able to success create, get, and delete cart

  @getAllCart
  Scenario: Get All Cart
    Given user on the cart GET page endpoint
    When user on the request page with endpoint and get method
    Then user should receive a list of cart
    And I receive response code 200 OK

  @getCartById
  Scenario: Get cart by ID
    Given user is on the cart GET page endpoint
    When user request page with an endpoint with ID and GET method
    Then user should receive a cart by ID
    And user receive the Response code 200

  @getLimitResultsCart
  Scenario: Get Limit Result Cart
    Given user on the cart Get Limit Result page endpoint
    When user on the request page with endpoint and Get method
    Then user should receive a limit result list of cart
    And user receive response code 200

  @getSortResults
  Scenario: Get Sort results
    Given user on the get sort results cart page endpoint
    When user on request page with endpoint and Get method
    Then user Should receive a sort results
    And user receive response code Ok200

  @GetCartsInDateRange
  Scenario: Get carts in date range
    Given user on the get carts in date range page endpoint
    When user on request page with get method and endpoint
    Then user should receive carts in date range
    And user receive response code 200oK

  @GetUserCarts
  Scenario: Get user carts
    Given user on the get user carts page endpoint
    When user request page with endpoint and Get method
    Then user should receive user carts
    And user receive response code OK

  @AddNewProductCart
  Scenario: Add a new product cart
    Given user is on the product cart POST page endpoint
    When user on the request page with the endpoint, method POST and JSON format body
    Then i receive the response code 200OK
    And the post add new product cart that was just created

  @UpdateProductCart
  Scenario: update product cart
    Given user is on the product cart put page endpoint
    When user request page with endpoint, put and json body format json
    Then i receive response code 200
    And user success update product cart

  @DeleteProductCart
  Scenario: delete product cart
    Given user is on the delete cart page endpoint
    When user request page with endpoint and Delete method
    Then i receive response code ok200
    And user success delete product cart