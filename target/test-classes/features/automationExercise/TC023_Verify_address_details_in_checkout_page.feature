Feature: US023 Verify address details in checkout page

  Scenario: TC023 Verify address details in checkout page
    Given kullanici "autoEx" sayfasina gider
    Then kullanici signin butonuna tiklar
    And kullanici new user signup yazisi altindaki kutulara name ve email bilgilerini gire
    And kullanici signup butonunu tiklar
    When kullanici kayit gormunda istenilen alanlari doldurur
    Then kullanici creat account butonuna basar
    And kullanici ACCOUNT CREATED! yazisinin gorundugunu teyit eder
    When kullanici kayit olusturdukdan sonra sayfadaki continue butonuna tiklar
    Then kullanici logged in as username yazisinin gorundugunu teyit eder
    When kullanici ilk urunu card a ekler
    And kullanici continue butonunu tıklar
    Then kullanici header daki cart butonunu tiklar
    And kullanici card sayfasinda oldugunu teyit eder
    When kulanici proceed to checout butonuna tiklar
    Then isim adres ve siparis bilgilerini dogru oldugunu teyit edin
    When fatura adresinin kayit sirasinda verilen adresle aynı oldugunu teyit eder
    And kullanici delete account butonuna basar
    When kullanici delete account yazisinin gorundugunu teyit eder





