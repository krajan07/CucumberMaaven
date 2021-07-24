Feature: Home Screen Feature
  Description: This feature will be used for the Home Screen feature

  Background: 
    Given User has opened Simplilearn Application
    When User has entered correct Username "abc@xxyz.com"
    And User has entered correct Password "abc123"
    And User clicked on Login button
    Then User is logged in
    And User redirected to dashboard

  Scenario: Verify that user is able to see the course details subscribed
    Given User landed on dashboard screen
    When User has clicks on MyCourses
    Then User should be able to see the courses listed.