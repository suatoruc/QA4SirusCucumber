package stepdefinations.suat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import pages.suat.DemoQaPages;
import utilities.Driver;
import utilities.ReUsableMethods;

public class DemoQaStepDefinations {

DemoQaPages demoQaPages=new DemoQaPages();

    @Given("kullanici alert butonuna tiklar")
    public void kullanici_alert_butonuna_tiklar() {
        demoQaPages.alertButonElement.click();


    }
    @Then("click me butonuna basar")
    public void click_me_butonuna_basar() {
        demoQaPages.onButonClickTimeAlertButon.click();


    }
    @Then("alert uzerinde yazinin {string} oldugunu test eder")
    public void alert_uzerinde_yazinin_oldugunu_test_eder(String string) {
        ReUsableMethods.waitFor(10);
       String expected="This alert appeared after 5 seconds";
       Driver.getDriver().switchTo().alert();

    String actual=Driver.getDriver().switchTo().alert().getText();
      System.out.println("expected " + expected + " actual " + actual);
//
      Assert.assertTrue(actual.contains(expected));


    }
    @Then("ok diyerek alerti kapatır")
    public void ok_diyerek_alerti_kapatır() {
        Driver.getDriver().switchTo().alert().accept();


    }


    @Then("will enable five second after butonunun aktif olmasını bekle")
    public void willEnableFiveSecondAfterButonununAktifOlmasınıBekle() {
        ReUsableMethods.waitForClickability(demoQaPages.wait5SecondForClickButon,6);

    }

    @And("will enable five second after butonunun aktif oldugunu test et")
    public void willEnableFiveSecondAfterButonununAktifOldugunuTestEt() {
        Assert.assertTrue(demoQaPages.wait5SecondForClickButon.isEnabled());
    }

    @Then("kullanici wait for five second for visibility butonunun gorunur olmasını bekler")
    public void kullaniciWaitForFiveSecondForVisibilityButonununGorunurOlmasınıBekler() {
        ReUsableMethods.waitForVisibility(By.cssSelector("[id=\"visibleAfter\"]"),6);

    }

    @Then("kullanici wait for five second for visibility butonunun gorunur oldugunu test eder")
    public void kullaniciWaitForFiveSecondForVisibilityButonununGorunurOldugunuTestEder() {
        Assert.assertTrue(demoQaPages.wait5SecondForVisibilityButon.isDisplayed());
    }
}
