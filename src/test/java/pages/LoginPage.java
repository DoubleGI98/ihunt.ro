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
    private By logOutMessage = By.xpath("//p[text()='Ai ieşit din contul tău. Puteţi părăsi calculatorul în siguranţă.']");


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(elementMethods.getElement(pageTitle).getText(),"Sunt deja client","Page is not loaded properly");

    }

    @Override
    public void clearAndEmpty() {
        Assert.assertEquals(elementMethods.getElement(logOutMessage).getText(),"Ai ieşit din contul tău. Puteţi părăsi calculatorul în siguranţă.","Page is not loaded properly");
    }

    public void accesLoginPage(){
        elementMethods.clickElement(locationLogin);
      }

    public void loginAccount(){
        elementMethods.fillElement(emailBox,emailAccount);
        elementMethods.fillElement(passwordBox,passwordAccount);
        elementMethods.clickElement(authenticationButton);
    }

    public void logOutAccount(){
       // driver.findElement(logOutButton).click();
        elementMethods.clickElement(logOutButton);

    }

    public void scrollByPixels(int pixels){
        elementMethods.scrollByPixels(pixels);
    }


    public void waitThreeSeconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}






