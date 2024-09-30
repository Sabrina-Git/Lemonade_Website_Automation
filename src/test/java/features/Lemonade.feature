Feature: Verifying the Car Web Page

  #positive test case
  #Case1
  Scenario: Entering valid data in all fields throughout multiple pages
    Given User navigate to the Lemonade homepage
    And   User click on the Check Our Prices button
    And   User click on Nope radio button and click on Next button
    And   User select the Car Insurance link
    And   User click on Next Button

    When user enters valid First Name
    And  user enters a valid Last Name
    And  user clicks on Next button
    And  user enters valid Address
    And  user clicks on the Next button
    And  user has to enter valid Email
    And  user clicks on Let Me Know button
    Then user clicks on Back Home button

    #Negative test case
    #Case2
  Scenario: Entering invalid data in all fields throughout multiple pages
    Given User navigate to the Lemonade homepage
    And   User click on the Check Our Prices button
    And   User click on Nope radio button and click on Next button
    And   User select the Car Insurance link
    And   User click on Next Button

    When user enters invalid First Name
    And  user enters a invalid Last Name
    And  user clicks on Next button
    And  user enters invalid Address
    And  user clicks on the Next button
    And  user has to enter invalid Email
    And  user clicks on Let Me Know button
    Then user clicks on Back Home button

    #Negative test case
    #Case3
  Scenario: Entering valid data in all fields and invalid data in email field throughout multiple pages
    Given User navigate to the Lemonade homepage
    And   User click on the Check Our Prices button
    And   User click on Nope radio button and click on Next button
    And   User select the Car Insurance link
    And   User click on Next Button

    When user enters valid First Name
    And  user enters a valid Last Name
    And  user clicks on Next button
    And  user enters valid Address
    And  user clicks on the Next button
    And  user has to enter invalid Email
    And  user clicks on Let Me Know button
    Then user clicks on Back Home button

    #positive test case
    #case4
  Scenario: Entering valid data in all fields and custom data in Address field throughout multiple pages
    Given User navigate to the Lemonade homepage
    And   User click on the Check Our Prices button
    And   User click on Nope radio button and click on Next button
    And   User select the Car Insurance link
    And   User click on Next Button

    When user enters valid First Name
    And  user enters a valid Last Name
    And  user clicks on Next button
    And  user enters valid custom Address
    And  user enters details of valid custom Address
    And  user clicks Next button
    And  user clicks on Looks Good button
    And  user has to enter valid Email
    And  user clicks on Let Me Know button
    Then user clicks on Back Home button



