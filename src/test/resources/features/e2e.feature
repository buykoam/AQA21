@gui
Feature: E2E test
  @smoke
  @TMS-001
  Scenario: Success Login
    Given open login page
    When user enter username standard_user and password secret_sauce
    * user clicks login button
    Then products page is displayed