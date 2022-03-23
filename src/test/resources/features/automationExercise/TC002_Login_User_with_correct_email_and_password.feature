Feature: US002 Login

  Scenario: TC002 login olma


    Given kullanici "autoEx" sayfasina gider
    Then  adresin dogru adres oldugunu teyit eder
    When  kullanici signin butonuna tiklar
    And   kullanici Login to your account yazisinin goruntugunu teyit eder
    Then  email kutusuna email girer
    And   password kutusuna password girer
    When  login butonuna tıklar
    When  kullanici logged in as username yazisinin gorundugunu teyit eder
    Then  kullanici delete account butonuna basar
    And  kullanici delete account yazisinin gorundugunu teyit eder
