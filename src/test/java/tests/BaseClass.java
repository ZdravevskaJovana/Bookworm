package tests;

import helpers.SeleniumHelper;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.*;

import java.time.Duration;

public class BaseClass {

    CategoriesPage categoriesPage;
    HomePage homePage;
    WishlistPage wishlistPage;
    CheckoutPage checkoutPage;
    OrderReceivedPage orderReceivedPage;


    @BeforeClass
    public void setUp() {
        SeleniumHelper.initializingWebDriver();
        SeleniumHelper.getDriver().manage().window().maximize();
        SeleniumHelper.getDriver().get("https://bookworm.madrasthemes.com/");
        SeleniumHelper.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @BeforeTest
    public void initPages() {
        categoriesPage = new CategoriesPage();
        homePage = new HomePage();
        wishlistPage = new WishlistPage();
        checkoutPage = new CheckoutPage();
        orderReceivedPage = new OrderReceivedPage();
    }

    @AfterClass
    public void tearDown() {
        SeleniumHelper.getDriver().quit();
    }

}
