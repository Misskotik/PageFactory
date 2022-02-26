package ru.misskotik;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class LoginTest extends AbstractTest{
    @Test
    void loginIn(){

        new LoginPage(getWebDriver()).setLogin("standard_user").setPassword("secret_sauce").loginIn();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().equals("https://www.saucedemo.com/inventory.html"));

    }
}





//    @Test
//    void loginInSecond(){
////        new MainPageTest(getWebDriver()).goToLogin();
////        Assertions.assertTrue(getWebDriver().getCurrentUrl().equals("saucedemo.com"), "Page Not Found");
//        new LoginPage(getWebDriver()).loginIn("standard_user","secret_sauce");
//        // Assertions.assertTrue(webDriver.findElement(By.id("idcta-username")).getText().equals("Your account"));
//    }
//
//
////    @AfterEach
//    void logout(){
//        new MainPage(getWebDriver()).goToLogin();
//        Assertions.assertTrue(getWebDriver().getTitle().equals(" "), "страница аккаунта не доступна");
//        new AccountPage(getWebDriver()).logOut();
//        new WebDriverWait(getWebDriver(),Duration.ofSeconds(5));
//        Assertions.assertTrue(getWebDriver().findElement(By.id("idcta-username")).getText().equals("Sign in"));
//    }






