#Author
#Date
#Descreption


Feature: feature to test login functionality


  Scenario: Check login is sucessful with valid credentials
    Given user is on login page
    When user enters username and password
    And clicks on login button
    Then user navigate to home page

  
 