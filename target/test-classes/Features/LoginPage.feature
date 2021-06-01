Feature: Verifying adactin details
Scenario Outline: Verifying adactin booking order with valid credentials
Given User is on the adactin page
When Login into the adactin hotel homepage using "<userName>" and "<password>"
And Search hotel by selecting "<Location>","<Hotels>","<RoomType>" and search
Then Select hotel using select
And Book the hotel using "<FirstName>","<LastName>","<BillingAddress>","<CreditCardNo.>",selectCreditCardType,"<Month>","<Year>","<CVVNumber>"and Book Now
Then User should verify success message
Examples: 
|userName|password|Location|Hotels|RoomType|FirstName|LastName|BillingAddress|CreditCardNo.|Month|Year|CVVNumber|
|karthi007|Karthi@1989|Adelaide|Hotel Hervey|Deluxe|Vignesh|Viki|Chennai|1456786534569876|May|2022|678|
