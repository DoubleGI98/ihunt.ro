package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class HomePage extends BasePage {

    private By pageTitle = By.xpath("//img[contains(@alt,'iHunt Technology')]");


    public HomePage(WebDriver driver) {
        super(driver);
    }

//    public void scrollToBottom(WebDriver driver){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//    }

    public void scrollByPixels(WebDriver driver,int pixels){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, arguments[0]);", pixels);
    }


    public void backToFrontPage(){
        WebElement backArrow = driver.findElement(By.xpath("//i[contains(@class,'fa fa-arrow-left')]"));
        backArrow.click();
    }


    @Override
    public void isPageLoaded() {
        Assert.assertEquals(driver.findElement(pageTitle).getDomAttribute("alt"),
                "iHunt Technology","Page is not loaded properly");
    }

}
