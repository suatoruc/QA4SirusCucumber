package stepdefinations.suat;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.suat.ResortHotelsPages;
import utilities.ConfigReader;
import utilities.Driver;

public class ResortHotelStepDefinations {
    ResortHotelsPages rhp=new ResortHotelsPages();

    @Given("kullanici {string} sayfasina gider")
    public void kullanici_sayfasina_gider(String string) {
        Driver.getDriver().get(ConfigReader.getProperty(string));

    }
    @Given("kullanici login butonuna tiklar")
    public void kullanici_butonuna_tiklar() {
        rhp.HeaderLoginElement.click();


    }
    @Then("kullanici username olarak {string} yazar")
    public void kullanici_username_olarak_yazar(String username) {
        rhp.loginPageUsernameInputBox.sendKeys(username);

    }
    @Then("kullanici password olarak {string} yazar")
    public void kullanici_password_olarak_yazar(String password) {
       rhp.loginPagePasswordInputBox.sendKeys(password);

    }
    @Then("kullanici sayfadaki log in butonuna basar")
    public void kullanici_butonuna_basar() {
        rhp.loginPageLoginButon.click();

    }
    @Then("giris yapilamadigi test eder")
    public void giris_yapilamadigi_test_eder() {

        Assert.assertTrue(rhp.loginPageHataYazisi.isDisplayed());
    }
    @Then("kullanici sayfayi kapatir")
    public void kullanici_sayfayi_kapatir() {
        Driver.closeDriver();

    }
    @Given("gelismis butonuna basar")
    public void gelismis_butonuna_basar() {
     rhp.gelismisButonElement.click();
    }
    @Then("yuklemeye devam et butonu tıklanır")
    public void yuklemeye_devam_et_butonu_tıklanır() {
       rhp.sayfayiYüklemeyeDevamEtYaziElement.click();
    }

}
