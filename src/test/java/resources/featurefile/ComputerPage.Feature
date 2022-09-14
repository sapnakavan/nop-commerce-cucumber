Feature: Computer Page


  Scenario: verify user should navigate to computer page successfully
    When I click on computer tab "Computer"
    Then I navigated computer page successfully


  Scenario: verify user should navigate to Desktop page successfully
    When I click on computer tab "Computer"
    Then I click on desktop link "Desktops"
    And I navigate to desktop page successfully


  Scenario Outline: verify user should build their own computer
    When I click on computer tab "Computer"
    Then I click on desktop link "Desktops"
    And I click on build your own computer "Build your own computer"
    And I select processor "<processor>"
    And I select ram "<ram>"
    And I select Hard disk "<hdd>"
    And I select Operating system "<os>"
    And I select software "<software>"
    And I click on add to cart tab
    Then my built product added to cart

    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |