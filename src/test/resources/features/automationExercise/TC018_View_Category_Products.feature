Feature: US018 View Category Products

  Scenario: TC018 View Category Products
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And kullanici ana sayfada sol tarafda kategoriler bolumunu gormelidir
    Then kullanici ana sayfada sol tarafadaki kategoriler bolumunde kadin butonuna tiklar
    When kullanici anasayfada sol tarafdaki kategoriler bolumunde kadin sekmesinin altinda dress butonuna tiklar
    And kullanici kategori sayfasinda oldugunu ve WOMEN - TOPS PRODUCTS yazisinin gorundugunu teyit eder
    When kullanici anasayfada sol tarafta categori bolumundekadin sekmesi altinda tshird sekmesini tiklar
    And kullanici acilan sayfanin kategori sayfasi oldugunu dogrular





