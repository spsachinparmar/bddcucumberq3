Feature: @Facebook

@Smoke
  Scenario: login with Valid  credential
    Given User Launch Chrome Browser
    When User Open Url "https://www.facebook.com/"
    And User Enter Email as "8770471380" and password as "Sachu@1996"
    And User Click On Login Butoon
    Then User should be redirect on "Facebook"
    Then Close the browser
    
    Scenario Outline:  login Data Driven 
    Given User Launch Chrome Browser
    When User Open Url "https://www.facebook.com/"
    And User Enter Email as <email> and password as <password>"
    And User Click On Login Butoon
    Then User should be redirect on "Facebook"
    Then Close the browser
   Examples:
     | Email      | | password        |
     | 8770471380 | | Sachu@19969695 |
     | 8770471380 | | Sachu@1998694  |
    