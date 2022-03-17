package utilities;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ReUsableMethods {

    public static void hover(WebElement element){
        Actions actions=new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }

    public static String getScreenShot(String name) throws IOException {
        TakesScreenshot ts=(TakesScreenshot) Driver.getDriver();
        File geciciGoruntusu=ts.getScreenshotAs(OutputType.FILE);
        String path=System.getProperty("user.dir")+"/testoutput/ScreenShot/"+name+".jpg";
        File asilGoruntu=new File(path);
        FileUtils.copyFile(geciciGoruntusu,asilGoruntu);
        return path;
    }

public static void webElementScreenShot(WebElement webElement,String name){
        File asilResim=new File("/testoutput/ScreenShot/"+name+".jpg");
        File geciciResim=webElement.getScreenshotAs(OutputType.FILE);
    try {
        FileUtils.copyFile(geciciResim,asilResim);
    } catch (IOException e) {
        e.printStackTrace();
    }
}

public static  void switchToWindow(String Title){
       String actualHandle= Driver.getDriver().getWindowHandle();
    for (String handle:Driver.getDriver().getWindowHandles()) {
        Driver.getDriver().switchTo().window(handle);
        if (Driver.getDriver().getTitle().equals(Title)){
            return;
        }

    }Driver.getDriver().switchTo().window(actualHandle);
}

public static void scrollToWebelementVisible(WebElement webElement){
    JavascriptExecutor jss= (JavascriptExecutor) Driver.getDriver();
    jss.executeScript("arguments[0].scrollIntoView(true);",webElement);
}


    public static void waitFor(int Saniye){
        try {
            Thread.sleep(Saniye*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    public static List<String> getElements(By locator) {

        List<WebElement> webElements = Driver.getDriver().findElements(locator);
        List<String> stringListe = new ArrayList<>();

        for (WebElement w : webElements) {
            if (!w.getText().isEmpty()) {
                stringListe.add(w.getText());
            }
        }

        return stringListe;
    }


    public static void selectByVisibleText(WebElement webElement,String text){
        Select obje=new Select(webElement);
        obje.selectByVisibleText(text);

           }

   public static void selectByValue(WebElement webElement, String value){

        Select obje=new Select(webElement);
        obje.selectByValue(value);
   }

   public static void selectByIndex(WebElement webElement,int index){
       Select obje=new Select(webElement);
       obje.selectByIndex(index);
   }


   public static void randomSelectDropDown(WebElement webElement,int index){
       Random random=new Random();
       Select obje=new Select(webElement);
       obje.selectByIndex(random.nextInt(1,obje.getOptions().size()));

   }

   // istedigimiz web element görünene kadar bekliyoruz
   public static WebElement waitForClickability(WebElement webElement,int timeout){

       WebDriverWait bekle=new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));

       return bekle.until(ExpectedConditions.elementToBeClickable(webElement));
   }

//locate ettigimiz locater görülene kadar bekliyoruz
   public static WebElement waitForVisibility(By locater,int timeout){
        WebDriverWait obje=new WebDriverWait(Driver.getDriver(),Duration.ofSeconds(timeout));
   return obje.until(ExpectedConditions.visibilityOfElementLocated(locater));
    }




}
