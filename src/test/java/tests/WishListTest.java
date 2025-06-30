package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.CartPage;
import pages.HomePage;
import pages.LoginPage;
import pages.WishListPage;

public class WishListTest extends BaseTest {

    @Test
    public void executeTest(){

        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        CartPage cartPage = new CartPage(driver);
        WishListPage wishListPage = new WishListPage(driver);
        homePage.waitThreeSeconds();
        homePage.acceptCookie();
        homePage.scrollByPixels(400);
        homePage.backToFrontPage();
        homePage.scrollByPixels(-400);
        cartPage.searchBarBox();
        cartPage.scrollByPixels(400);
        cartPage.waitThreeSeconds();
        wishListPage.addToWishList();
        cartPage.scrollByPixels(-400);
        cartPage.waitThreeSeconds();
        loginPage.accesLoginPage();
        loginPage.loginAccount();
        wishListPage.waitThreeSeconds();
        wishListPage.favoriteButton();
        wishListPage.isPageLoaded();
        wishListPage.removeFromWishlist();
        wishListPage.clearAndEmpty();
    }


}
