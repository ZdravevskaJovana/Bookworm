package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyOrderingABookSuccessfully extends BaseClass {

    @Test
    public void verifyOrderingABook() throws InterruptedException {
        homePage.navigateToCategories();
        categoriesPage.clickOnAddToCartBtn();
        Thread.sleep(3000);
        categoriesPage.clickOnShoppingBag();
        categoriesPage.clickOnCheckoutBtn();
        checkoutPage.fillTheCheckoutForm("Jovana", "Zdraveva", "MK",
                "Moja ulica 10", "Bitola", "North Macedonia",
                "7000", "0038977221267", "tester@gmail.com");
        checkoutPage.clickOnPlaceOrderBtn();

        Thread.sleep(3000);
        String expectedTitle = "Order received";
        String actualTitle = orderReceivedPage.getPageTitle();
        String expectedMessage = "Thank you. Your order has been received.";
        String actualMessage = orderReceivedPage.getPageMessage();

        Assert.assertEquals(expectedTitle,actualTitle);
        Assert.assertEquals(expectedMessage, actualMessage);
    }
}
