Feature: US008  Verify All Products and product



  Scenario: TC008  Verify All Products and product detail page
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And kullanici Products butonuna tiklar
    When kullanici acilan sayfada ALL PRODUCTS yazisinin oldugunu teyit eder
    Then kullanici urun listesinin gorunur oldugunu teyit eder
    And kullanici ilk urun icin view product butonuna basar
    Then kullanici urun detay sayfasinin acildiginı teyit eder
    Then kullanici acilan sayfada urun adı, kategori, fiyat, bulunabilirlik, durum, marka bilgilerinin gorunur oldugunu teyit eder


