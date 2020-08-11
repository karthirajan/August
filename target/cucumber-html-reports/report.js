$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/AddCustomer.feature");
formatter.feature({
  "name": "Creating a new customer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add Customer",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch telecom site",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerSteps.user_launch_telecom_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on add customer button",
  "keyword": "And "
});
formatter.match({
  "location": "AddCustomerSteps.user_click_on_add_customer_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User filling up all the details",
  "keyword": "When "
});
formatter.match({
  "location": "AddCustomerSteps.user_filling_up_all_the_details()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click on submit buttonss",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "User will be displayed customer ID is generated",
  "keyword": "Then "
});
formatter.match({
  "location": "AddCustomerSteps.user_will_be_displayed_customer_ID_is_generated()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("src/test/resources/Features/AddTariff.feature");
formatter.feature({
  "name": "Tariff plan of the new customer",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Tariff plan",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch telecom site",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustomerSteps.user_launch_telecom_site()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User Click on Add Tariff Plan button",
  "keyword": "And "
});
formatter.match({
  "location": "TariffPlanSteps.user_Click_on_Add_Tariff_Plan_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User filling up all the details of the tariff plan",
  "keyword": "When "
});
formatter.match({
  "location": "TariffPlanSteps.user_filling_up_all_the_details_of_the_tariff_plan()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchFrameException: No frame element found by name or id flow_close_btn_iframe\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LENORIG-500GBSS\u0027, ip: \u0027192.168.225.183\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: driver.version: unknown\r\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteTargetLocator.frame(RemoteWebDriver.java:885)\r\n\tat com.telecom.stepdefinition.TariffPlanSteps.handleFrame(TariffPlanSteps.java:130)\r\n\tat com.telecom.stepdefinition.TariffPlanSteps.user_filling_up_all_the_details_of_the_tariff_plan(TariffPlanSteps.java:33)\r\n\tat ✽.User filling up all the details of the tariff plan(src/test/resources/Features/AddTariff.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks the submit button",
  "keyword": "And "
});
formatter.match({
  "location": "TariffPlanSteps.user_clicks_the_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User will be displayed with congratulation message",
  "keyword": "Then "
});
formatter.match({
  "location": "TariffPlanSteps.user_will_be_displayed_with_congratulation_message()"
});
formatter.result({
  "status": "skipped"
});
});