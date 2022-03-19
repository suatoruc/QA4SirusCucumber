Feature: US009 Genel Tekrar Soruları

  Scenario: TC009 Excele  Veri yazma

    Given excel Sayfasına baglan
    Then  baslik satirinda ilk bos hucreye yeni bir cell olusturalim
    And  Olusturdugumuz hucreye “ulke nufusu” yazdiralim
    Then 2.satir ulke nufusu kolonuna “1,5 milyar” yazdiralim
    And  8.satir nufus kolonuna 250 milyon yazdiralim
    Then dosyayi kayit edelim
    And  dosyayi kapatalim

