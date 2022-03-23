Feature: US011 Verify Subscription


  Scenario: TC011 Verify Subscription in Cart page
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And  kullanici header daki cart butonunu tiklar
    When kullanici SUBSCRIPTION yazisinin gorundugunu teyit eder
    Then kullanici subscription input box'ına email adresini yapıp ok tusuna tiklar
    And kullanici You have been successfully subscribed! yazisini gordugunu teyit eder