package helpers;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ElementMethods {

    public WebDriver driver;
    WebDriverWait wait;
    public JavascriptExecutor js;

    public ElementMethods(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        this.js = (JavascriptExecutor) driver;
    }



    public WebElement getElement(By locator){
        return driver.findElement(locator);
    }



    public void clickElement(By locator){
        getElement(locator).click();
    }

    public void fillElement(By locator, String text) {
        getElement(locator).sendKeys(text);
    }

    public void scrollByPixels(int pixels){
        js.executeScript("window.scrollBy(0," +pixels+");");
    }

    public void waitForElement(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


}
