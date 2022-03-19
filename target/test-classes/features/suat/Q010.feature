Feature: US010 Genel Tekrar Sorular,

Scenario: TC010 DemoGuru test
  Given kullanici "demoQa" sayfasina gider
  And  kullanici alert butonuna tiklar
  Then click me butonuna basar
  And  alert uzerinde yazinin "This alert appeared after 5 seconds" oldugunu test eder
  Then ok diyerek alerti kapatır
