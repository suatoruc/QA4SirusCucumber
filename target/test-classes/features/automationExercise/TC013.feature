Feature: Verify Product


  Scenario: TC013 Verify Product quantity in Cart

    Given kullanici "autoEx" sayfasina gider
    And adresin dogru adres oldugunu teyit eder
    Then kullanici Products butonuna tiklar
    When kullanici ilk urun icin view product butonuna basar
    Then kullanici sectigi urunun miktarini 4 e cikarir
    And kullanici addtocard butonuna tiklayip urunleri sepete atar
    Then kullanici continue butonunu tıklar
    And kullanici header daki cart butonunu tiklar
    When Kullanici urunun sepet sayfasında secilen urunun miktarinin 4 gorundugunu teyit eder

