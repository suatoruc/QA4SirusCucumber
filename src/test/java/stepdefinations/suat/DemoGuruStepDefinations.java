package stepdefinations.suat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.suat.DemoGuruPages;
import utilities.Driver;
import utilities.ReUsableMethods;

import java.util.List;

public class DemoGuruStepDefinations {
DemoGuruPages dgp=new DemoGuruPages();

    @Then("Company listesini consola yazdirir")
    public void company_listesini_consola_yazdirir() {
        List<String>companyList= ReUsableMethods.getElements(By.xpath("//tbody/tr/td[1]"));
        System.out.println("Company List:" + companyList);

    }
    @Then("Power Finance Co'nun listede oldugunu test eder")
    public void power_finance_co_nun_listede_oldugunu_test_eder() {
        List<String>companyList= ReUsableMethods.getElements(By.xpath("//tbody/tr/td[1]"));
        Assert.assertTrue(companyList.contains("Power Finance Co"));
    }

    @Then("kullanici {int} siradaki Sirketin Prev Close degerini ekrana yazdirir")
    public void kullanici_siradaki_sirketin_prev_close_degerini_ekrana_yazdirir(Integer tabloNumarasi) {
       String dinamikxpath="//tbody/tr["+tabloNumarasi+"]/td[3]";
       String firmaismi="//tbody/tr["+tabloNumarasi+"]/td[1]";
        System.out.println(Driver.getDriver().findElement(By.xpath(firmaismi)).getText()+ " firmanın Prev Close Degeri: " + Driver.getDriver().findElement(By.xpath(dinamikxpath)).getText());

    }
    @Then("{int} satir, {int} sutun daki yaziyi yazdirir")
    public void satir_sutun_daki_yaziyi_yazdirir(Integer satir, Integer sutun) {
        String dinamikxpath="//tbody/tr["+satir+"]/td["+sutun+"]";
        System.out.println("istenilen " + satir + " satirdaki " + sutun + " sutunda yazan data: " + Driver.getDriver().findElement(By.xpath(dinamikxpath)).getText());
    }
    @And("kullanici {string} basligi altindaki tüm sutunu ekran yazdirir")
    public void kullanici_basligi_altindaki_tüm_sutunu_ekran_yazdirir(String istenilenBaslik) {
        List<String> baslikList=ReUsableMethods.getElements(By.xpath("//thead/tr/th"));
        int istenilenSutun=baslikList.indexOf(istenilenBaslik);
        String dinamikSutunPath="//tbody/tr//td["+(istenilenSutun+1)+"]";
        List<String>sutunElemanlari=ReUsableMethods.getElements(By.xpath(dinamikSutunPath));
        System.out.println("İstenilen Sutun Elemanları " + sutunElemanlari);


    }


}
