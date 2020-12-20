Feature: flight booking on expedia
Scenario: flight booking funcanility test
Given User is on expedia home page
When user click on flight
And user click on roundtrip
And user choose economy class
And user enter depart airport
And user enter arival airport
And user choose departing month-date
And user choose returning month-date
And user click on scearch buttom
Then user see some relevant results
