package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class FilterProductsPage extends BasePage{

    private By categoryButton = By.xpath("//span[@class='main-menu-text' and normalize-space()='ELECTROCASNICE']");
    private By weightButton = By.xpath("//input[@data-keyword='greutate-9-kg' and @name='attribute[248]']");
    private By pageSubTitle = By.xpath("//h1[@class='heading-title' and text()='ELECTROCASNICE']");
    public FilterProductsPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(driver.findElement(pageSubTitle).getText(),"ELECTROCASNICE","Page is not loaded properly");
    }

    public void selectCategory(){
        driver.findElement(categoryButton).click();
    }

    public void filterByWeight(){
        driver.findElement(weightButton).click();
    }
}
