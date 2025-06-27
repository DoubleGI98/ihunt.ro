package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LogInLogOut extends BaseTest{
   // WebDriver driver;

    @Test
    public void executeTest(){
        //openBrowser();
        waitThreeSeconds();
        acceptCookie();
       //accesLoginPage();
        HomePage mainPage = new HomePage(driver);
        mainPage.scrollByPixels(driver,400);
        waitThreeSeconds();
        mainPage.backToFrontPage();
        mainPage.isPageLoaded();
        waitThreeSeconds();
        mainPage.scrollByPixels(driver,-400);
        //accesLoginPageV2();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.accesLoginPage();
        loginPage.isPageLoaded();
        //loginAccount();
        loginPage.loginAccount();
        waitThreeSeconds();
        loginPage.logOutAccount();
        waitThreeSeconds();
        //logout();
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

//    public void accesLoginPage(){
//        WebElement clickloginPicture = driver.findElement(By.xpath("//i[contains(@class,'fa fa-user-circle-o')]"));
//        clickloginPicture.click();
//    }

//      public void accesLoginPageV2(){
//        WebElement clickLoginIcon = driver.findElement(By.xpath("//span[@class='top-menu-link' and normalize-space()='Autentificare']"));
//        clickLoginIcon.click();
//      }

//    public void loginAccount(){
//        WebElement emailBox = driver.findElement(By.xpath("//input[contains(@id,'input-email')]"));
//        emailBox.click();
//        String email = "ionci.florin@gmail.com";
//        emailBox.sendKeys(email);
//
//        WebElement passwordBox = driver.findElement(By.xpath("//input[contains(@id,'input-password')]"));
//        passwordBox.click();
//        String passwordAccount = "Harababura55*";
//        passwordBox.sendKeys(passwordAccount);
//
//        WebElement authenticationButton = driver.findElement(By.xpath("//input[contains(@value,'Autentificare')]"));
//        authenticationButton.click();
//    }


    public void waitThreeSeconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

//    public void logout(){
//        WebElement logoutButton = driver.findElement(By.xpath("//a[contains(@href,'https://www.ihunt.ro/index.php?route=account/logout')]"));
//        logoutButton.click();
//    }



}
