package pages.suat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoQaPages {
    public DemoQaPages() {
        PageFactory.initElements(Driver.getDriver(),this);

    }
@FindBy(xpath = "//span[text()='Alerts']")
    public WebElement alertButonElement;

    @FindBy(css = "[id=\"timerAlertButton\"]")
    public WebElement onButonClickTimeAlertButon;

    @FindBy(css = "[id=\"enableAfter\"]")
    public WebElement wait5SecondForClickButon;
    @FindBy(css = "[id=\"visibleAfter\"]")
    public WebElement wait5SecondForVisibilityButon;


}
