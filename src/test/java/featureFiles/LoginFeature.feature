Feature: Login The Facebook page
Scenario Outline: Login The Page 
Given Launch The Url
When user Enter the "<username>" in the Field
And user Enter the password "<password>" in the last Field
Then user click Login and Navigage to the NewsFeed

Examples:
  |username|password|
  |Robelin |1234|
  |Ramachandran|2345|
  |Hari|wednesday|