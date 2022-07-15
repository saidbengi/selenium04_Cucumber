Feature: US1008 Hotel My Camp Login
@negative
  Scenario Outline: TC13 kullanici gecerli bilgilerle giris yapar

    Given kullanici "hotelMyCamp" anasayfasinda
    Then login yazisina tiklar
    And gecersiz username "<gecersizusername>" girer
    And gecersiz password"<gecersizpassword>" girer
    And Login butonuna basar
    Then sayfaya giris yapilamadigini test eder
    And kulllanici sayfayi kapatir
    Examples:
      | gecersizusername | gecersizpassword |
      | Manager5         | Manager5!        |
      | Manager6         | Manager6!        |
      | Manager7         | Manager7!        |
      | Manager8         | Manager8!        |
      | Manager9         | Manager9!        |

