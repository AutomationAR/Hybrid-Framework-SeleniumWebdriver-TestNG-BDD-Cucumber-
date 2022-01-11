#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: TEST Daraz 

Scenario: verify that team sports has six links 
Given Initialize the browser and Navigate to Homepage
When User navigate to Team Sports 
Then Verify that team sports has six links  



Scenario: verify that cricket accessories page has 
Given Initialize the browser to Homepage
When Navigate to cricketpage
When Navigate to Accessoriespage and count
Then Display Count the links 
Then close browser

Scenario: verify that cricket accessories page's brand sialkotBrand has - links
Given Initialize Homepage
When User navigate to Accessories page 
Then Verify that SialkotBrand has - links  

Scenario: verify that cricket accessories page's brand ASSports has - item and display first name of the product
Given Initialize Homepage and nevigate to cricketpage
When User navigate to ASSports page 
Then display that ASSports has - links and first name  


 