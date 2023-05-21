Feature: Search and place the order for products

@SmokeTest
Scenario: Search Experiance for product search in both home and offer page

Given user is on Greencard landing page
When user search with shortname "Tomato" and extracted actual name of the
Then user search for "Tomato" shortname in offer page to check if products exist "search"

@SmokeTest
Scenario Outline: Search Experiance with examples
Given user is on Greencard landing page
When user search with shortname <Names> and extracted actual name of the exp
Then user search for <Names> shortname in offer page to check if products exist "search" exp

Examples:
|Names|
|Strawberry|
|Potato|