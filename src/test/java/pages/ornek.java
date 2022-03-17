package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ornek {

    public ornek(){

        PageFactory.initElements(Driver.getDriver(),this);
    }
}
