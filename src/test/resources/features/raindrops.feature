Feature: The functionality of the raindrops function for single multiples

  @SingleMultiple
  Scenario: Sending 3 to the function
    Given I have a raindrops class
    When I pass in 3
    Then I am returned "Pling"

  @SingleMultiple
  Scenario: Sending 5 to the function
    Given I have a raindrops class
    When I pass in 5
    Then I am returned "Plang"

  @SingleMultiple
  Scenario: Sending 7 to the function
    Given I have a raindrops class
    When I pass in 7
    Then I am returned "Plong"

  @TwoMultiples
  Scenario: Sending a factor of 3 and 5 to the function
    Given I have a raindrops class
    When I pass in 15
    Then I am returned "PlingPlang"

  @TwoMultiples
  Scenario: Sending a factor of 3 and 7 to the function
    Given I have a raindrops class
    When I pass in 21
    Then I am returned "PlingPlong"

  @TwoMultiples
  Scenario: Sending a factor of 5 and 7 to the function
    Given I have a raindrops class
    When I pass in 35
    Then I am returned "PlangPlong"

  @ThreeMultiples
  Scenario: Sending a factor of 3,5 and 7 to the function
    Given I have a raindrops class
    When I pass in 105
    Then I am returned "PlingPlangPlong"

  @ThreeMultiples
  @UnusualCases
  Scenario: Sending 0 to the function
    Given I have a raindrops class
    When I pass in 0
    Then I am returned "PlingPlangPlong"

  @NoMultiples
  Scenario: Sending a non multiple of 3,5 or 7
    Given I have a raindrops class
    When I pass in 16
    Then I am returned "16"

  @NoMultiples
  Scenario: Sending a prime number
    Given I have a raindrops class
    When I pass in 2
    Then I am returned "2"

  @SingleMultiple
  @Negative
  Scenario: Sending -3 to the function
    Given I have a raindrops class
    When I pass in -3
    Then I am returned "Pling"

  @SingleMultiple
  @Negative
  Scenario: Sending -5 to the function
    Given I have a raindrops class
    When I pass in -5
    Then I am returned "Plang"

  @SingleMultiple
  @Negative
  Scenario: Sending -7 to the function
    Given I have a raindrops class
    When I pass in -7
    Then I am returned "Plong"

  @TwoMultiples
  @Negative
  Scenario: Sending a negative factor of 3 and 5 to the function
    Given I have a raindrops class
    When I pass in -15
    Then I am returned "PlingPlang"

  @TwoMultiples
  @Negative
  Scenario: Sending a negative factor of 3 and 7 to the function
    Given I have a raindrops class
    When I pass in -21
    Then I am returned "PlingPlong"

  @TwoMultiples
  @Negative
  Scenario: Sending a negative factor of 5 and 7 to the function
    Given I have a raindrops class
    When I pass in -35
    Then I am returned "PlangPlong"

  @ThreeMultiples
  @Negative
  Scenario: Sending a negative factor of 3,5 and 7 to the function
    Given I have a raindrops class
    When I pass in -105
    Then I am returned "PlingPlangPlong"