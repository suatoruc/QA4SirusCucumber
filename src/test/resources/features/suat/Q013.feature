Feature: US013 Genel Tekrar Sorulari

  Scenario: TC013 Buton Ekleme Testi
    Given kullanici "herOku" sayfasina gider
    Then Add Element butona basin
    And  Delete butonu gorunur oluncaya kadar bekleyin
    Then Delete butonunun gorunur oldugunu test edin
    And  Delete butonuna basarak butonu silin
    Then Delete butonunun gorunmedigini test edin
