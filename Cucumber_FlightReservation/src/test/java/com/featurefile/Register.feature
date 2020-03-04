Feature: Register an account
Inorder to create an account
As a user
I want to enter details

Scenario Outline:Register an account with valid data
Given user is in the registerpage
When user enters details as<Fname>,<Lname>,<phone>,<email>,<uname> and <pwd>
And clicks on submit
Then successfully account should be created with customer name<uname>
Examples:
|Fname|Lname|phone|email|uname|pwd|
|Name1|Lname1|534473434|Name1@gmail.com|Name1|tester1|
|Name2|Lname2|534473435|Name2@gmail.com|Name2|tester2|
|Name2|Lname2|534473435|Name3@gmail.com|Name3|tester3|