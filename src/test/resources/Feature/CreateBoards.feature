#Author: Mahendra Etampawala
@tag
Feature: Feature to test create new board

  Background: 
    Given Directing to the "http://localhost:3000/"

  @tag1
  Scenario: Create new board
    And user clicks on create new board
    And user enters the board title as "Test board name"
    When user clicks on create board
    Then validate the created board
