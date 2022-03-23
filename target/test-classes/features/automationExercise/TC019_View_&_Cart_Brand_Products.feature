Feature: US019 View & Cart Brand Products

  Scenario: TC019 View  Cart Brand Products
    Given kullanici "autoEx" sayfasina gider
    Then kullanici Products butonuna tiklar
    And kullanici Markaların sayfanin solundaki frame de gorundugunu dogrular
    When clinician Polo markasini tiklar
    Then kullanici "Polo" marka sayfasina gittigi ve markanin urunlerini gordugunu dogrular
    When kullanici H&M markasini tiklar
    Then kullanici "H&M" marka sayfasina gittigi ve markanin urunlerini gordugunu dogrular






