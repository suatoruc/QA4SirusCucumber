package pages.suat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HerOkuPages {
    public HerOkuPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

@FindBy(css = "[onclick=\"addElement()\"]")
    public WebElement addElementButon;

    @FindBy(css = "[onclick=\"deleteElement()\"]")
    public WebElement deleteButonElement;



}
