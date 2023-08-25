package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutForm extends BasePage {
    public CheckoutForm (WebDriver driver){super(driver);}
    By EnterFirstName = By.id("first-name");
    public void enterFirstNameInput(String arg1) {
        driver.findElement(EnterFirstName).sendKeys(arg1);
    }
    By EnterSecondName = By.id("last-name");
    public void enterSecondNameNameInput(String arg1) {
        driver.findElement(EnterSecondName).sendKeys(arg1);
    }
    By Address = By.id("address");
    public void enterAddressInput(String arg1) {
        driver.findElement(Address).sendKeys(arg1);
    }
    By clickOnAddToCardBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/button[1]");
    public void AddToCartFirstProduct(){driver.findElement(clickOnAddToCardBtn).click();}
    By cartNavBar = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/a[1]");
    public void clickOnCartBtnNavBar(){driver.findElement(cartNavBar).click();}
    By clickOnCheckoutBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/a[2]");
    public void checkoutBtn(){driver.findElement(clickOnCheckoutBtn).click();}
    By clickOnContinueCheckout = By.xpath("//*[@id=\"root\"]/div/div[2]/form/div/div[2]/button");
    public void continueCheckout(){driver.findElement(clickOnContinueCheckout).click();}
    By clickCompleteOrder = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/a[2]");
    public void CompleteOrderBtn(){driver.findElement(clickCompleteOrder).click();}
    By clickOnContinueShopping = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/a");
    public void ContinueShoppingBtn(){driver.findElement(clickOnContinueShopping).click();}
    By deliveryInfoRadioBtn = By.className("form-check-input");
    public void deliveryInfo(){driver.findElement(deliveryInfoRadioBtn).click();}
    By paymentInfoRadioBtn = By.className("form-check");
    public void paymentInfo(){driver.findElement(paymentInfoRadioBtn).click();}
}
