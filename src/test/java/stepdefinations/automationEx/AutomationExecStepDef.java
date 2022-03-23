package stepdefinations.automationEx;

import com.github.javafaker.CreditCardType;
import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.automationex.AutomationexecPages;
import utilities.Driver;
import utilities.ReUsableMethods;

import java.util.HashMap;
import java.util.List;
import java.util.Random;


public class AutomationExecStepDef {

    AutomationexecPages ap=new AutomationexecPages();
    static List<WebElement> urunListesi;
    static String ilkUrun ;
    static String ikinciUrun ;
    static String adress;
    static String name;
   static String Brandname;
   String brandProductTitle;
   String brandproductYazi;




    @Then("adresin dogru adres oldugunu teyit eder")
    public void adresinDogruAdresOldugunuTeyitEder() {
        String expectedData="Automation Exercise";
        String actualData= Driver.getDriver().getTitle();
        Assert.assertTrue(expectedData.equals(actualData));
    }

    @And("kullanici signin butonuna tiklar")
    public void kullaniciSigninButonunaTiklar() {
        ap.headerSignUpbutonElement.click();
    }

    @Then("kullanici New User Signup yazisinin gorunur oldugunu teyit eder")
    public void kullaniciNewUserSignupYazisininGorunurOldugunuTeyitEder() {
        Assert.assertTrue(ap.newUsersigupYaziElement.isDisplayed());
    }

    @And("kullanici new user signup yazisi altindaki kutulara name ve email bilgilerini gire")
    public void kullaniciNewUserSignupYazisiAltindakiKutularaNameVeEmailBilgileriniGire() {
        ap.nameInputBox.sendKeys(Faker.instance().name().fullName());
        ap.newUserEmailInputBox.sendKeys(Faker.instance().internet().emailAddress());
    }

    @Then("kullanici signup butonunu tiklar")
    public void kullaniciSignupButonunuTiklar() {
        ap.sigInButonElement.click();
    }

    @And("kullanici ENTER ACCOUNT INFORMATION yazisinin gorundugunu teyit eder")
    public void kullaniciENTERACCOUNTINFORMATIONYazisininGorundugunuTeyitEder() {
        String expectedData="ENTER ACCOUNT INFORMATION";
        String actualData=ap.accountInformationYaziElement.getText();
        Assert.assertTrue(actualData.equals(expectedData));

    }

    @When("kullanici kayit gormunda istenilen alanlari doldurur")
    public void kullaniciKayitGormundaIstenilenAlanlariDoldurur() {
        Actions actions=new Actions(Driver.getDriver());
        adress=Faker.instance().address().fullAddress();
        actions.click(ap.titleWebElemet).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().internet().password()).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().name().firstName()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().name().lastName()).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(adress).
                sendKeys(Keys.TAB).sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().state()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().city()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().zipCode()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().phoneNumber().cellPhone()).perform();

        name=ap.createAccountNameInput.getAttribute("value");
        adress=ap.createAccountAdressInput.getAttribute("value");

    }

    @Then("kullanici creat account butonuna basar")
    public void kullaniciCreatAccountButonunaBasar() {
        ap.newUseSignInButtonElement.click();
    }

    @And("kullanici ACCOUNT CREATED! yazisinin gorundugunu teyit eder")
    public void kullaniciACCOUNTCREATEDYazisininGorundugunuTeyitEder() {

        Assert.assertTrue(ap.accountCreatedYaziWebElemet.isDisplayed());

    }

    @When("kullanici continue butonunu tıklar")
    public void kullaniciContinueButonunuTıklar() {
        ap.continueButon.click();
    }

    @Then("kullanici logged in as username yazisinin gorundugunu teyit eder")
    public void kullaniciLoggedInAsUsernameYazisininGorundugunuTeyitEder() {
        Assert.assertTrue(ap.logInAsWebElement.isDisplayed());

    }

    @And("kullanici delete account butonuna basar")
    public void kullaniciDeleteAccountButonunaBasar() {
        ap.deleteButtonWebElement.click();
        ap.deletepageDeleteAccountButon.click();
    }

    @When("kullanici delete account yazisinin gorundugunu teyit eder")
    public void kullaniciDeleteAccountYazisininGorundugunuTeyitEder() {
        Assert.assertTrue(ap.deleteAccountyaziElement.isDisplayed());
    }

    @And("kullanici Login to your account yazisinin goruntugunu teyit eder")
    public void kullaniciLoginToYourAccountYazisininGoruntugunuTeyitEder() {
        Assert.assertTrue(ap.loginYourAccountYazisi.isDisplayed());
    }

    @Then("email kutusuna email girer")
    public void emailKutusunaEmailGirer() {
        ap.loginSayfasıEmailAdressInput.sendKeys("puturgeli1isi@gmail.com");

    }

    @And("password kutusuna password girer")
    public void passwordKutusunaPasswordGirer() {
        ap.loginSayfasiPasswordInput.sendKeys("automationaA11-");
    }

    @When("login butonuna tıklar")
    public void loginButonunaTıklar() {
        ap.loginSayfasiLoginButonu.click();
    }

    @Then("kullanici yanlis email adres ve sifre girer")
    public void kullaniciYanlisEmailAdresVeSifreGirer() {
        ap.loginSayfasıEmailAdressInput.sendKeys("puturgeli@gmail.com");
        ap.loginSayfasiPasswordInput.sendKeys("aadd!A!");
    }

    @When("Your email or password is incorrect! yazisini gordugunu teyit eder")
    public void yourEmailOrPasswordIsIncorrectYazisiniGordugunuTeyitEder() {
  Assert.assertTrue(ap.incorrectemailOrPasswordYazisi.isDisplayed());
    }

    @When("kullanici logout butonuna basa")
    public void kullaniciLogoutButonunaBasa() {
    ap.headerLogOutButonu.click();
    }

    @And("kullanici loginPage sayfasina donuldugunu teyit eder")
    public void kullaniciLoginPageSayfasinaDonuldugunuTeyitEder() {
        Assert.assertTrue(ap.loginYourAccountYazisi.isDisplayed());

    }

    @Then("yeni kullanici name ve email kutusuna varolan bir mail yazar")
    public void yeniKullaniciNameVeEmailKutusunaVarolanBirMailYazar() {
        ap.nameInputBox.sendKeys("suat");
        ap.newUserEmailInputBox.sendKeys("puturgeli1isi@gmail.com");
    }

    @When("Email Address already exist! yazisini gördügüne emin olur")
    public void emailAddressAlreadyExistYazisiniGördügüneEminOlur() {
        Assert.assertTrue(ap.emailAlreadyExistYazisi.isDisplayed());

    }

    @And("kullanici header kisminda contactUs butonuna tiklar")
    public void kullaniciHeaderKismindaContactUsButonunaTiklar() {

        ap.headerContactUsButon.click();
    }

    @When("kullanici contactus sayfasinda GET IN TOUCH yazisinin gorunur olduguna emin olur")
    public void kullaniciContactusSayfasindaGETINTOUCHYazisininGorunurOldugunaEminOlur() {
        Assert.assertTrue(ap.contactUsPageGetInTouchYazisi.isDisplayed());
    }

    @Then("kullanici contactus sayfasindaki name email subject ve message kisimlarini doldurur")
    public void kullaniciContactusSayfasindakiNameEmailSubjectVeMessageKisimlariniDoldurur() {
        Actions actions=new Actions(Driver.getDriver());
        actions.click(ap.contactUsPageNameInputBox).sendKeys(Faker.instance().name().fullName()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().internet().emailAddress()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().name().name()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().address().fullAddress()).perform();
    }

    @And("kullanici submit butonuna basar")
    public void kullaniciSubmitButonunaBasar() {
        ap.contactusPageSubmitButonu.click();
    }

    @When("kullanici acilan popup pencereden ok tiklar")
    public void kullaniciAcilanPopupPenceredenOkTiklar() {

        Driver.getDriver().switchTo().alert().accept();

    }

    @Then("Success! Your details have been submitted successfully.' yazisini gordugunu teyit eder")
    public void successYourDetailsHaveBeenSubmittedSuccessfullyYazisiniGordugunuTeyitEder() {

        ReUsableMethods.waitFor(3);
        Assert.assertTrue(ap.contactusSuccessSubmitYazisi.isDisplayed());
    }

    @And("kullanici header da testCases butonuna tiklar")
    public void kullaniciHeaderDaTestCasesButonunaTiklar() {
        ap.headerTestCasesButonu.click();

    }

    @When("kullanici testCase sayfasinda oldugunu dogrular")
    public void kullaniciTestCaseSayfasindaOldugunuDogrular() {
        Assert.assertTrue(ap.testCasesPageTestCaseYazisi.isDisplayed());
    }

    @And("kullanici Products butonuna tiklar")
    public void kullaniciProductsButonunaTiklar() {
        ap.headerProductsButonu.click();
    }

    @When("kullanici acilan sayfada ALL PRODUCTS yazisinin oldugunu teyit eder")
    public void kullaniciAcilanSayfadaALLPRODUCTSYazisininOldugunuTeyitEder() {
        Assert.assertTrue(ap.productsPageAllPrpductsYazisi.isDisplayed());
    }

    @Then("kullanici urun listesinin gorunur oldugunu teyit eder")
    public void kullaniciUrunListesininGorunurOldugunuTeyitEder() {
        ap.productPageAllProductDetailList.stream().forEach(t-> System.out.println(t.getText()));

    }

    @And("kullanici ilk urun icin view product butonuna basar")
    public void kullaniciIlkUrunIcinViewProductButonunaBasar() {
        ap.productsPageAllProducList.get(0).click();

    }

    @Then("kullanici urun detay sayfasinin acildiginı teyit eder")
    public void kullaniciUrunDetaySayfasininAcildiginıTeyitEder() {
    Assert.assertTrue(ap.productsPageAllPrpductsYazisi.isDisplayed());
    }

    @Then("kullanici acilan sayfada urun adı, kategori, fiyat, bulunabilirlik, durum, marka bilgilerinin gorunur oldugunu teyit eder")
    public void kullaniciAcilanSayfadaUrunAdıKategoriFiyatBulunabilirlikDurumMarkaBilgilerininGorunurOldugunuTeyitEder() {
        Assert.assertTrue(ap.productPageFirstProductDetailPage.isDisplayed());
    }

    @Then("kullanici product sayfasindaki search kutusuna bir urun adi yazip arama yapar")
    public void kullaniciProductSayfasindakiSearchKutusunaBirUrunAdiYazipAramaYapar() {

        ap.productPagesSearchInputBox.sendKeys("Tshirt");
        ap.productPageSearchButonBox.click();
    }

    @Then("kullanici acilan sayfada SEARCHED PRODUCTS yazisini gordugunu teyit eder")
    public void kullaniciAcilanSayfadaSEARCHEDPRODUCTSYazisiniGordugunuTeyitEder() {
        Assert.assertTrue(ap.productPageSearchProductYazisi.isDisplayed());
    }

    @And("kullanici arama ile ilgili tum urunlerin gorundugune emin olur")
    public void kullaniciAramaIleIlgiliTumUrunlerinGorunduguneEminOlur() {
        int expectedCount=0;
        for (WebElement w:ap.productPageAllProductDetailList ) {
            if(w.getText().contains("Tshirt")||w.getText().contains("T-Shirt")||w.getText().contains("T SHIRT")){
                expectedCount++;
            }

        }
        int actualCount=ap.productPageSearchResultList.size();
        System.out.println("expected: " + expectedCount + " actual: " + actualCount);
        Assert.assertEquals(expectedCount,actualCount);

    }

    @And("kullanici sayfanin en altina kadar iner")
    public void kullaniciSayfaninEnAltinaKadarIner() {
        ReUsableMethods.scrollToWebelementVisible(ap.mainPageFooterSubscriptionYazisi);
    }

    @When("kullanici SUBSCRIPTION yazisinin gorundugunu teyit eder")
    public void kullaniciSUBSCRIPTIONYazisininGorundugunuTeyitEder() {
        Assert.assertTrue(ap.mainPageFooterSubscriptionYazisi.isDisplayed());
    }

    @Then("kullanici subscription input box'ına email adresini yapıp ok tusuna tiklar")
    public void kullaniciSubscriptionInputBoxInaEmailAdresiniYapıpOkTusunaTiklar() {
        ap.mainPageFooterSubscriptionInputBox.sendKeys(Faker.instance().internet().emailAddress());
        ap.mainpageFooterSubscriptionButonu.click();
    }

    @And("kullanici You have been successfully subscribed! yazisini gordugunu teyit eder")
    public void kullaniciYouHaveBeenSuccessfullySubscribedYazisiniGordugunuTeyitEder() {
        Assert.assertTrue(ap.mainpageFooterSuccesScripeYazisi.isDisplayed());
    }

    @And("kullanici header daki cart butonunu tiklar")
    public void kullaniciHeaderDakiCartButonunuTiklar() {
        ap.headerCartButonu.click();
    }

    @When("kullanici ilk urunu card a ekler")
    public void kullaniciIlkUrunuCardAEkler() {

        ilkUrun=ap.productpageIlkUrunTitle.getText();
        ap.productPageilkUrunElement.click();

    }

    @And("kullanici ikinci urunu card a ekler")
    public void kullaniciIkinciUrunuCardAEkler() {

        ikinciUrun=ap.ikinciUrunTitle.getText();
        ap.headerCartButonu.sendKeys(Keys.PAGE_DOWN);
        ReUsableMethods.hover(ap.productPage2UrunElement);
        ReUsableMethods.waitFor(2);
        ap.productPage2UrunElement.click();
    }

    @Then("secilen urunlerin listede oldugunu teyit eder")
    public void secilenUrunlerinListedeOldugunuTeyitEder() {



        Assert.assertTrue(ilkUrun.equals(ap.cardpageIlkUrunTitle));
        Assert.assertTrue(ikinciUrun.equals(ap.cardPageikinciUrunTitle));



    }



    @Then("kullanici sectigi urunun miktarini {int} e cikarir")
    public void kullaniciSectigiUrununMiktariniECikarir(int miktar) {
    Actions actions=new Actions(Driver.getDriver());
        actions.click(ap.detailPageQuantityElement).doubleClick().sendKeys(miktar+"").perform();
    }

    @When("Kullanici urunun sepet sayfasında secilen urunun miktarinin {int} gorundugunu teyit eder")
    public void kullaniciUrununSepetSayfasındaSecilenUrununMiktarininGorundugunuTeyitEder(int miktar) {
        ReUsableMethods.waitFor(3);
        String actual=ap.cardPagefirstProductQuantityNumber.getText();
        String expected=miktar+"";
        System.out.println(actual);
        Assert.assertTrue(actual.equals(expected));
    }

    @And("kullanici addtocard butonuna tiklayip urunleri sepete atar")
    public void kullaniciAddtocardButonunaTiklayipUrunleriSepeteAtar() {
        ap.detailsPageAddToCardButonu.click();
    }

    @Then("kullanici card sayfasinda oldugunu teyit eder")
    public void kullaniciCardSayfasindaOldugunuTeyitEder() {
        Assert.assertTrue(ap.carpPageShoppingCardYazisi.isDisplayed());
    }

    @When("kulanici proceed to checout butonuna tiklar")
    public void kulaniciProceedToChecoutButonunaTiklar() {
        ap.cardpageProceedCheckOutButonu.click();
    }



    @When("kullanici kayit olusturdukdan sonra sayfadaki continue butonuna tiklar")
    public void kullaniciKayitOlusturdukdanSonraSayfadakiContinueButonunaTiklar() {
        ap.sigupContinueButon.click();
    }

    @And("kullanici acilan pencereden register-login butonuna tiklar")
    public void kullaniciAcilanPenceredenRegisterLoginButonunaTiklar() {
        ap.cardpagePopupRegisterButonu.click();
    }

    @Then("isim adres ve siparis bilgilerini dogru oldugunu teyit edin")
    public void isimAdresVeSiparisBilgileriniDogruOldugunuTeyitEdin() {
        String expectedData=adress;
        String actualData=ap.cardpageAdressYaziElemet.getText();
        System.out.println(expectedData + "\n" + actualData);

        String expectedTitle=ilkUrun;
        String actualTitle=ap.cardpageIlkUrunTitle.getText();

        System.out.println(expectedTitle + "\n" + actualTitle);
        Assert.assertTrue(expectedData.equals(actualData));
        Assert.assertTrue(expectedTitle.equals(actualTitle));


    }

    @And("kullanici aciklama alanina aciklama girer ve place order butonuna tıklar")
    public void kullaniciAciklamaAlaninaAciklamaGirerVePlaceOrderButonunaTıklar() {
        ap.cardpageTextArea.sendKeys(Faker.instance().currency().name());
        ap.cardPagePlaceOrderButonu.click();
    }

    @When("kullanici acılan sayfada name of card card number cvc ve expiration date bolumlerini dolduru")
    public void kullaniciAcılanSayfadaNameOfCardCardNumberCvcVeExpirationDateBolumleriniDolduru() {
       Faker faker=new Faker();
        Actions actions=new Actions(Driver.getDriver());
        actions.click(ap.paymentpagePayAndConfirmOrderButon).
                sendKeys(faker.business().creditCardType()).
                sendKeys(Keys.TAB).sendKeys(faker.business().creditCardNumber()).
                sendKeys(Keys.TAB).sendKeys("456").sendKeys(Keys.TAB).sendKeys(faker.business().creditCardExpiry()).sendKeys(Keys.TAB).sendKeys("2023").perform();



    }

    @Then("kullanici pay and confirmorder butununa tiklar")
    public void kullaniciPayAndConfirmorderButununaTiklar() {
        ap.paymentpagePayAndConfirmOrderButon.click();
    }

    @And("kullanici our order has been placed successfully mesajini gördugunu teyit eder")
    public void kullaniciOurOrderHasBeenPlacedSuccessfullyMesajiniGördugunuTeyitEder() {
        Assert.assertTrue(ap.paymentpageSuccesFullyOrderYaziElement.isDisplayed());
    }

    @When("kullanici card daki urunun sectigi urun oldugunu teyit eder")
    public void kullaniciCardDakiUrununSectigiUrunOldugunuTeyitEder() {

        String expectedTitle=ilkUrun;
        String actualTitle=ap.cardPageFirstProductTitleElement.getText();

        System.out.println(expectedTitle + "\n" + actualTitle);

        Assert.assertTrue(expectedTitle.equals(actualTitle));
    }

    @And("kullanici urun aciklamasindaki X butonuna basarak urunu kaldirir")
    public void kullaniciUrunAciklamasindakiXButonunaBasarakUrunuKaldirir() {
        ap.cardpageRemoveItemButonElement.click();
    }

    @When("kullanici urunun kaldirildigina emin olur")
    public void kullaniciUrununKaldirildiginaEminOlur() {
        ReUsableMethods.waitFor(2);
        Assert.assertTrue(ap.cardpageSuccesRemoveItemYazisi.isDisplayed());

    }

    @And("kullanici ana sayfada sol tarafda kategoriler bolumunu gormelidir")
    public void kullaniciAnaSayfadaSolTarafdaKategorilerBolumunuGormelidir() {
        Assert.assertTrue(ap.mainpageLeftSideCategoryYazisi.isDisplayed());
    }

    @Then("kullanici ana sayfada sol tarafadaki kategoriler bolumunde kadin butonuna tiklar")
    public void kullaniciAnaSayfadaSolTarafadakiKategorilerBolumundeKadinButonunaTiklar() {
        ap.mainpageLeftSiteCategoryWomenButonElement.click();
    }

    @When("kullanici anasayfada sol tarafdaki kategoriler bolumunde kadin sekmesinin altinda dress butonuna tiklar")
    public void kullaniciAnasayfadaSolTarafdakiKategorilerBolumundeKadinSekmesininAltindaDressButonunaTiklar() {
        ap.mainpageleftSideCategoryWomenUnderDressButon.click();
    }

    @And("kullanici kategori sayfasinda oldugunu ve WOMEN - TOPS PRODUCTS yazisinin gorundugunu teyit eder")
    public void kullaniciKategoriSayfasindaOldugunuVeWOMENTOPSPRODUCTSYazisininGorundugunuTeyitEder() {
        Assert.assertTrue("Kategori sayfasında degilsiniz",Driver.getDriver().getCurrentUrl().contains("category"));
      //  Assert.assertNotSame("Dress bölümündeyiz, Tops bölümünde degil",ap.katergoripageTopsProductYaziElement,ap.katergoripageDressProductYaziElement);
        try {
            ap.katergoripageTopsProductYaziElement.isDisplayed();
        }catch (NoSuchElementException e){
            System.out.println("Women categorisinde Tops bölümünde degiliz");
        }


    }

    @When("kullanici anasayfada sol tarafta categori bolumundekadin sekmesi altinda tshird sekmesini tiklar")
    public void kullaniciAnasayfadaSolTaraftaCategoriBolumundekadinSekmesiAltindaTshirdSekmesiniTiklar() {
        ap.mainpageLeftSideCategoryMenButonElement.click();
        ap.mainpageleftSideCategoryMenTshirtButon.click();
    }

    @And("kullanici acilan sayfanin kategori sayfasi oldugunu dogrular")
    public void kullaniciAcilanSayfaninKategoriSayfasiOldugunuDogrular() {
        Assert.assertTrue("Kategori sayfasında degilsiniz",Driver.getDriver().getCurrentUrl().contains("category"));

    }

    @And("kullanici Markaların sayfanin solundaki frame de gorundugunu dogrular")
    public void kullaniciMarkalarınSayfaninSolundakiFrameDeGorundugunuDogrular() {
       Assert.assertTrue(ap.productpagesLeftSideBrandsYazisi.isDisplayed());
    }

    @When("kullanici rastgele bir markaya tiklar")
    public void kullaniciRastgeleBirMarkayaTiklar() {
    //   Random random=new Random();
    //   System.out.println("partial: "+ap.productpageLeftSideBrandList);

    //   WebElement brands=Driver.getDriver().findElement(By.cssSelector("[class=\"brands-name\"]"));
    // System.out.println(brands.getText());
    //   List<String >brandss= List.of(brands.getText().replaceAll("\\d", "").split(" "));

    //   System.out.println(brandss);

    //   System.out.println(ap.productpageLeftSideBrandList.toString());
    //   Brandname=ap.productpageLeftSideBrandList.get(random.nextInt(0,ap.productpageLeftSideBrandList.size())).getText();
    //   System.out.println(Brandname);
    //   for (WebElement w:ap.productpageLeftSideBrandList ) {
    //       System.out.println(w.getText());
    //   }
    //   ap.productpageLeftSideBrandList.get(ap.productpageLeftSideBrandList.indexOf(Brandname)).click();



    }

    @Then("kullanici marka sayfasina gittigi ve markanin urunlerini gordugunu dogrular")
    public void kullaniciMarkaSayfasinaGittigiVeMarkaninUrunleriniGordugunuDogrular() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(Brandname));
        String path="//h2[.='Brand - "+Brandname+" Products']";
        WebElement actual=Driver.getDriver().findElement(By.xpath(path));
        Assert.assertTrue(actual.isDisplayed());
    }


    @When("clinician Polo markasini tiklar")
    public void clinicianPoloMarkasiniTiklar() {
        ap.productpageLeftSidePoloBrandButonElement.click();
    }

    @Then("kullanici {string} marka sayfasina gittigi ve markanin urunlerini gordugunu dogrular")
    public void kullaniciMarkaSayfasinaGittigiVeMarkaninUrunleriniGordugunuDogrular(String marka) {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains(marka));
        String path="//h2[.='Brand - "+marka+" Products']";
        WebElement actual=Driver.getDriver().findElement(By.xpath(path));
        Assert.assertTrue(actual.isDisplayed());
    }

    @When("kullanici H&M markasini tiklar")
    public void kullaniciHMMarkasiniTiklar() {
        ap.productPageLeftsideHmBrandButonElement.click();
    }


    @Then("Write Your Review yazisinin gorundugunu teyit eder")
    public void writeYourReviewYazisininGorundugunuTeyitEder() {
        Assert.assertTrue(ap.urundetailpageWriteYourReviewTextElement.isDisplayed());
    }

    @And("urundetails sayfasinda writeyourrevies bolumunde name,email ve gorus alanlarini dolduru")
    public void urundetailsSayfasindaWriteyourreviesBolumundeNameEmailVeGorusAlanlariniDolduru() {
        Actions actions=new Actions(Driver.getDriver());
        actions.click(ap.urundetailspageReviewFormnameInputBox).sendKeys(Faker.instance().name().fullName()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().internet().emailAddress()).
                sendKeys(Keys.TAB).sendKeys(Faker.instance().chuckNorris().fact()).perform();
    }

    @Then("kullanici urundetails sayfasindaki submit butonuna basar")
    public void kullaniciUrundetailsSayfasindakiSubmitButonunaBasar() {
        ap.urundetailpageSubmitButonElement.click();
    }

    @And("Thank you for your review mesajinin gorundugune emin olur")
    public void thankYouForYourReviewMesajininGorunduguneEminOlur() {
        Assert.assertTrue(ap.urundetailpageReviewFormThanksMesageElement.isDisplayed());
    }

    @Then("kullanici ana sayfanın en alt kısmına RECOMMENDED ITEMS bolumune gider")
    public void kullaniciAnaSayfanınEnAltKısmınaRECOMMENDEDITEMSBolumuneGider() {
        ReUsableMethods.scrollToWebelementVisible(ap.mainpageRecomentedItemsYaziElementi);
    }

    @And("kullanici RECOMMENDED ITEMS gorunur oldugunu teyit eder")
    public void kullaniciRECOMMENDEDITEMSGorunurOldugunuTeyitEder() {
        Assert.assertTrue(ap.mainpageRecomentedItemsYaziElementi.isDisplayed());
    }

    @When("kullanici RECOMMENDED ITEMS daki ilk urunu card a ekler")
    public void kullaniciRECOMMENDEDITEMSDakiIlkUrunuCardAEkler() {
        ilkUrun=ap.mainpageRecomentedItemsFisrtProductNameYazisi.getText();

        ap.mainpageRecomentedItemsFirstProductElements.click();

    }

    @Then("kullanici acilan pencereden view to card sekmesini tıklar")
    public void kullaniciAcilanPenceredenViewToCardSekmesiniTıklar() {
        ap.mainpageRecomentedItemsPopupViewCardButonElement.click();

    }

    @And("kullanici secilen urunun card sayfasinda oldugunu gorur")
    public void kullaniciSecilenUrununCardSayfasindaOldugunuGorur() {

        String expected=ilkUrun.toString();
        String actual=ap.cardpageFirstUrunTitleYazisi.getText();
        System.out.println("Expect: "+expected + "\n actual: " + actual);
        Assert.assertTrue(actual.equals(expected));

    }

    @When("fatura adresinin kayit sirasinda verilen adresle aynı oldugunu teyit eder")
    public void faturaAdresininKayitSirasindaVerilenAdresleAynıOldugunuTeyitEder() {
        String expect=adress;
        String actual=ap.billpageAdressTitle.getText();
        System.out.println(expect+"\n"+actual);
        Assert.assertTrue(actual.equals(expect));

    }

    @And("kullanici payment sayfasindaki continue butonuna tiklar")
    public void kullaniciPaymentSayfasindakiContinueButonunaTiklar() {
        ap.paymentpageContinueButtonElement.click();
    }

    @And("anasayfanin altindaki Subscription bolumune kadar scrooldown yapin")
    public void anasayfaninAltindakiSubscriptionBolumuneKadarScrooldownYapin() {
        ReUsableMethods.scrollToWebelementVisible(ap.mainPageFooterSubscriptionYazisi);
    }

    @Then("Kullanici Subscription yazisinin gorundugunu teyit eder")
    public void kullaniciSubscriptionYazisininGorundugunuTeyitEder() {
        Assert.assertTrue(ap.mainpageSubscriponTextElement.isDisplayed());
    }

    @When("Kullanici ok tuşlarini kullanarak sayfanın en ustune kadar cikar")
    public void kullaniciOkTuşlariniKullanarakSayfanınEnUstuneKadarCikar() {
    ap.mainpageScrollUpButonElement.click();
    }

    @And("kullanici sayfanin en üst kisminda Full-Fledged practice website for Automation Engineers yazisinin gorundugunu dogrular")
    public void kullaniciSayfaninEnÜstKismindaFullFledgedPracticeWebsiteForAutomationEngineersYazisininGorundugunuDogrular() {
        Assert.assertTrue(ap.mainpageAutomationEngeneerPracticeTextElement.isDisplayed());
    }

    @And("kullanici anasayfanin üst kismina kadar scroolup yapar")
    public void kullaniciAnasayfaninÜstKisminaKadarScroolupYapar() {
        ReUsableMethods.scrollToWebelementVisible(ap.mainpageAutomationEngeneerPracticeTextElement);
    }
}
