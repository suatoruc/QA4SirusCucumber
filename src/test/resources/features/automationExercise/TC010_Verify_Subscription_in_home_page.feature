Feature: US010 Verify Subscription

  Scenario: TC010 Verify Subscription in home page
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And kullanici sayfanin en altina kadar iner
    When kullanici SUBSCRIPTION yazisinin gorundugunu teyit eder
    Then kullanici subscription input box'ına email adresini yapıp ok tusuna tiklar
    And kullanici You have been successfully subscribed! yazisini gordugunu teyit eder




