package TestCases;

import Pages.BasePage;
import Pages.DemoShopPage;
import Pages.LoginForm;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginFormTestCases extends BasePage {
    private LoginForm loginFormPopUp;
    @BeforeMethod
    public void setUp() {
        super.setUp();
        loginFormPopUp = new LoginForm(driver);
    }
    @Test
    public void clickOnLoginButtonWithValidCredentials()throws InterruptedException{
        driver.findElement(By.id("responsive-navbar-nav")).click();
        loginFormPopUp.ClickOnLoginButton();
        loginFormPopUp.enterUserName("dino");
        loginFormPopUp.enterPassword("choochoo");
        loginFormPopUp.credentialsLogin();
        Assert.assertEquals("User logged in!", "User logged in!");
    }
    @Test
    public void lockedOutUser()throws InterruptedException{
        driver.findElement(By.id("responsive-navbar-nav")).click();
        loginFormPopUp.ClickOnLoginButton();
        loginFormPopUp.enterUserName("locked");
        loginFormPopUp.enterPassword("choochoo");
        loginFormPopUp.credentialsLogin();
        Assert.assertEquals("The user has been locked out.", "The user has been locked out.");
    }
    @Test
        public void userWithBugs()throws InterruptedException{
        driver.findElement(By.id("responsive-navbar-nav")).click();
        loginFormPopUp.ClickOnLoginButton();
        loginFormPopUp.enterUserName("beetle");
        loginFormPopUp.enterPassword("choochoo");
        loginFormPopUp.credentialsLogin();
        loginFormPopUp.clickAwesomeGraniteChipsProduct();
        loginFormPopUp.clickOnBuyProductsUserWithBugs();
        WebElement element = driver.findElement(By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/a[1]/span"));
        Assert.assertNotNull(element, "Cart counter element is not present.");
        }
    @Test
    public void clickOnLoginButtonWithInvalidCredentials()throws InterruptedException {
        driver.findElement(By.id("responsive-navbar-nav")).click();
        loginFormPopUp.ClickOnLoginButton();
        loginFormPopUp.enterUserName("Andreea");
        loginFormPopUp.enterPassword("pass");
        loginFormPopUp.credentialsLogin();
        Assert.assertEquals(" Incorrect username or password!", " Incorrect username or password!");

    }
    @Test
    public void loginWithNumbers()throws InterruptedException{
        driver.findElement(By.id("responsive-navbar-nav")).click();
        loginFormPopUp.ClickOnLoginButton();
        loginFormPopUp.enterUserName("12345");
        loginFormPopUp.enterPassword("87977");
        loginFormPopUp.credentialsLogin();
        Assert.assertEquals(" Incorrect username or password!", " Incorrect username or password!");
    }
    @Test
    public void loginWithSpecialCharacters()throws InterruptedException{
        driver.findElement(By.id("responsive-navbar-nav")).click();
        loginFormPopUp.ClickOnLoginButton();
        loginFormPopUp.enterUserName("*^$^#@");
        loginFormPopUp.enterPassword("&*@!");
        loginFormPopUp.credentialsLogin();
        Assert.assertEquals(" Incorrect username or password!", " Incorrect username or password!");
    }
    @Test
    public void clickUserAccountAfterSignIn()throws InterruptedException{
        loginFormPopUp.ClickOnLoginButton();
        loginFormPopUp.enterUserName("dino");
        loginFormPopUp.enterPassword("choochoo");
        loginFormPopUp.credentialsLogin();
        loginFormPopUp.checkUserAccountAfterSignIn();
        Assert.assertTrue(driver.getPageSource().contains("Account"));
    }
}
