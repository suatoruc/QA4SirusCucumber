Feature: US02 Genel Tekrar


  Scenario: TC02 Yeni Kullanici Olusturma
   #http://automationpractice.com/index.php sayfasina gidelim
  Given kullanici "autoPractice" sayfasina gider
    #Cucumber ile asagidaki testi yapalim


    And user sign in linkine tiklar
    And user Create and account bölümüne email adresi girer
    And Create an Account butonuna basar
    And user kisisel bilgilerini ve iletisim bilgilerini girer
    And user Register butonuna basar
    Then hesap olustugunu dogrulayin

