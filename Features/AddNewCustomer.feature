Feature:Customer

Scenario Outline:Add New Customer
Given User Lanch Chrome Browser
When User open url "<url>"
And User enter Email as "<email>" and password as "<password>"
And User click on Login button
Then User can view Dashboard
When user click on customers menu
And User click on customers menu item
And User click on new add button
Then User can view add new customer page
When user enter customer info as "<newEmail>" and "<newPass>" and "<fname>" and "<lname>" and "<gender>" and "<comName>" and "<adminComment>"
And user click on save button
Then User can view confirmation msg "The new customer has been added successfully."
And close browser
Examples:
|url|email|password |newEmail|newPass|fname|lname|gender|comName|adminComment|        
|https:\\admin-demo.nopcommerce.com\login|admin@yourstore.com|admin|raj121@gmail.com|1234|Bali|Raj|male|one|nice|
|https:\\admin-demo.nopcommerce.com\login|admin@yourstore.com |admin|afreen@gmail.com|1234|afreen|Ghazala|female|oneok|ok | 