package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.FilterProductsPage;
import pages.HomePage;

public class FilterProductsByWeight extends BaseTest{

   // WebDriver driver;

    @Test
    public void executeTest(){
        //openBrowser();
        waitThreeSeconds();
        acceptCookie();
//        scrollToBottom(driver);
//        backToFrontPage();
        HomePage mainPage = new HomePage(driver);
        mainPage.scrollByPixels(driver,400);
        mainPage.backToFrontPage();
        mainPage.isPageLoaded();

        FilterProductsPage filterProductsPage = new FilterProductsPage(driver);
        filterProductsPage.selectCategory();
        scrollByPixels(driver,700);
        filterProductsPage.isPageLoaded();
        filterProductsPage.filterByWeight();
        scrollByPixels(driver,-700);
        //selectCategory();
        //scrollByPixels(driver,700);
        //filterByWeight();
        //scrollByPixels(driver,-700);
        waitThreeSeconds();
    }

 //   public void openBrowser(){
 //       driver = new ChromeDriver();
 //       driver.get("https://www.ihunt.ro/");
  //      driver.manage().window().maximize();
 //   }

//    public void scrollToBottom(WebDriver driver){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
//    }
//
//    public void backToFrontPage(){
//        WebElement backArrow = driver.findElement(By.xpath("//i[contains(@class,'fa fa-arrow-left')]"));
//        backArrow.click();
//    }



    public void acceptCookie(){
        WebElement acceptCookieButton = driver.findElement(By.xpath("//button[contains(@id,'CybotCookiebotDialogBodyButtonAccept')]"));
        acceptCookieButton.click();
    }

    public void waitThreeSeconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public void selectCategory(){
//        WebElement categoryButton = driver.findElement(By.xpath("//span[@class='main-menu-text' and normalize-space()='ELECTROCASNICE']"));
//        categoryButton.click();
//    }

    public void scrollByPixels(WebDriver driver,int pixels){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, arguments[0]);", pixels);
    }

//    public void filterByWeight(){
//        WebElement weightButton = driver.findElement(By.xpath("//input[@data-keyword='greutate-9-kg' and @name='attribute[248]']"));
//        weightButton.click();
//    }
}
