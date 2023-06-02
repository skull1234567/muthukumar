Feature: Buy the product from LimeRoad
Background:
When Launch the url "https://www.limeroad.com/?occasion=tshirt"

@Tshirt
Scenario: Select the Product in LimeRoad
And Click on Shop Men
Then Click on Tshirt option
And go to select particular tshirt department
And Select the product
Then Click on Add to cart
#And Close the browser


@Jeans
Scenario: Select the jeans in LimeRoad
And Click on Men
Then Click on jeans option
And go to select particular jean department
And Select the pant
Then Click on cart
