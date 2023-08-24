package TestCases;

import Pages.BasePage;
import Pages.DemoShopPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoShopPageTestCases extends BasePage {
    private DemoShopPage demoIndexPage;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        demoIndexPage = new DemoShopPage(driver);
    }
    @Test
    public void clickOnLogoImage()throws InterruptedException{
        driver.findElement(By.id("responsive-navbar-nav")).click();
        demoIndexPage.clickOnTheLogo();
        Assert.assertEquals("Logo picture reloads the page", "Logo picture reloads the page");
    }
    @Test
    public void clickOnFirstProduct()throws InterruptedException{
        driver.findElement(By.linkText("Awesome Granite Chips"));
        demoIndexPage.clickOnFirstProduct();
//        Assert.assertEquals("First product is selected", "First product is selected");
    }
    @Test
    public void clickOnAddToCartFirstProduct()throws InterruptedException{
        demoIndexPage.AddToCartFirstProduct();
    }
}
