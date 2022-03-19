Feature: US08 Genel Tekrar Sorulari

  Scenario: TC08 Excelden Veri Okuma
    #Baskentler excelini framework’e ekleyelim ve excelle ilgili islemleri yaparak
    # dosyayi kullanilabilir hale getirelim

  #- 1.satirdaki 2.hucreye gidelim ve yazdiralim
  #- 1.satirdaki 2.hucreyi bir string degiskene atayalim ve yazdiralim - baskenti Jakarta olan ulke ismini yazdiralim
  #- Ulke sayisini bulalim
  #- Fiziki olarak kullanilan satir sayisini bulun
  #- Tum bilgileri map olarak kaydedelim
  #- baskenti Jakarta olan ulkenin tum bilgilerini yazdiralim
  #- Satir ve sutun bilgisi ile hucre yazdiralim


  Given 5.satirdaki 2.hucreye gidelim ve yazdiralim
    Then baskenti "Ankara" olan ulke ismini yazdiralim
    And Ulke sayisini bulalim
    Then Fiziki olarak kullanilan satir sayisini bulun
    And Tum bilgileri map olarak kaydedeli
    Then baskenti "Jakarta" olan ulke ismini yazdiralim
    And Satir ve sutun bilgisi ile hucre yazdiralim

