Feature: Practice Plan login Page

  @ForgetPassword
  Scenario: User clicks on Forget UserName Link
    Given user is present on login page
    And title of login page is Login
    Then User clicks on Forgot UserName link on home page

  @ForgetPassword
  Scenario: User clicks on Forget Both Link
    Given user is present on login page
    And title of login page is Login
    Then User clicks on Forgot Both link on home page
