Feature: US005 Register User


  Scenario: TC005 Register User with existing email

    Given kullanici "autoEx" sayfasina gider
    And adresin dogru adres oldugunu teyit eder
    Then  kullanici signin butonuna tiklar
    When kullanici New User Signup yazisinin gorunur oldugunu teyit eder
    Then yeni kullanici name ve email kutusuna varolan bir mail yazar
    And kullanici signup butonunu tiklar
    When Email Address already exist! yazisini gördügüne emin olur


