package TestCases;

import Pages.BasePage;
import Pages.SortByNamePage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortByNamePageTestCases extends BasePage {
    private SortByNamePage sortDropdown;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        sortDropdown = new SortByNamePage(driver);
    }
    @Test
    public void selectDropdownOptions() throws InterruptedException{
       sortDropdown.SortByNameDropdown();
       sortDropdown.SelectByNameAZ();
       sortDropdown.SelectByNameZA();
       sortDropdown.SortByPriceLow();
       sortDropdown.SortByPriceHigh();
        Assert.assertEquals("Sort by name (A to Z)", "Sort by name (A to Z)");
    }
    @Test
    public void addCheapestProductToCart() throws InterruptedException{
        sortDropdown.SortByNameDropdown();
        sortDropdown.SortByPriceLow();
        sortDropdown.AddCheapestProductToCart();
        sortDropdown.clickOnCartBtnNavBar();
        Assert.assertEquals("Your cart", "Your cart");
    }
    @Test
    public void addMultipleProductsOfTheSameProductToCart() throws InterruptedException{
        sortDropdown.SortByNameDropdown();
        sortDropdown.SortByPriceLow();
        sortDropdown.AddCheapestProductToCart();
        sortDropdown.AddCheapestProductToCart();
        sortDropdown.AddCheapestProductToCart();
        sortDropdown.clickOnCartBtnNavBar();
        sortDropdown.MultiplyProductsToCart();
        Assert.assertEquals("Your cart", "Your cart");
    }
}
