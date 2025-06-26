package archives;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class FilterProductsByAlignment {
    WebDriver driver;

    @Test
    public void executeTest(){
        openBrowser();
        acceptCookie();
        productCategory();
        chooseProduct();
        arrangeProducts();
        waitThreeSeconds();

    }

    public void openBrowser(){
        driver = new ChromeDriver();
        driver.get("https://greeno.ro/ro/");
        driver.manage().window().maximize();
    }

    public void acceptCookie(){
        WebElement acceptCookieButton = driver.findElement(By.xpath("//span[contains(@class,'cookiesplus-accept-label')]"));
        acceptCookieButton.click();
    }

    public void productCategory(){
        WebElement categoryButton = driver.findElement(By.xpath("//li[contains(@id,'cbp-hrmenu-tab-11')]"));
        categoryButton.click();
    }

    public void chooseProduct(){
        WebElement productButton = driver.findElement(By.xpath("//img[contains(@alt,'Masti chirurgicale medicale')]"));
        productButton.click();
    }

    public void arrangeProducts(){
        WebElement arrangeButton = driver.findElement(By.xpath("//i[contains(@class,'fa-solid fa-list')]"));
        arrangeButton.click();
    }

    public void waitThreeSeconds() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }





}

