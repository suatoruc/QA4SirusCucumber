package pages.suat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ResortHotelsPages {

    public ResortHotelsPages(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(css = "[id=\"navLogon\"]")
    public WebElement HeaderLoginElement;
    @FindBy(css = "[id=\"UserName\"]")
    public WebElement loginPageUsernameInputBox;
    @FindBy(css = "[id=\"Password\"]")
    public WebElement  loginPagePasswordInputBox;
    @FindBy(css = "[id=\"btnSubmit\"]")
    public WebElement loginPageLoginButon;
    @FindBy(xpath = "//li[text()='Username or password is incorrect, please correct them and try again']")
    public WebElement loginPageHataYazisi;

    @FindBy(css = "[id=\"details-button\"]")
    public WebElement gelismisButonElement;
    @FindBy(css = "[id=\"proceed-link\"]")
    public WebElement sayfayiYüklemeyeDevamEtYaziElement;




}
