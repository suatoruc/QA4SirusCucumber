Feature: US015 Place Order

  Scenario: TC015 Place Order: Register before Checkout
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And kullanici signin butonuna tiklar
    When kullanici new user signup yazisi altindaki kutulara name ve email bilgilerini gire
    Then kullanici signup butonunu tiklar
    And  kullanici kayit gormunda istenilen alanlari doldurur
    When kullanici creat account butonuna basar
    When kullanici ACCOUNT CREATED! yazisinin gorundugunu teyit eder
    And kullanici kayit olusturdukdan sonra sayfadaki continue butonuna tiklar
    Then kullanici logged in as username yazisinin gorundugunu teyit eder
    Then kullanici ilk urunu card a ekler
    And kullanici header daki cart butonunu tiklar
    Then kullanici card sayfasinda oldugunu teyit eder
    When kulanici proceed to checout butonuna tiklar
    And isim adres ve siparis bilgilerini dogru oldugunu teyit edin
    And kullanici aciklama alanina aciklama girer ve place order butonuna tıklar
    When kullanici acılan sayfada name of card card number cvc ve expiration date bolumlerini dolduru
    Then kullanici pay and confirmorder butununa tiklar
    And kullanici our order has been placed successfully mesajini gördugunu teyit eder
    Then kullanici kayit olusturdukdan sonra sayfadaki continue butonuna tiklar
    When kullanici delete account butonuna basar
    Then kullanici delete account yazisinin gorundugunu teyit eder




