Feature: US004 LogOut Test


  Scenario: TC004 Logout User
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And  kullanici signin butonuna tiklar
    When kullanici Login to your account yazisinin goruntugunu teyit eder
    Then email kutusuna email girer
    And password kutusuna password girer
    When login butonuna tıklar
    Then kullanici logged in as username yazisinin gorundugunu teyit eder
    When kullanici logout butonuna basa
    And  kullanici loginPage sayfasina donuldugunu teyit eder
