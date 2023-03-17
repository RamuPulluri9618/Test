#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: feature to enter login website

  Scenario: login by entering uid and password
    Given browser to login
    And enter url
    When enter <uid> and <password>
    And click on signin
    Then user navigate to website
    
    Examples:
    |uid|password|
    |standard_user|secret_sauce|
    |problem_user|secret_sauce|
    

 