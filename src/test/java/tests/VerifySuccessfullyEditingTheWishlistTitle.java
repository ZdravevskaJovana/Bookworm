package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySuccessfullyEditingTheWishlistTitle extends BaseClass{

    @Test
    public void verifyEditingTheTitle() throws InterruptedException {
        homePage.navigateToCategories();
        categoriesPage.clickOnAddToWishlistBtn();
        Thread.sleep(3000);
        categoriesPage.clickOnWishlistBtn();;
        Thread.sleep(3000);
        categoriesPage.clickOnWishlistBtn();
        wishlistPage.editTitle("Test Wishlist");
        Thread.sleep(3000);
        String expectedResult = "Test Wishlist";
        String actualResult = wishlistPage.getWishlistTitle();
        Assert.assertEquals(actualResult, expectedResult);
        System.out.println(actualResult);


    }

}
