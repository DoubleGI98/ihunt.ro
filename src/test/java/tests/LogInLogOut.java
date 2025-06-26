package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LogInLogOut {
    WebDriver driver;

    @Test
    public void executeTest(){
        openBrowser();
        waitThreeSeconds();
        acceptCookie();
        accesLoginPage();
        loginAccount();
        waitThreeSeconds();
        logout();
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

    public void accesLoginPage(){
        WebElement clickloginPicture = driver.findElement(By.xpath("//i[contains(@class,'fa fa-user-circle-o')]"));
        clickloginPicture.click();
    }

    public void loginAccount(){
        WebElement emailBox = driver.findElement(By.xpath("//input[contains(@id,'input-email')]"));
        emailBox.click();
        String email = "ionci.florin@gmail.com";
        emailBox.sendKeys(email);

        WebElement passwordBox = driver.findElement(By.xpath("//input[contains(@id,'input-password')]"));
        passwordBox.click();
        String passwordAccount = "Harababura55*";
        passwordBox.sendKeys(passwordAccount);

        WebElement authenticationButton = driver.findElement(By.xpath("//input[contains(@value,'Autentificare')]"));
        authenticationButton.click();
    }


    public void waitThreeSeconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void logout(){
        WebElement logoutButton = driver.findElement(By.xpath("//a[contains(@href,'https://www.ihunt.ro/index.php?route=account/logout')]"));
        logoutButton.click();
    }



}
