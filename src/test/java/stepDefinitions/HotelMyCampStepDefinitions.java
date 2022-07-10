package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.hotelMyCampPage;
import utilities.ConfigReader;
import utilities.Driver;

public class HotelMyCampStepDefinitions {

    hotelMyCampPage hmcPage = new hotelMyCampPage();

    @Then("login yazisina tiklar")
    public void login_yazisina_tiklar() {
        hmcPage.loginButton.click();
    }
    @Then("gecerli username girer")
    public void gecerli_username_girer() {
        hmcPage.username.sendKeys(ConfigReader.getProperty("hotelValidUserName"));
    }
    @Then("gecerli password girer")
    public void gecerli_password_girer() {
        hmcPage.password.sendKeys(ConfigReader.getProperty("hotelValidPassword"));
    }
    @Then("Login butonuna basar")
    public void login_butonuna_basar() {
        hmcPage.loginButton2.click();
    }
    @Then("sayfaya giris yaptigini kontrol eder")
    public void sayfaya_giris_yaptigini_kontrol_eder() {
        Assert.assertTrue(hmcPage.usernameTest.isDisplayed());
    }
    @Then("kulllanici sayfayi kapatir")
    public void kulllanici_sayfayi_kapatir() {
        Driver.closeDriver();

    }

    @And("gecersiz password girer")
    public void gecersizPasswordGirer() {
        hmcPage.password.sendKeys(ConfigReader.getProperty("hotelWrongPassword"));
    }

    @Then("sayfaya giris yapilamadigini test eder")
    public void sayfayaGirisYapilamadiginiTestEder() {
        Assert.assertTrue(hmcPage.loginButton2.isDisplayed());
    }

    @And("gecersiz username girer")
    public void gecersizUsernameGirer() {
        hmcPage.username.sendKeys(ConfigReader.getProperty("hotelWrongUserName"));
    }


    @And("gecersiz username {string} girer")
    public void gecersizUsernameGirer(String istenenusername) {
        hmcPage.username.sendKeys(istenenusername);
    }

    @And("gecersiz password{string} girer")
    public void gecersizPasswordGirer(String istenenpassword) {
        hmcPage.username.sendKeys(istenenpassword);
    }
}
