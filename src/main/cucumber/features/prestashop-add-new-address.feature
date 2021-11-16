Feature: Add new address
  Scenario Outline: Successful add new address
    Given Opened webpage: https://mystore-testlab.coderslab.pl
    And Click sing in button
    When Valid email=<email> and password=<password> provided in login and password input box
    And Click another sing in button
    And Go to addresses page
    And Click add new address button
    And Fill valid address data: <alias>, <address>, <city>, <postalcode>, <country>, <phone>
    And Click save button
    Then Confirmed add new address success: <alias>, <address>, <city>, <postalcode>, <country>, <phone>
    And Delete added address
    And Confirmed deleted added address
    And Browser quit

    Examples:
    | email                        | password  | alias | address   | city   | postalcode | country       | phone       |
    | vmllkmjbjfueezfaez@mrvpt.com | Warsztaty | Nowe  | Moja 19m3 | Krakov | 30-551     | United Kingdom | 888-888-888 |

