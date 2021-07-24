Feature: Facebook Account Creation
  Description: This feature will be create the facebook login

	@Simple
  Scenario Outline: Account Creation
    Given Facebook english version is open
    When User click on create new account button
    And User provides firstname "<FirstName>"
    And User provides surname "<Surname>"
    And User provides mobilenumber "<mobile>"
    And User provides password "<password>"
    And User provides dob "<dob>"
    And User provides dom "<dom>"
    And User provides doy "<doy>"
    And User selects the gender
    And click on signup button
    Then Account must be created for the user

    Examples: 
      | FirstName | Surname | mobile     | password | dob | dom | doy  |
      | Krish     | Siva    | 9000000000 | kri123   |   7 | Sep | 1985 |