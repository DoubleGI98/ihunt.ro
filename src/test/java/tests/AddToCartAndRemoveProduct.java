package tests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;

public class AddToCartAndRemoveProduct extends BaseTest {

    //WebDriver driver;

    @Test
    public void executeTest(){
       // openBrowser();
        waitThreeSeconds();
        acceptCookie();
        HomePage homePage = new HomePage(driver);
        homePage.scrollByPixels(driver,400);
        homePage.backToFrontPage();
        homePage.scrollByPixels(driver,-400);
        homePage.isPageLoaded();
        //searchBarBox();
        CartPage cartPage = new CartPage(driver);
        cartPage.searchBarBox();
        //scrollToBottom(driver);
        waitThreeSeconds();
        cartPage.addProductToCart();
        //addProductToCart();
        waitThreeSeconds();
        waitThreeSeconds();
        cartPage.removeProductFromCart();
        waitThreeSeconds();
        cartPage.isPageLoaded();
        //removeProduct();
        waitThreeSeconds();
    }

//    public void openBrowser(){
//        driver = new ChromeDriver();
//        driver.get("https://www.ihunt.ro/");
//        driver.manage().window().maximize();
//    }

    public void acceptCookie(){
        WebElement acceptCookieButton = driver.findElement(By.xpath("//button[contains(@id,'CybotCookiebotDialogBodyButtonAccept')]"));
        acceptCookieButton.click();
    }

//    public void searchBarBox(){
//        //WebElement searchBox = driver.findElement(By.id("productSearchInput"));
//        WebElement searchBox = driver.findElement(By.xpath("//input[contains(@placeholder,'Cautare...')]"));
//        searchBox.click();
//        String searchedProduct = "Smartwatch iHunt Watch 13 Titan Brown";
//        searchBox.sendKeys(searchedProduct);
//        searchBox.sendKeys(Keys.ENTER);
//    }

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

//    public void addProductToCart(){
//        WebElement productButton = driver.findElement(By.xpath("//a[contains(@onclick,'addToCart')]"));
//        productButton.click();
//    }


//    public void removeProduct(){
//        WebElement removeProductButton = driver.findElement(By.xpath("//i[contains(@class,'fa fa-times')]"));
//        removeProductButton.click();
//    }


}
