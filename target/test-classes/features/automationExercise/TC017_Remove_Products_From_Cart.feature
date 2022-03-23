Feature: US017 Remove Products

  Scenario: TC017 Remove Products From Cart
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And kullanici ilk urunu card a ekler
    Then kullanici continue butonunu tıklar
    When kullanici header daki cart butonunu tiklar
    Then kullanici card sayfasinda oldugunu teyit eder
    And kullanici urun aciklamasindaki X butonuna basarak urunu kaldirir
    When kullanici urunun kaldirildigina emin olur

