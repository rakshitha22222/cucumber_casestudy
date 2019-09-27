Feature: Login Feature
 
Scenario: registration process
Given the login page is opened
When enter user name as "rakshitharak"
When enter first anme as "rakshitha"and enter last name as "m"
When enter password as "rakshitha" and enter confirm password as "rakshitha"
When enter gender as Female
When enter email as "rakshitharaj25@@gmail.com" and enter mobile number as "7829333841" and DOB as "03/25/2995"
When enter address "rytsfdsjhgd" 
When enter sercurity question as 0 and answer as "jgd"
Then click on register
And user click on signout to exit the app
