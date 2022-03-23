Feature: US021 Add review on product

  Scenario: TC021 Add review on product
    Given kullanici "autoEx" sayfasina gider
    Then kullanici Products butonuna tiklar
    And kullanici acilan sayfada ALL PRODUCTS yazisinin oldugunu teyit eder
    When kullanici ilk urun icin view product butonuna basar
    Then Write Your Review yazisinin gorundugunu teyit eder
    And urundetails sayfasinda writeyourrevies bolumunde name,email ve gorus alanlarini dolduru
    Then kullanici urundetails sayfasindaki submit butonuna basar
    And  Thank you for your review mesajinin gorundugune emin olur


