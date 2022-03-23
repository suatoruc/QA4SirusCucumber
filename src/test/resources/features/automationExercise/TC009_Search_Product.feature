Feature: US009 Search Product
  
  Scenario: TC009 Search Product
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And kullanici Products butonuna tiklar
    When kullanici acilan sayfada ALL PRODUCTS yazisinin oldugunu teyit eder
    Then kullanici product sayfasindaki search kutusuna bir urun adi yazip arama yapar
    Then kullanici acilan sayfada SEARCHED PRODUCTS yazisini gordugunu teyit eder
    And kullanici arama ile ilgili tum urunlerin gorundugune emin olur

    