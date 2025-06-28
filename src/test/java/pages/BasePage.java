package pages;

import helpers.ElementMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;


public abstract class BasePage {
    protected WebDriver driver;
    public ElementMethods elementMethods;


    public BasePage(WebDriver driver) {
        this.driver = driver;
        elementMethods = new ElementMethods(driver);

    }



    public abstract void isPageLoaded();





}

