package ru.misskotik;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
//    private WebDriver driver;
//
//    public MainPage(WebDriver driver) {
//        this.driver = driver;
//
//        PageFactory.initElements(driver, this);
//    }
//
//    protected WebDriver getDriver() {
//
//        return this.driver;
//    }
//


    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement backpack;

    @FindBy(xpath = ".//div[@id='shopping_cart_container']/a")
    private WebElement container;

    @FindBy(id = "remove-sauce-labs-backpack")
    private WebElement remove;


    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement bikeLight;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement tShirt;

    @FindBy(id = "checkout")
    private WebElement checkout ;

    @FindBy(id = "first-name")
    private WebElement name ;

    @FindBy(id = "last-name")
    private WebElement lastname ;

    @FindBy(id = "postal-code")
    private WebElement postalcode ;

    @FindBy(id = "continue-shopping")
    private WebElement continueShopping;

    @FindBy(id = "continue")
    private WebElement continueButton;

    @FindBy(id = "finish")
    private WebElement finish;

    public MainPage(WebDriver driver) {
        super(driver);
//        driver.get("http://saucedemo.com/inventory");
    }


//    public MainPage(WebDriver driver, WebElement backpack, WebElement container, WebElement remove, WebElement bikeLight, WebElement tShirt) {
//        super(driver);
//        this.backpack = backpack;
//        this.container = container;
//        this.remove = remove;
//        this.bikeLight = bikeLight;
//        this.tShirt = tShirt;
//    }

    public WebElement getBackpack() {
        return backpack;
    }

    public WebElement getContainer() {
        return container;
    }

    public WebElement getRemove() {
        return remove;
    }

    public WebElement getBikeLight() {
        return bikeLight;
    }

    public WebElement getTShirt() {
        return tShirt;
    }

    public void addToCart () {
        this.backpack.click();
    }

    public void clickCart () {
        this.container.click();
    }

    public void removeFromCart () {
//        this.backpack.click();
        this.remove.click ();
    }

    public void addMoreItems () {
        this.bikeLight.click();
        this.tShirt.click ();
    }

    public void fillTheForm () {
        this.name.sendKeys("Alex");
        this.lastname.sendKeys("Davon");
        this.postalcode.sendKeys("190000");
    }
    public void clickContinueShopping () {
        this.continueShopping.click ();
    }

    public void clickCheckout () {
        this.checkout.click ();
    }

    public void clickFinish () {
        this.finish.click ();
    }
    public void clickContinue () {
        this.continueButton.click ();
    }

//    public void addToCart(String backpack) {
//        Actions addToCart = new Actions(getDriver());
//        addToCart.click(this.backpack)
//                .build()
//                .perform();
//    }

}
