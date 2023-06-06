Feature: As a user, I have be able to success login

  Scenario: Post user login
    Given user is on the login POST page endpoint
    When user makes request page with the endpoint, POST method and JSON format body
    Then  user get the data bearer token
    And user receive the response code 200 ok