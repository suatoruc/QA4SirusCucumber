Feature: Contact Us


  Scenario: TC006 Contact Us Form
    Given kullanici "autoEx" sayfasina gider
    Then adresin dogru adres oldugunu teyit eder
    And  kullanici header kisminda contactUs butonuna tiklar
    When kullanici contactus sayfasinda GET IN TOUCH yazisinin gorunur olduguna emin olur
    Then kullanici contactus sayfasindaki name email subject ve message kisimlarini doldurur
    And kullanici submit butonuna basar
    When kullanici acilan popup pencereden ok tiklar
    Then Success! Your details have been submitted successfully.' yazisini gordugunu teyit eder



