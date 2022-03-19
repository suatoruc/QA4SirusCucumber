package pages.suat;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DemoGuruPages {
    public DemoGuruPages() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//tbody//tr")
    public List<WebElement> tabloList;
}
