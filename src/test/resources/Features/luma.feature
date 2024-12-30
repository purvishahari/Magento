
Feature: User should check the functionality of login and registration of luma application

	Background:
			Given The user should be in homepage of application

	@register @e2e
  Scenario: User should check the functionality of registration page of luma application 
    When The user should click the create an account button 
    And The user should enter the required details of it
    Then The user should verify the page after create an account

	@login @e2e
  Scenario: User should check the functionality of login page of luma application
    When The user should click the signIn button 
    Then The user should enter the details of username and password
    And The user should verify the signIn page 
