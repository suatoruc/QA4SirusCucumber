Feature: US001 Register


  Scenario: TC001 User Register
    Given kullanici "autoEx" sayfasina gider
    Then  adresin dogru adres oldugunu teyit eder
    And   kullanici signin butonuna tiklar
    Then  kullanici New User Signup yazisinin gorunur oldugunu teyit eder
    And   kullanici new user signup yazisi altindaki kutulara name ve email bilgilerini gire
    Then  kullanici signup butonunu tiklar
    And   kullanici ENTER ACCOUNT INFORMATION yazisinin gorundugunu teyit eder
    When  kullanici kayit gormunda istenilen alanlari doldurur
    Then  kullanici creat account butonuna basar
    And   kullanici ACCOUNT CREATED! yazisinin gorundugunu teyit eder
    When  kullanici continue butonunu tıklar
    Then  kullanici logged in as username yazisinin gorundugunu teyit eder
    And   kullanici delete account butonuna basar
    When  kullanici delete account yazisinin gorundugunu teyit eder




