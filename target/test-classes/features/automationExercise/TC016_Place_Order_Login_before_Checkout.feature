Feature: US016 Place Order

  Scenario: TC016 Place Order: Login before Checkout

    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And kullanici signin butonuna tiklar
    When email kutusuna email girer
    Then password kutusuna password girer
    And login butonuna tıklar
    Then kullanici ilk urunu card a ekler
    When kullanici header daki cart butonunu tiklar
    Then kullanici card sayfasinda oldugunu teyit eder
    And kulanici proceed to checout butonuna tiklar
    # isim ve adres bilgilerini sorgulayamıyoruz burada bug var hesap açıldıkdan sonra kullanici profilini gorebilecegimiz bir sayfa yok
    When kullanici card daki urunun sectigi urun oldugunu teyit eder
    And kullanici aciklama alanina aciklama girer ve place order butonuna tıklar
    When kullanici acılan sayfada name of card card number cvc ve expiration date bolumlerini dolduru
    Then kullanici pay and confirmorder butununa tiklar
    And kullanici our order has been placed successfully mesajini gördugunu teyit eder
    Then kullanici kayit olusturdukdan sonra sayfadaki continue butonuna tiklar
    When kullanici delete account butonuna basar
    Then kullanici delete account yazisinin gorundugunu teyit eder
