package stepdefinations.suat;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.suat.AutoPracticePages;
import utilities.Driver;

public class AutoPracticeStepDefinations {
    AutoPracticePages app=new AutoPracticePages();
Faker faker=new Faker();
Actions actions=new Actions(Driver.getDriver());

    @Given("user sign in linkine tiklar")
    public void user_sign_in_linkine_tiklar() {
        app.anaSayfaSiginButonu.click();

    }
    @Given("user Create and account bölümüne email adresi girer")
    public void user_create_and_account_bölümüne_email_adresi_girer() {
        app.createAccountEmailInputBox.sendKeys(faker.internet().emailAddress());

    }
    @Given("Create an Account butonuna basar")
    public void create_an_account_butonuna_basar() {
        app.createAccountEmailbutton.click();

    }
    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
actions.click(app.kayitSayfasiTitleRadyoButonu).
        sendKeys(Keys.TAB).sendKeys(faker.name().firstName()).
        sendKeys(Keys.TAB).sendKeys(faker.name().lastName()).sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).sendKeys(faker.internet().password()).sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).sendKeys(faker.address().fullAddress()).sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).sendKeys(faker.address().city()).
        sendKeys(Keys.TAB).sendKeys(faker.address().state()).
        sendKeys(Keys.TAB).sendKeys(faker.address().zipCode()).
        sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
        sendKeys(Keys.TAB).sendKeys(faker.phoneNumber().cellPhone()).
        sendKeys(Keys.TAB).sendKeys(faker.name().name()).perform();

    }
    @Given("user Register butonuna basar")
    public void user_register_butonuna_basar() {
        app.kayitSayfasiRegisterButonu.click();

    }
    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {

        Assert.assertTrue(app.logoutButonElement.isDisplayed());

    }
    @Given("email kutusuna @isareti olmayan email adresi yazar ve enter'a tiklar")
    public void email_kutusuna_isareti_olmayan_email_adresi_yazar_ve_enter_a_tiklar() {
      app.createAccountEmailInputBox.sendKeys("deneme$deneme.com"+Keys.ENTER);
    }
    @Then("error mesajinin “Invalid email address”  oldugunu dogrulayin")
    public void error_mesajinin_ınvalid_email_address_oldugunu_dogrulayin() {
        Assert.assertTrue(app.hataliMailOlusturmaYazisi.isDisplayed());

    }

}
