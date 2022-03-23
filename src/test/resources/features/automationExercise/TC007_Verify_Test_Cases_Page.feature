Feature: US007 Verify Test Cases


  Scenario: TC007 Verify Test Cases Page

    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And  kullanici header da testCases butonuna tiklar
    When kullanici testCase sayfasinda oldugunu dogrular

