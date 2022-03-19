package stepdefinations.suat;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.suat.HerOkuPages;
import utilities.Driver;
import utilities.ReUsableMethods;

import java.util.List;

public class HerOkuStepDefinations {

    HerOkuPages hop=new HerOkuPages();



    @Then("Add Element butona basin")
    public void add_element_butona_basin() {
        hop.addElementButon.click();

    }
    @Then("Delete butonu gorunur oluncaya kadar bekleyin")
    public void delete_butonu_gorunur_oluncaya_kadar_bekleyin() {
        ReUsableMethods.waitForVisibility(By.cssSelector("[onclick=\"deleteElement()\"]"),5);
    }
    @Then("Delete butonunun gorunur oldugunu test edin")
    public void delete_butonunun_gorunur_oldugunu_test_edin() {
        Assert.assertTrue(hop.deleteButonElement.isDisplayed());

    }
    @Then("Delete butonuna basarak butonu silin")
    public void delete_butonuna_basarak_butonu_silin() {
      ReUsableMethods.waitFor(3);
        hop.deleteButonElement.click();

    }
    @Then("Delete butonunun gorunmedigini test edin")
    public void delete_butonunun_gorunmedigini_test_edin() {
        List<WebElement>deleteButon= Driver.getDriver().findElements(By.cssSelector("[onclick=\"deleteElement()\"]"));
        Assert.assertTrue("delete butonu hala gorunuyor",deleteButon.isEmpty());

    }
}
