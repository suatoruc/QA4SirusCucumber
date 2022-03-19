Feature: US04 Genel Tekrar Sorulari

  Scenario: TC004 data alma Testi
    Given kullanici "demoGuru" sayfasina gider
    #http://demo.guru99.com/test/web-table-element.php sayfasina gidelim

    Then Company listesini consola yazdirir
    And Power Finance Co'nun listede oldugunu test eder
