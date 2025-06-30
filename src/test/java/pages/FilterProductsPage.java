package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FilterProductsPage extends BasePage{

    private By categoryButton = By.xpath("//span[@class='main-menu-text' and normalize-space()='ELECTROCASNICE']");
    private By weightButton = By.xpath("//input[@data-keyword='greutate-9-kg' and @name='attribute[248]']");
    private By pageSubTitle = By.xpath("//h1[@class='heading-title' and text()='ELECTROCASNICE']");
    private By categoryChecked = By.xpath("//label[@class='sf-checked']");
    public FilterProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(elementMethods.getElement(pageSubTitle).getText(),"ELECTROCASNICE","Page is not loaded properly");
    }

    @Override
    public void clearAndEmpty() {
        Assert.assertTrue(elementMethods.getElement(categoryChecked).isDisplayed(),"The box should be ticked");
    }

    public void selectCategory(){
       // driver.findElement(categoryButton).click();
        elementMethods.clickElement(categoryButton);
    }

    public void filterByWeight(){
       // driver.findElement(weightButton).click();
        elementMethods.clickElement(weightButton);
    }

    public void scrollByPixels(int pixels){
        elementMethods.scrollByPixels(pixels);
    }
}
