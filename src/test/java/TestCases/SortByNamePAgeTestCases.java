package TestCases;

import Pages.BasePage;
import Pages.DemoShopPage;
import Pages.SortByNamePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortByNamePAgeTestCases extends BasePage {
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
    }
    @Test
    public void addCheapestProductToCart() throws InterruptedException{
        sortDropdown.SortByNameDropdown();
        sortDropdown.SortByPriceLow();
        sortDropdown.AddCheapestProductToCart();
        sortDropdown.clickOnCartBtnNavBar();
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
    }
}
