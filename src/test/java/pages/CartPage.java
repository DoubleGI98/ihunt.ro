package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage extends BasePage{

    //private By rightProduct = By.xpath("//h1[text()='Căutare - Smartwatch iHunt Watch 13 Titan Brown']");
    private By searchBox = By.xpath("//input[contains(@placeholder,'Cautare...')]");
    private By searchButton = By.xpath("(//button[@type='button'])[1]");
    private By productButton = By.xpath("//a[contains(@onclick,'addToCart')]");
    private By rightPage = By.xpath("//p[text()='Coșul tău este gol!']");
    private By removeProductButton = By.xpath("//i[contains(@class,'fa fa-times')]");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageLoaded() {
    //    Assert.assertEquals(driver.findElement(rightPage).getText(),"Coșul tău este gol!","Page is not loaded properly");
        Assert.assertEquals(elementMethods.getElement(rightPage).getText(),"Coșul tău este gol!","Page is not loaded properly");
    //    Assert.assertEquals(elementMethods.getElementText(rightPage),"Coșul tău este gol!","Page is not loaded properly");
    }

    public void searchBarBox(){
        String searchedProduct = "Smartwatch iHunt Watch 13 Titan Brown";
        elementMethods.fillElement(searchBox,searchedProduct);
        elementMethods.clickElement(searchButton);
    }

    public void addProductToCart(){
//        driver.findElement(productButton).click();
        elementMethods.clickElement(productButton);
    }

    public void removeProductFromCart(){
    //    driver.findElement(removeProductButton).click();
        elementMethods.clickElement(removeProductButton);
    }

    public void scrollByPixels(int pixels){
        elementMethods.scrollByPixels(pixels);
    }

}
