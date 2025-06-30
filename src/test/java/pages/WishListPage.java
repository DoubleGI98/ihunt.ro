package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class WishListPage extends BasePage{

    private By wishListButton = By.xpath("//span[@class='top-menu-link' and text()='Favorite']");
    private By wishListPage = By.xpath("//h1[@class='heading-title' and text()='Wish List']");
    private By productWishList = By.xpath("//a[contains(@onclick,'addToWishList')]");
    private By removeFromWishListButton = By.xpath("//i[contains(@class,'fa fa-times')]");
    private By emptyWishList = By.xpath("//p[text()='Nu ai produse în wish list']");
    public WishListPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void isPageLoaded() {
        Assert.assertEquals(elementMethods.getElement(wishListPage).getText(),"Wish List","Page is not loaded properly");
    }

    @Override
    public void clearAndEmpty() {
        Assert.assertEquals(elementMethods.getElement(emptyWishList).getText(),"Nu ai produse în wish list","Page is not loaded properly");
    }

    public void addToWishList(){
        elementMethods.clickElement(productWishList);
    }

    public void wishListLocation(){
        elementMethods.clickElement(wishListPage);
    }

    public void removeFromWishlist(){
        elementMethods.clickElement(removeFromWishListButton);
    }

    public void favoriteButton(){
        elementMethods.clickElement(wishListButton);
    }

    public void waitThreeSeconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
