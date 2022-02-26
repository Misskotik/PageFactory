package ru.misskotik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class MainPageTest extends AbstractTest {


    @Test

    void addToCartTest () throws InterruptedException {

//      getWebDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        new MainPage (getWebDriver()).addToCart();
        Assertions.assertEquals(getWebDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
        new MainPage(getWebDriver()).clickCart();
        Assertions.assertTrue(getWebDriver().findElement (By.xpath(".//div[@id='shopping_cart_container']/a")).getText().equals("1"));
    }

    @Test
    void removeFromCartTest () throws InterruptedException {

        new MainPage (getWebDriver()).addToCart();
        new MainPage(getWebDriver()).clickCart();
        Assertions.assertTrue(getWebDriver().findElement (By.xpath(".//div[@id='shopping_cart_container']/a")).getText().equals("1"));
        new MainPage(getWebDriver()).removeFromCart();
        Assertions.assertFalse(getWebDriver().findElement (By.xpath(".//div[@id='shopping_cart_container']/a")).getText().equals("1"));

    }

    @Test
    void continueShoppingTest () throws InterruptedException {
        new MainPage (getWebDriver()).addToCart();
        new MainPage(getWebDriver()).clickCart();
        new MainPage(getWebDriver()).removeFromCart();
        new MainPage (getWebDriver()).clickContinueShopping();
        Assertions.assertEquals(getWebDriver().getCurrentUrl(), "https://www.saucedemo.com/inventory.html");
    }

    @Test
    void startCheckoutTest () throws InterruptedException {
        new MainPage (getWebDriver()).addToCart();
        new MainPage (getWebDriver()).addMoreItems();
        Assertions.assertTrue(getWebDriver().findElement (By.xpath(".//div[@id='shopping_cart_container']/a")).getText().equals("3"));
        new MainPage(getWebDriver()).clickCart();
        new MainPage (getWebDriver()).clickCheckout();
        Assertions.assertTrue(getWebDriver().findElement (By.xpath(".//div[@id='header_container']/div[2]/span")).getText().equals("CHECKOUT: YOUR INFORMATION"));
    }
    @Test
    void checkoutFormTest () throws InterruptedException {
        new MainPage (getWebDriver()).addToCart();
        new MainPage(getWebDriver()).clickCart();
        new MainPage (getWebDriver()).clickCheckout();
        new MainPage(getWebDriver()).fillTheForm();
        new MainPage(getWebDriver()).clickContinue();
        Assertions.assertTrue(getWebDriver().findElement (By.xpath(".//div[@id='header_container']/div[2]/span")).getText().equals("CHECKOUT: OVERVIEW"));
    }
    @Test
    void finishTest () throws InterruptedException {
        new MainPage (getWebDriver()).addToCart();
        new MainPage(getWebDriver()).clickCart();
        new MainPage (getWebDriver()).clickCheckout();
        new MainPage(getWebDriver()).fillTheForm();
        new MainPage(getWebDriver()).clickContinue();
        new MainPage(getWebDriver()).clickFinish();
        Assertions.assertTrue(getWebDriver().findElement (By.xpath(".//div[@id='checkout_complete_container']/h2")).getText().equals("THANK YOU FOR YOUR ORDER"));
    }

}
