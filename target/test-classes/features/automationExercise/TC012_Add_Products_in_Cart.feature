Feature: US012 Add Products

  Scenario: TC012 Add Products in Cart
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And kullanici Products butonuna tiklar
    When kullanici ilk urunu card a ekler
    Then kullanici continue butonunu tıklar
    And kullanici ikinci urunu card a ekler
    When kullanici continue butonunu tıklar
    And kullanici header daki cart butonunu tiklar
    Then secilen urunlerin listede oldugunu teyit eder



