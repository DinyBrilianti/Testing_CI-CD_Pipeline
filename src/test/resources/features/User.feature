Feature: As user, I have be able to get all user info, Add new user, and Delete user

  @getAllUser
  Scenario: Get All User
    Given user is on the get all info user page endpoint
    When user is on the request page with an endpoint and a GET method
    Then user get information data
    And user receive response code 200 OK

  @getById
  Scenario: Get a single user
    Given user is on the single user by ID Get page endpoint
    When user is on the request page with an endpoint and GET method
    Then user get information single user
    And user receive the response code 200 OK

  @getLimitResult
  Scenario: Get limit result
    Given user is on the get limit result info user page endpoint
    When user is on the request page with an endpoint params and a GET method
    Then user get information limit result
    And user receive response code 200OK

  @getSortResult
  Scenario: Get sort result
    Given user is on the get sort result info user page endpoint
    When user is on the request page with an endpoint params and GET method
    Then user get information sort result
    And user receive response code 200 ok

  @addNewUser
  Scenario: Add a new user
    Given user is on the new user page endpoint
    When user is on the request page with an endpoint and a POST method
    Then user receive response code OK 200
    And new user that was just created

  @updateUser
  Scenario: Update a user
    Given user is on the update user page endpoint
    When user is on the request page with endpoint and PUT method
    And user receive the response code 200ok
    Then user receive valid data for update data

  @deleteUser
  Scenario: Delete a user
    Given User is on the delete page endpoint
    When user is on the request page endpoint with an delete method
    And user success delete user
    Then user receive response code OK200