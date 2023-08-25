package TestCases;

import Pages.BasePage;
import Pages.CheckoutForm;
import Pages.LoginForm;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckoutFormTestCases extends BasePage {
    private CheckoutForm checkoutForm;

    @BeforeMethod
    public void setUp() {
        super.setUp();
        checkoutForm = new CheckoutForm(driver);
    }

    @Test
    public void addProductToCartAndFillCheckoutForm() throws InterruptedException {
        checkoutForm.AddToCartFirstProduct();
        checkoutForm.clickOnCartBtnNavBar();
        checkoutForm.checkoutBtn();
        checkoutForm.enterFirstNameInput("Andreea");
        checkoutForm.enterSecondNameNameInput("Moldoveanu");
        checkoutForm.enterAddressInput("Cluj");
        checkoutForm.continueCheckout();
        Assert.assertEquals("Order summary", "Order summary");
    }

    @Test
    public void completeOrderAndContinueShopping() throws InterruptedException {
        checkoutForm.AddToCartFirstProduct();
        checkoutForm.clickOnCartBtnNavBar();
        checkoutForm.checkoutBtn();
        checkoutForm.enterFirstNameInput("Andreea");
        checkoutForm.enterSecondNameNameInput("Moldoveanu");
        checkoutForm.enterAddressInput("Cluj");
        checkoutForm.continueCheckout();
        checkoutForm.CompleteOrderBtn();
        Assert.assertEquals("Thank you for your order!", "Thank you for your order!");
    }
}
