Feature: Login Page Test
  Scenario: Login correct credentials
    Given User wil be on login page
    When User enter correct username and password and click login
    Then Verifiy login