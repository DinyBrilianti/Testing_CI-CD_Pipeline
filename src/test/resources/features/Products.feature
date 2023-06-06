Feature: As a user feature, I have be able to success create, get, and delete product

  @getAllProduct
  Scenario: Get All Product
    Given user on the product GET page endpoint
    When user on the request page with an endpoint and GET method
    Then user should receive a list of products
    And I receive response code 200OK

  @getProductByID
  Scenario: Get Product By ID
    Given user on the product Get By Id page endpoint
    When  user on the request page with endpoint and GET method
    Then user should receive a category by ID
    And user receive the Response code 200 OK

  @getLimitResultProduct
  Scenario: Get Limit Result Product
    Given user on the product Get Limit Result page endpoint
    When user is on the request page with endpoint and GET method
    Then user should receive a limit result list of product
    And user receive response code 200ok

  @GetSortResults
  Scenario:Get Sort Results
    Given user on the product Get sort result page endpoint
    When user on the request page with an endpoint and method GET
    Then user get information sort results
    And user receive response code ok200

  @GetAllCategories
  Scenario: Get all categories
    Given user on the category GET page endpoint
    When user on the request page with Endpoint and GET method
    Then user should receive a list of categories product
    And user receive the response code 200OK

  @GetInCategory
  Scenario: Get in category
    Given user is on the category GET page endpoint
    When user is on the request page with an endpoint with ID and GET method
    Then user should receive a category
    And user receive the Response Code 200 OK

  @AddNewProduct
  Scenario: Add new product
    Given user is on the product POST page endpoint
    When user is on the request page with the endpoint, method POST and JSON format body
    Then i receive the response code 200 OK
    And the post add new product that was just created

  @UpdateProduct
  Scenario: Update a product
    Given user is on the product PUT page endpoint
    When user is on the request page with method and body
    Then i receive the response ok 200
    And user success update product

  @DeleteProduct
  Scenario: Delete a product
    Given user wants to delete post category with valid ID
    When user is on the request page with an endpoint with ID and DELETE method
    Then user receive response code 200 ok and data is null
    And post data with ID 6 has been deleted

