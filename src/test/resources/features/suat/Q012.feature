Feature: US012 Genel Tekrar Sorulari

  Scenario: TC012 TC012 Buton Gorunur olma testi

    Given  kullanici "demoQaProp" sayfasina gider
    Then  kullanici wait for five second for visibility butonunun gorunur olmasını bekler
    Then  kullanici wait for five second for visibility butonunun gorunur oldugunu test eder