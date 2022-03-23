Feature: US025 Verify Scroll Up

  Scenario: TC025 Verify Scroll Up using 'Arrow' button and Scroll Down functionality
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And anasayfanin altindaki Subscription bolumune kadar scrooldown yapin
    Then Kullanici Subscription yazisinin gorundugunu teyit eder
    When Kullanici ok tuşlarini kullanarak sayfanın en ustune kadar cikar
    And kullanici sayfanin en üst kisminda Full-Fledged practice website for Automation Engineers yazisinin gorundugunu dogrular

