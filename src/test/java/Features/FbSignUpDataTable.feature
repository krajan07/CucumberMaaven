Feature: Facebook Account Creation
  Description: This feature will be create the facebook login

  @DataTable
  Scenario: Account Creation using data table
    Given Facebook english web url is open
    When User clicks create new account button
    And User creates the new account
      | Field     | Value      |
      | FirstName | Siva      |
      | Surname   | Prakash       |
      | mobile    | 9000000001 |
      | Password  | siva123     |
      | dob       |          2 |
      | dom       | Sep        |
      | doy       |       1985 |
    And Select gender
    And Click signup button
    Then Account creation must be successful
