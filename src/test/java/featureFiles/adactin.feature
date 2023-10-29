Feature: Booking the hotel
Scenario: Login The Application
Given user Launch The Application
When user Enter The Login Name "RobelinR"
And user Enter The Password "14CSMQ"
Then user Click The Login and user Navigate To The Search Hotel

Scenario: Search The Hotel
When user Select The Location
And user Select The Hotels
And user Select The RoomType
And user Select The NoOfRoom
And user Enter The CheckInDate 
And user Enter The CheckOutDate
And user Select The AdultPerRoom
And user Select The ChildrenPerRoom
Then user Click The Search and Navigate to the Select Hotel

Scenario: Select The Hotel
When user Select The RadioButton
Then click The ContinueButton Navigate To Book A Hotel

Scenario: Book A Hotel
When user Enter The FirstName "Robelin"
And user Enter The LastName "R"
And user Enter The Address "No.28,ChennailastRoad"
And user Enter The CardNumber "1234567812345678"
And user Select The CardType
And user Select The Expiry Date
And user Select The Expiry year
And user Enter The CvvNumber "134"
Then user Click The BookNow and Navigate to Booking Confirmation  