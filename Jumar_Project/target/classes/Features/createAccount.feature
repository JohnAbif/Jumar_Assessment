Feature: Customer journey
		 This feature will create a new account and register a new user and find the most expensive dress



Scenario Outline: Verify that a user can register and find a dress

Given that user has navigated to the web application
And user has clicked on the Sign in link 
And enters email address in the create account section
And clicks on 'Create an Account' button
And user successfully fills out the details form
When user clicks on the 'Register' button
Then user's account would be created successfully
And user is able to log in with valid "<emailaddress>" and "<password>"
And find the most expensive dress
And add it to the cart
And logs out successfully
And user is able to log back in successfully with valid "<emailaddress>" and "<password>"
And ensure that the dress is still in the cart.

Examples:
| emailaddress       | password       |
| hive91@day.com     | Autumn2014!    |






		
		
		
		

	
		
	

	
	
	
	


