Feature: US003  incorrect login


  Scenario: TC003 Login User with incorrect email and password

    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And  kullanici signin butonuna tiklar
    When kullanici Login to your account yazisinin goruntugunu teyit eder
    Then kullanici yanlis email adres ve sifre girer
    And  login butonuna tıklar
    When Your email or password is incorrect! yazisini gordugunu teyit eder

