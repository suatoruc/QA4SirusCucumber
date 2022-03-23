Feature: US020 Search Products and Verify

  Scenario: TC020 Search Products and Verify Cart After Login
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And kullanici Products butonuna tiklar
    When kullanici acilan sayfada ALL PRODUCTS yazisinin oldugunu teyit eder
    Then kullanici product sayfasindaki search kutusuna bir urun adi yazip arama yapar
    And kullanici acilan sayfada SEARCHED PRODUCTS yazisini gordugunu teyit eder
    When kullanici arama ile ilgili tum urunlerin gorundugune emin olur
    And kullanici ilk urunu card a ekler
    And kullanici continue butonunu tıklar
    Then kullanici header daki cart butonunu tiklar
    When kullanici card daki urunun sectigi urun oldugunu teyit eder
    And kullanici signin butonuna tiklar
    When email kutusuna email girer
    Then password kutusuna password girer
    And login butonuna tıklar
    When kullanici header daki cart butonunu tiklar
    And kullanici card daki urunun sectigi urun oldugunu teyit eder




