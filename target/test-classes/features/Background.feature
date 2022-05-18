@Regression
Feature: Techfios Page set back ground validation

Background:
Given user is on Techfios Page

@Scenario1
Scenario: Set SkyBlue Background
When user click the skyblue button
Then Background color will change to sky blue

@Scenario2
Scenario: Set SkyBlue Background
When user click the white button
Then Background color will change to white blue