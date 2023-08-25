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
        public void clickOnLogoImage() throws InterruptedException {
        driver.findElement(By.id("responsive-navbar-nav")).click();
        demoIndexPage.clickOnTheLogo();
        Assert.assertEquals("Logo picture reloads the page", "Logo picture reloads the page");
    }
        @Test
        public void clickOnCartBtnNavBar() throws InterruptedException {
        demoIndexPage.clickOnCartBtnNavBar();
        Assert.assertEquals("How about adding some products in your cart?", "How about adding some products in your cart?");
    }
        @Test
        public void clickOnWishlistBtnNavBar() throws InterruptedException {
        demoIndexPage.clickOnWishlistNavBar();
        Assert.assertEquals("Wishlist page is loaded", "Wishlist page is loaded");
    }
        @Test
        public void clickOnFirstProduct() throws InterruptedException {
        driver.findElement(By.linkText("Awesome Granite Chips"));
        demoIndexPage.clickOnFirstProduct();
        Assert.assertEquals("First product is selected", "First product is selected");
    }
        @Test
        public void clickOnAddToCartFirstProductAndContinueShopping() throws InterruptedException {
        demoIndexPage.AddToCartFirstProduct();
        demoIndexPage.clickOnCartBtnNavBar();
        demoIndexPage.continueShoppingBtn();
    }
        @Test
        public void clickOnAddToCartFirstProductAndGoToCheckout() throws InterruptedException {
        demoIndexPage.AddToCartFirstProduct();
        demoIndexPage.clickOnCartBtnNavBar();
        demoIndexPage.checkoutBtn();
    }
        @Test
        public void addToWishListFirstProduct() throws InterruptedException {
        demoIndexPage.ClickOnAddToWishlistProductOne();
        }
        @Test
        public void clickOnQuestionMarkBtn()throws InterruptedException{
        demoIndexPage.QuestionMarkSign();
        Assert.assertTrue(driver.getPageSource().contains("Valid usernames"));
        }
        @Test
        public void clickOnReloadPageBtn()throws InterruptedException{
        demoIndexPage.resetAndReloadPageBtn();
        Assert.assertEquals("Page is loaded", "Wishlist Page is loaded");
        }
        @Test
        public void searchInputField()throws InterruptedException {
        demoIndexPage.searchInputField("shirt");
        demoIndexPage.clickOnSearchBtn();
        }
        @Test
        public void searchUnavailableProduct()throws InterruptedException {
        demoIndexPage.searchInputField("flower");
        demoIndexPage.clickOnSearchBtn();
    }
        @Test
        public void addRandomProductsToCart()throws InterruptedException{
        demoIndexPage.RandomProductOne();
        demoIndexPage.RandomProductTwo();
        demoIndexPage.clickOnCartBtnNavBar();
        }
        @Test
        public void deleteProductsFromShoppingCart()throws InterruptedException{
        demoIndexPage.RandomProductOne();
        demoIndexPage.RandomProductTwo();
        demoIndexPage.clickOnCartBtnNavBar();
        demoIndexPage.deleteShoppingCart();
        }
        @Test
        public void addProductAndDeleteWithTrashBtn()throws InterruptedException{
        demoIndexPage.AddToCartFirstProduct();
        demoIndexPage.clickOnCartBtnNavBar();
        demoIndexPage.trashBtn();
        Assert.assertEquals("How about adding some products in your cart?", "How about adding some products in your cart?");
        }
}

