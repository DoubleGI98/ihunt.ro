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
   //     WebElement backArrow = driver.findElement(By.xpath("//i[contains(@class,'fa fa-arrow-left')]"));
   //     backArrow.click();
//        elementMethods.waitForElement(backArrow);
        //elementMethods.waitForElement(copyRight);
        elementMethods.clickElement(backArrow);
    }


    @Override
    public void isPageLoaded() {
//        Assert.assertEquals(driver.findElement(pageTitle).getDomAttribute("alt"),
//                "iHunt Technology","Page is not loaded properly");
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }

    public void acceptCookie(){
//        WebElement acceptCookieButton = driver.findElement(By.xpath("//button[contains(@id,'CybotCookiebotDialogBodyButtonAccept')]"));
//        acceptCookieButton.click();
        elementMethods.waitForElement(acceptCookieButton);
        elementMethods.clickElement(acceptCookieButton);
    }

}
