Feature: Amazon website Test

Scenario: Validate amazon login test

Given User opens browser
Then page title is Amazon.ca: Low Prices – Fast Shipping – Millions of Items 
Then user hovers to signIn button and click
Then enter emailId and continue
Then enter password and continue
Then validate home page
Then close the browser