Feature: checking functionality for add tariff plan

  Scenario Outline: Title of your scenario
    Given user is in add tariffplan page
    When entered all details "<monthrent>","<freelocalmins>","<freeintermins>","<freesms>","<localchargemins>","<interchargemins>","<smscharges>"
    And click on submit button
    Then user should see congrats message

    Examples: 
      | monthrent | freelocalmins | freeintermins | freesms | localchargemins | interchargemins | smscharges |
      |         1 |             2 |             3 |       4 |               5 |               6 |          7 |
      |        11 |            21 |            31 |      41 |              51 |              61 |         71 |

  Scenario: Checking Home button functionality
    Given user is in add tariffplan page
    When entered all details
      | monthrent       | 1 |
      | freelocalmins   | 2 |
      | freeintermins   | 3 |
      | freesms         | 4 |
      | localchargemins | 5 |
      | interchargemins | 6 |
      | smscharges      | 7 |
    And click on submit button
    Then user should see congrats message
    And user click on home button it should navigate to Homepage or IndexPage
    
    
    
    
    
    
    
    
