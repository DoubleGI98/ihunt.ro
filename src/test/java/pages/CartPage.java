package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CartPage extends BasePage{


    private By searchBox = By.xpath("//input[contains(@placeholder,'Cautare...')]");
    private By searchButton = By.xpath("(//button[@type='button'])[1]");
    private By productCartButton = By.xpath("//a[contains(@onclick,'addToCart')]");
    private By rightPage = By.xpath("//p[text()='Coșul tău este gol!']");
    private By removeProductButton = By.xpath("//i[contains(@class,'fa fa-times')]");
    private By typeOfPayment = By.xpath("//h2[@class='secondary-title' and text()='Metoda de plata']");

    public CartPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(elementMethods.getElement(typeOfPayment).getText(),"Metoda de plata","Page is not loaded properly");
    }

    @Override
    public void clearAndEmpty() {
        Assert.assertEquals(elementMethods.getElement(rightPage).getText(),"Coșul tău este gol!","Page is not loaded properly");
    }

    public void searchBarBox(){
        elementMethods.fillElement(searchBox,searchedProduct);
        elementMethods.clickElement(searchButton);
    }

    public void addProductToCart(){
        elementMethods.clickElement(productCartButton);
    }

    public void removeProductFromCart(){
        elementMethods.clickElement(removeProductButton);
    }

    public void scrollByPixels(int pixels){
        elementMethods.scrollByPixels(pixels);
    }

    public void waitThreeSeconds(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
