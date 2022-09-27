Feature: Register

  Scenario: Register a valid user
    Given I am on the registration page
    When I type in a valid and unique email of "hello@world.net"
    And I click the Create an account button
    And I am taken to the Create an account page
    And I type in a valid first name of "Billy" in your personal information
    And I type in a valid last name of "Tables" in your personal information
    And I type in a valid password of "foobar" in your personal information
    And I type in a valid first name of "Billy" in your address
    And I type in a valid last name of "Tables" in your address
    And I type in a valid address of "123 Overhere drive" in your address
    And I type in a valid city of "Overthere" in your address
    And I select a valid state of "South Dakota" in your address
    And I type in a valid zip code of "55555" in your address
    And I type in a valid mobile phone of "123-456-7890" in your address
    And I click the register button
    Then I should be redirected to the user page