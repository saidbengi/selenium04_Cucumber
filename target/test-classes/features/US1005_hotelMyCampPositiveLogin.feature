Feature: US1005 dogru kullanici adi ile sifre ile giris yapabilmeli

  @hmc
  Scenario: Tc08 positive login test
    Given kullanici "hotelMyCamp" anasayfasinda
    Then login yazisina tiklar
    And gecerli username girer
    And gecerli password girer
    And Login butonuna basar
    Then sayfaya giris yaptigini kontrol eder
    And kulllanici sayfayi kapatir
