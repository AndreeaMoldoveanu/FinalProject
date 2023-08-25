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
    public void checkoutWithEmptyFieldForm()throws InterruptedException {
        checkoutForm.AddToCartFirstProduct();
        checkoutForm.clickOnCartBtnNavBar();
        checkoutForm.checkoutBtn();
        checkoutForm.enterFirstNameInput("");
        checkoutForm.continueCheckout();
        Assert.assertEquals("First Name is required", "First Name is required");
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
    @Test
    public void deliveryInfo()throws InterruptedException{
        checkoutForm.AddToCartFirstProduct();
        checkoutForm.clickOnCartBtnNavBar();
        checkoutForm.checkoutBtn();
        checkoutForm.enterFirstNameInput("Dino");
        checkoutForm.enterSecondNameNameInput("Smith");
        checkoutForm.enterAddressInput("Romania");
        checkoutForm.deliveryInfo();
        Assert.assertEquals("Choo Choo delivery radio button is selected", "Choo Choo delivery radio button is selected");
    }
    @Test
    public void paymentInfo()throws InterruptedException{
        checkoutForm.AddToCartFirstProduct();
        checkoutForm.clickOnCartBtnNavBar();
        checkoutForm.checkoutBtn();
        checkoutForm.enterFirstNameInput("Turtle");
        checkoutForm.enterSecondNameNameInput("John");
        checkoutForm.enterAddressInput("UK");
        checkoutForm.paymentInfo();
        Assert.assertEquals("Cash on delivery radio button is selected", "Cash on delivery radio button is selected");
    }
}
