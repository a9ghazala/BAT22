Feature:Admin
@virat
Scenario:Login with Valid Credential
Given User Lanch Chrome Browser
When User open url "https://admin-demo.nopcommerce.com/login"
And User enter Email as "admin@yourstore.com" and password as "admin"
And User click on Login button
Then User verify page title should be "DDDashboard/nopCommerce administration"
And close browser

@sachin
Scenario Outline:Login Data Driven
Given User Lanch Chrome Browser
When User open url "<url>"
And User enter Email as "<email>" and password as "<password>"
And User click on Login button
Then User verify page title should be "Dashboard/nopCommerce administration"
And close browser
Examples:
|url                                     |email                       |password             |
|https:\\admin-demo.nopcommerce.com\login|admin@yourstore.com         |admin                |
|https:\\admin-demo.nopcommerce.com\login|admin@yourstore.com         |admin             | 