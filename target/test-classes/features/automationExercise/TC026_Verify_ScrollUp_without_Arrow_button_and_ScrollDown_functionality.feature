Feature: US026 Verify Scroll Up


  Scenario: TC026 Verify Scroll Up without 'Arrow' button and Scroll Down functionality
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    When anasayfanin altindaki Subscription bolumune kadar scrooldown yapin
    Then kullanici SUBSCRIPTION yazisinin gorundugunu teyit eder
    And kullanici anasayfanin üst kismina kadar scroolup yapar
    Then kullanici sayfanin en üst kisminda Full-Fledged practice website for Automation Engineers yazisinin gorundugunu dogrular
