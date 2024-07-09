#Author: Mahendra Etampawala
@tag
Feature: Feature to test the functionalities of a list

  # Background:
  # Given should be inside a board
  @tag1
  Scenario: verifying the functionality of adding a list
    And User clicks on Add a list
    And User enters the list title as "Test title"
    When User clicks on Add list
    Then Verifying the added list equals to "Test title"

  @tag
  Scenario: verifying the functionality of deleting a list
    And user clicks on three dots
    When user clicks on delete list
    Then Verifying that the item deleted successfully
