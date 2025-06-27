package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginPage extends BasePage {

    private By pageTitle = By.xpath("//h2[@class='secondary-title' and text()='Sunt deja client']");
    private By locationLogin = By.xpath("//span[@class='top-menu-link' and normalize-space()='Autentificare']");
    private By emailBox = By.xpath("//input[contains(@id,'input-email')]");
    private By passwordBox = By.xpath("//input[contains(@id,'input-password')]");
    private By authenticationButton = By.xpath("//input[contains(@value,'Autentificare')]");
    private By logOutButton = By.xpath("//a[contains(@href,'https://www.ihunt.ro/index.php?route=account/logout')]");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(driver.findElement(pageTitle).getText(),"Sunt deja client","Page is not loaded properly");
    }

    public void accesLoginPage(){
        driver.findElement(locationLogin).click();
      }

    public void loginAccount(){
        String email = "ionci.florin@gmail.com";
        String passwordAccount = "Harababura55*";
        driver.findElement(emailBox).sendKeys(email);
        driver.findElement(passwordBox).sendKeys(passwordAccount);
        driver.findElement(authenticationButton).click();

    }

    public void logOutAccount(){
        driver.findElement(logOutButton).click();
    }
}






