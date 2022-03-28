Feature: Test the functionality of Order page


  Scenario: User input info
    Given user is already logged in to web table app
    When user is on the “Order” page
    Then user enters appropriate test data
    And Product
    And Quantity
    And Customer name
    And Street
    And City
    And State
    And Zip
    And Payment info:
    And Card type: Visa_MasterCard_American Express
    And Card No
    And Expire date
    Then user clicks to “Process Order”
    Then user should see new order in the table on “View all orders” page