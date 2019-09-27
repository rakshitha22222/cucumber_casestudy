Feature: Login Action 
Scenario Outline:  successfully Login with Valid Credentialsd
Given the login page is open
When user click on signin
And user enter "<username>" and "<password>"
Then message displayed Login successfully

Examples: 
|username | password |
|lalitha |password123 |
|admin | password456 |
