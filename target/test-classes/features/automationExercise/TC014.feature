Feature: US014 Place Order

  Scenario: TC014 Place Order: Register while Checkout
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And kullanici ilk urunu card a ekler
    When kullanici continue butonunu tıklar
    And kullanici header daki cart butonunu tiklar
    Then kullanici card sayfasinda oldugunu teyit eder
    When kulanici proceed to checout butonuna tiklar
    And kullanici acilan pencereden register-login butonuna tiklar
    Then kullanici new user signup yazisi altindaki kutulara name ve email bilgilerini gire
    And kullanici signup butonunu tiklar
    When kullanici kayit gormunda istenilen alanlari doldurur
    And kullanici creat account butonuna basar
    And kullanici ACCOUNT CREATED! yazisinin gorundugunu teyit eder
    When kullanici kayit olusturdukdan sonra sayfadaki continue butonuna tiklar
    Then kullanici logged in as username yazisinin gorundugunu teyit eder
    And kullanici header daki cart butonunu tiklar
    When kulanici proceed to checout butonuna tiklar
    Then isim adres ve siparis bilgilerini dogru oldugunu teyit edin
    And kullanici aciklama alanina aciklama girer ve place order butonuna tıklar
    When kullanici acılan sayfada name of card card number cvc ve expiration date bolumlerini dolduru
    Then kullanici pay and confirmorder butununa tiklar
    And kullanici our order has been placed successfully mesajini gördugunu teyit eder
    Then kullanici kayit olusturdukdan sonra sayfadaki continue butonuna tiklar
    When kullanici delete account butonuna basar
    Then kullanici delete account yazisinin gorundugunu teyit eder















