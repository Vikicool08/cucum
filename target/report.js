$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/LoginPage.feature");
formatter.feature({
  "name": "Verifying adactin details",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verifying adactin booking order with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.step({
  "name": "Login into the adactin hotel homepage using \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "Search hotel by selecting \"\u003cLocation\u003e\",\"\u003cHotels\u003e\",\"\u003cRoomType\u003e\" and search",
  "keyword": "And "
});
formatter.step({
  "name": "Select hotel using select",
  "keyword": "Then "
});
formatter.step({
  "name": "Book the hotel using \"\u003cFirstName\u003e\",\"\u003cLastName\u003e\",\"\u003cBillingAddress\u003e\",\"\u003cCreditCardNo.\u003e\",selectCreditCardType,\"\u003cMonth\u003e\",\"\u003cYear\u003e\",\"\u003cCVVNumber\u003e\"and Book Now",
  "keyword": "And "
});
formatter.step({
  "name": "User should verify success message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "userName",
        "password",
        "Location",
        "Hotels",
        "RoomType",
        "FirstName",
        "LastName",
        "BillingAddress",
        "CreditCardNo.",
        "Month",
        "Year",
        "CVVNumber"
      ]
    },
    {
      "cells": [
        "karthi007",
        "Karthi@1989",
        "Adelaide",
        "Hotel Hervey",
        "Deluxe",
        "Vignesh",
        "Viki",
        "Chennai",
        "1456786534569876",
        "May",
        "2022",
        "678"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verifying adactin booking order with valid credentials",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User is on the adactin page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginPageSteps.user_is_on_the_adactin_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Login into the adactin hotel homepage using \"karthi007\" and \"Karthi@1989\"",
  "keyword": "When "
});
formatter.match({
  "location": "LoginPageSteps.login_into_the_adactin_hotel_homepage_using_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Search hotel by selecting \"Adelaide\",\"Hotel Hervey\",\"Deluxe\" and search",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.search_hotel_by_selecting_and_search(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Select hotel using select",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.select_hotel_using_select()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Book the hotel using \"Vignesh\",\"Viki\",\"Chennai\",\"1456786534569876\",selectCreditCardType,\"May\",\"2022\",\"678\"and Book Now",
  "keyword": "And "
});
formatter.match({
  "location": "LoginPageSteps.book_the_hotel_using_selectCreditCardType_and_Book_Now(String,String,String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should verify success message",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPageSteps.user_should_verify_success_message()"
});
formatter.result({
  "status": "passed"
});
});