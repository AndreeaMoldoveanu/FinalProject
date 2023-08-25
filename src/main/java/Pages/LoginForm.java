package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginForm extends BasePage {
    public LoginForm (WebDriver driver){super(driver);}
    By clickOnLoginBtn = By.xpath("//*[@id=\"responsive-navbar-nav\"]/div[2]/span/span/span/button");
    public void ClickOnLoginButton(){driver.findElement(clickOnLoginBtn).click();}
    By UsernameInput = By.id("user-name");
    public void enterUserName(String arg1) {
        driver.findElement(UsernameInput).sendKeys(arg1);
    }
    By PasswordInput = By.id("password");
    public void enterPassword(String arg1) {
        driver.findElement(PasswordInput).sendKeys(arg1);
    }
    By LoginBtn = By.xpath("/html/body/div[3]/div/div/div[2]/div/form/button");
    public void credentialsLogin(){driver.findElement(LoginBtn).click();}
    By closeBtn = By.className("close");
    public void closeButton(){driver.findElement(closeBtn).click();}
    By userAccount = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/span");
    public void checkUserAccountAfterSignIn(){driver.findElement(userAccount).click();}
    By buyProductsUserWithBugs = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/button[1]");
    public void clickOnBuyProductsUserWithBugs(){driver.findElement(buyProductsUserWithBugs).click();}
    By awesomeGraniteChipsProduct = By.linkText("Awesome Granite Chips");
    public void clickAwesomeGraniteChipsProduct(){driver.findElement(awesomeGraniteChipsProduct).click();}
}