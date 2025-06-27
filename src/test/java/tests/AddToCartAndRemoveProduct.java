package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AddToCartAndRemoveProduct {

    WebDriver driver;

    @Test
    public void executeTest(){
        openBrowser();
        waitThreeSeconds();
        acceptCookie();
        searchBarBox();
        scrollToBottom(driver);
        waitThreeSeconds();
        addProductToCart();
        waitThreeSeconds();
        waitThreeSeconds();
        removeProduct();
    }

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://www.ihunt.ro/");
        driver.manage().window().maximize();
    }

    public void acceptCookie(){
        WebElement acceptCookieButton = driver.findElement(By.xpath("//button[contains(@id,'CybotCookiebotDialogBodyButtonAccept')]"));
        acceptCookieButton.click();
    }

    public void searchBarBox(){
        WebElement searchBox = driver.findElement(By.id("productSearchInput"));
        searchBox.click();
        String searchedProduct = "Smartwatch iHunt Watch 13 Titan Brown";
        searchBox.sendKeys(searchedProduct);
        searchBox.sendKeys(Keys.ENTER);
    }

    public void waitThreeSeconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void scrollToBottom(WebDriver driver){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    //a[contains(@onclick,'addToCart')]

    public void addProductToCart(){
        WebElement productButton = driver.findElement(By.xpath("//a[contains(@onclick,'addToCart')]"));
        productButton.click();
    }


    public void removeProduct(){
        WebElement removeProductButton = driver.findElement(By.xpath("//i[contains(@class,'fa fa-times')]"));
        removeProductButton.click();
    }


}
