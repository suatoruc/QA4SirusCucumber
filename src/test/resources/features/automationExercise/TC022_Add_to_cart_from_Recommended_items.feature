Feature: US022 Add to card

  Scenario: TC022 Add to cart from Recommended items
    Given kullanici "autoEx" sayfasina gider
    Then kullanici ana sayfanın en alt kısmına RECOMMENDED ITEMS bolumune gider
    And kullanici RECOMMENDED ITEMS gorunur oldugunu teyit eder
    When kullanici RECOMMENDED ITEMS daki ilk urunu card a ekler
    Then kullanici acilan pencereden view to card sekmesini tıklar
    And kullanici secilen urunun card sayfasinda oldugunu gorur


