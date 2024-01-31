package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifySuccessfullyAddingABookToWishlist extends BaseClass{

    @Test
    public void VerifyAddingABookToWishlist() throws InterruptedException {
        homePage.navigateToCategories();
        String bookName = categoriesPage.getBooksName();
        categoriesPage.clickOnAddToWishlistBtn();
        Thread.sleep(3000);
        categoriesPage.clickOnWishlistBtn();
        String actualResult = wishlistPage.getProductName();
        Assert.assertEquals(bookName,actualResult);

    }
}
