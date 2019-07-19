

Feature: To test add customer functionality
 
  
  Scenario: To test the generate ID customer functionality
    Given The user is in add customer page
    
    When The user fill the add customer details
    And The user clicks the submit button
    
    Then The user should see custmerId generated
    @regression
    Scenario: To test the popup
    Given The user is in add customer page
    
    When The user fill the add customer details and missed one field
    And The user clicks the submit button
    
    Then The user should see pop up generated
    
 
  Scenario: To reset the Form
  Given The user is in add customer page
    
    When The user fill the add customer details
    And The user clicks the reset button
    
    Then The info given should be cleared
    
  Scenario: To check for error message
  Given The user is in add customer page 
  When customer add wrong format in mobile number textbox
  |firstname|Mady|
  |lastname|latha|
  |email|latha@gmail|
  |address|navooru|
  |phone|asdf|
  Then Pop up should come like Characters not allowed
  
  Scenario:To check home button functionality
  Given The user is in add customer page
  When The user fill the add customer details
  And The user clicks the submit button
  Given user is in access page
  When user click on home button
  Then user should navigate to home page or Index page
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    
