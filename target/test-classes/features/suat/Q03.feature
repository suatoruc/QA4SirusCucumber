Feature: US003 Tekrar Soruları

  Scenario: TC003 Negatif Test
    Given kullanici "autoPractice" sayfasina gider
    #http://automationpractice.com/index.php sayfasina gidelim

  #Cucumber ile asagidaki testi yapalim
    And user sign in linkine tiklar
    And email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar
    Then error mesajinin “Invalid email address”  oldugunu dogrulayin
