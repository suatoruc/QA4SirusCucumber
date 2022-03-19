Feature:US01 Senario Outline Kullanarak Negatif Login Testi
  #1)https://qa-environment.koalaresorthotels.com/ sayfasina gidelim
  # 2)Cucumber parametre ,cucumber scenario outline ve TestNg framework
  # @Dataprovider kullanarak asagidaki gorevi tamamlayin
  #-    Login tusuna basin
  # - Asagidaki 5 kullanici adi ve sifreyi deneyin ve login olmadigini test edin
  # - Manager – Manager
  # - Manager1- Manager1
  # - Manager2 - Manager2
  # - Manager3 - Manager3
  # - Manager4 – Manager4


  Scenario Outline: TC001 Negatif Login Testi
    Given kullanici "resortHotel" sayfasina gider
    And gelismis butonuna basar
    Then yuklemeye devam et butonu tıklanır
    And kullanici login butonuna tiklar
    Then kullanici username olarak "<username>" yazar
    And kullanici password olarak "<password>" yazar
    Then kullanici sayfadaki log in butonuna basar
    And  giris yapilamadigi test eder
    Then kullanici sayfayi kapatir




    Examples:
      |username| |password|
      |Manager | |Manager|
      |Manager1| |Manager1|
      |Manager2| |Manager2|
      |Manager3| |Manager3|
      |Manager4| |Manager4|
