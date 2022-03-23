Feature: US024 Download Invoice after purchase order


  Scenario: TC024 Download Invoice after purchase order
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And kullanici ilk urunu card a ekler
    When kullanici continue butonunu tıklar
    Then kullanici header daki cart butonunu tiklar
    And kullanici card sayfasinda oldugunu teyit eder
    When kulanici proceed to checout butonuna tiklar
    And kullanici acilan pencereden register-login butonuna tiklar
    When kullanici new user signup yazisi altindaki kutulara name ve email bilgilerini gire
    And kullanici signup butonunu tiklar
    Then kullanici kayit gormunda istenilen alanlari doldurur
    And kullanici creat account butonuna basar
    And kullanici kayit olusturdukdan sonra sayfadaki continue butonuna tiklar
    And kullanici logged in as username yazisinin gorundugunu teyit eder
    Then kullanici header daki cart butonunu tiklar
    When kulanici proceed to checout butonuna tiklar
    And isim adres ve siparis bilgilerini dogru oldugunu teyit edin
    Then kullanici aciklama alanina aciklama girer ve place order butonuna tıklar
    When kullanici acılan sayfada name of card card number cvc ve expiration date bolumlerini dolduru
    And kullanici pay and confirmorder butununa tiklar
    When kullanici our order has been placed successfully mesajini gördugunu teyit eder
    And kullanici payment sayfasindaki continue butonuna tiklar
    And kullanici delete account butonuna basar
    When kullanici delete account yazisinin gorundugunu teyit eder

