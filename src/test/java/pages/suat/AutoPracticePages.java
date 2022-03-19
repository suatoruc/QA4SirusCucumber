package pages.suat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoPracticePages {
    public AutoPracticePages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(css = "[class=\"login\"]")
    public WebElement anaSayfaSiginButonu;
@FindBy(css = "[id=\"email_create\"]")
    public WebElement createAccountEmailInputBox;

@FindBy(css ="[id=\"SubmitCreate\"]" )
    public WebElement createAccountEmailbutton;

@FindBy(css = "[for=\"id_gender1\"]")
    public WebElement kayitSayfasiTitleRadyoButonu;

@FindBy(css = "[id=\"submitAccount\"]")
    public WebElement kayitSayfasiRegisterButonu;
@FindBy(css = "[class=\"logout\"]")
    public WebElement logoutButonElement;
@FindBy(xpath = "//li[text()='Invalid email address.']")
    public WebElement hataliMailOlusturmaYazisi;

}
