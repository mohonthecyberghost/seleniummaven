#Author: sazzad.cseofkuet@gmail.com
Feature: Registration in MercuryFlight site

	Background:
		Given I've a valid set of data and access
		
	#Datatable for UserDetails
	
	@Admin
	Scenario: Single User Registration process for Admin
		When Registration page Display
		Then Enter Valid Data
			| Username				| Admin		|
			| Password				| test123	|
			| ConfirmPassword	| test123	|
			
		Then Click on Submit
		Then Click Signoff
		And	 Close
		
		
	@User
	Scenario: Single User Registration process for User
		When Regsitration page Display
		Then Enter Valid Data
			| Username				| User		|
			| Password				| test857	|
			| ConfirmPassword	| test857	|
		Then Click on Submit
		Then Click Signoff