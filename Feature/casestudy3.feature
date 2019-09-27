Feature: Add to cart and payment 
Scenario: Successful online shopping
Given User enters the url
When user logs in
And user searches for a product by typing four chars and adds to cart
Then user makes the payment