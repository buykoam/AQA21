@gui
Feature: E2E test
  @smoke
  @TMS-001
  Scenario: Success Login
    Given open login page
    When user enter username standard_user and password secret_sauce
    * user clicks login button
    Then products page is displayed
    * user click on the product
    * user click on the cart button
    Then your cart page is displayed
    * user click on the checkout button
    Then your information page is displayed
    * user enter first name and lastname and postal code
    * user clicks continue button
    Then  overview page is displayed
    * user click on the finish button
    Then  complete page is displayed