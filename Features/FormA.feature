
Feature: @PPIJD 
 

  @Smoke
  Scenario: FormA
    Given User hit  Chrome Browser
    When user open url "https://sandbox-qa.niit.com/india/graduates/information-technology/post-graduate-program-full-stack-product-engineering" 
    And user enter Name as"Sachin" 
    And user enter Email as"Sachin1999685@test.com"
    And user enter Mobile numnber as "9755488458"
    And user enter city as"Gwalior"
    And user Click on submit Butoon

