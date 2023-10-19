Feature: Practice Plan login feature

  @LoginPage
  Scenario Outline: Practice Plan login to the System
    # data driven with excel sheet
    Given user is present on login page
    And title of login page is Login
    When user enters userID and Password from given sheetname "<SheetName>" and rownumber <RowNumber>
    And user clicks on login button
    Then user is on home page

    Examples: 
      | SheetName    | RowNumber |
      | LoginDetails |         0 |
      | LoginDetails |         1 |

  @ForgetPassword
  Scenario: User clicks on Forget Password Link
    Given user is present on login page
    And title of login page is Login
    Then User clicks on Forgot password link on home page

