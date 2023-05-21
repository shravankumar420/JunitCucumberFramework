Feature: Add vegetables
@RegTest
Scenario: Add Potato three kgs

Given user types "Potato" into text box "Search for Vegetables and Fruits"
When user click on "+"
And user click on "ADD TO CART"
And user clears text in search
And user types "Strawberry" into text box "Search for Vegetables and Fruits"
When user click on "+"
And user click on "ADD TO CART"
And user clears textbox "Search for Vegetables and Fruits"
Then user click on "bag" icon
And user click on "PROCEED TO CHECKOUT"
And user types "Apply" into text box "Enter promo code"
And user clears textbox "Enter promo code"
And user types "Apply" into text box "Enter promo code"
And user click on "Apply"
And user click on "Place Order"
And user click on "Select"
And user click on "India"
And user checks "checkbox"
And user click on "Proceed"