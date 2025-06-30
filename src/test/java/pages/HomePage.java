package pages;

import helpers.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class HomePage extends BasePage {

    private By pageTitle = By.xpath("//img[contains(@alt,'iHunt Technology')]");
    private By backArrow = By.xpath("//i[contains(@class,'fa fa-arrow-left')]");
    private By acceptCookieButton = By.xpath("//button[contains(@id,'CybotCookiebotDialogBodyButtonAccept')]");



    public HomePage(WebDriver driver) {
        super(driver);
    }



    public void scrollByPixels(int pixels){
        elementMethods.scrollByPixels(pixels);
    }


    public void backToFrontPage(){
        elementMethods.clickElement(backArrow);
    }


    @Override
    public void isPageLoaded() {
        Assert.assertEquals(driver.findElement(pageTitle).getDomAttribute("alt"),
                "iHunt Technology","Page is not loaded properly");

    }

    @Override
    public void clearAndEmpty() {
    }

    public void acceptCookie(){
        elementMethods.waitForElement(acceptCookieButton);
        elementMethods.clickElement(acceptCookieButton);
    }

    public void waitThreeSeconds(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
