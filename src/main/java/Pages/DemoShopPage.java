package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoShopPage extends BasePage {
    public DemoShopPage (WebDriver driver){super(driver);}

    By clickOnLogo = By.className("navbar-brand");
    public void clickOnTheLogo(){driver.findElement(clickOnLogo).click();}

    By clickOnProductOne = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a");
    public void clickOnFirstProduct(){driver.findElement(clickOnProductOne).click();}

    By clickOnAddToCardBtn = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/button[1]/svg");
    public void AddToCartFirstProduct(){driver.findElement(clickOnAddToCardBtn).click();}

}
