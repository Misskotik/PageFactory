package ru.misskotik;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

        PageFactory.initElements(driver, this);
    }

    protected WebDriver getDriver() {

        return this.driver;
    }

        @FindBy(id = "user-name")
        private WebElement login;

        @FindBy(id = "password")
        private WebElement password;


        @FindBy(id = "login-button")
        private WebElement submit;


//    public LoginPage(WebDriver driver){
//
//            super(driver);
//        }
    public LoginPage(WebDriver driver, WebElement login, WebElement password, WebElement submit) {
//        super(driver);
        this.login = login;
        this.password = password;
        this.submit = submit;
    }

        private void loginSite () {
        this.login.sendKeys("standard_user");
        this.password.sendKeys("secret_sauce");
        this.submit.click();
        }

        public void loginIn(){
            this.submit.click();
        }

        public LoginPage setLogin(String login){
            this.login.sendKeys(login);
            return this;
        }

        public LoginPage setPassword(String password){
//            this.password.click();
            this.password.sendKeys(password);
            return this;
        }
    public void loginIn(String login, String password){
    Actions loginIn = new Actions(getDriver());
        loginIn.sendKeys(this.login).click(this.password).sendKeys(password).click(this.submit).build().perform();
}





//    @FindBy(id = "user-name")
//    private WebElement username;
//
//    @FindBy(id = "password")
//    private WebElement password;
//
//    @FindBy(id = "login-button")
//    private WebElement loginbutton;
//

//
//    //    }
//    public void goToLogin () {
//        this.username.click();
////        new WebDriverWait(getDriver(), Duration.ofSeconds(10)).until(ExpectedConditions.urlContains("https://www.saucedemo.com/inventory.html"));
//
//    }
}
