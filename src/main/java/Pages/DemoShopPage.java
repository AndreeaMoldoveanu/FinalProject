package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoShopPage extends BasePage {
    public DemoShopPage (WebDriver driver){super(driver);}
    By clickOnLogo = By.className("navbar-brand");
    public void clickOnTheLogo(){driver.findElement(clickOnLogo).click();}
    By cartNavBar = By.xpath("/html/body/div/div/div[1]/nav/div/div[2]/span/a[1]");
    public void clickOnCartBtnNavBar(){driver.findElement(cartNavBar).click();}
    By wishListNavBar = By.xpath("//*[@id=\"responsive-navbar-nav\"]/div[2]/span/a[2]");
    public void clickOnWishlistNavBar(){driver.findElement(wishListNavBar).click();}
    By unselectWishList = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/button[2]");
    public void clickAndUnselectWishlistProduct(){driver.findElement(unselectWishList).click();}
    By clickOnProductOne = By.xpath("/html/body/div/div/div[2]/div[2]/div[2]/div[1]/div/div[1]/a");
    public void clickOnFirstProduct(){driver.findElement(clickOnProductOne).click();}
    By clickOnAddToWishlistProductOne = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/button[2]");
    public void ClickOnAddToWishlistProductOne(){driver.findElement(clickOnAddToWishlistProductOne).click();}
    By clickOnAddToCardBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[1]/div/div[2]/button[1]");
    public void AddToCartFirstProduct(){driver.findElement(clickOnAddToCardBtn).click();}
    By clickOnContinueShoppingBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/a[1]");
    public void continueShoppingBtn(){driver.findElement(clickOnContinueShoppingBtn).click();}
    By clickOnCheckoutBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[3]/a[2]");
    public void checkoutBtn(){driver.findElement(clickOnCheckoutBtn).click();}
    By questionMarkSignBtn = By.xpath("//*[@id=\"root\"]/div/div[3]/nav/div/div/div[1]");
    public void QuestionMarkSign(){driver.findElement(questionMarkSignBtn).click();}
    By resetPageBtn = By.xpath("//*[@id=\"root\"]/div/div[3]/nav/div/div/div[2]");
    public void resetAndReloadPageBtn(){driver.findElement(resetPageBtn).click();}
    By searchInput = By.id("input-search");
    public void searchInputField (String arg1) {
        driver.findElement(searchInput).sendKeys(arg1);
    }
    By searchByUnavailableProduct = By.id("input-search");
    public void SearchUnavailableProduct (String arg1) {driver.findElement(searchByUnavailableProduct).sendKeys(arg1);}
    By searchBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/form/div[1]/button");
    public void clickOnSearchBtn(){driver.findElement(searchBtn).click();}
    By randomProduct = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[2]/div/div[2]/button[1]");
    public void RandomProductOne(){driver.findElement(randomProduct).click();}

    By RandomProduct2 = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[2]/div[4]/div/div[2]/button[1]");
    public void RandomProductTwo(){driver.findElement(RandomProduct2).click();}

    By emptyShoppingCart = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[1]/div/button[1]");
     public void deleteShoppingCart(){driver.findElement(emptyShoppingCart).click();}

    By deleteProductsWithTashBtn = By.xpath("//*[@id=\"root\"]/div/div[2]/div[2]/div[1]/div/div/div/div[5]/button");
     public void trashBtn(){driver.findElement(deleteProductsWithTashBtn).click();}

}
