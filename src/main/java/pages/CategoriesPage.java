package pages;

import helpers.SeleniumHelper;
import org.openqa.selenium.By;

public class CategoriesPage {

    private By bookCard = By.xpath("(//div[contains(@class,'product__inner overflow-hidden')])[3]");
    private By addToCartBtn = By.xpath("//*[@id=\"main\"]/div[3]/ul/li[2]/div[1]/div/div/div[3]/a[1]/span[2]/i");
    private By shoppingBagBtn = By.xpath("//*[@id=\"sidebarNavToggler-my_cart\"]/i");
    private By wishlistBtn = By.xpath("//i[@class='flaticon-heart font-size-3']");
    private By addToWishListBtn = By.xpath("//*[@id=\"main\"]/div[3]/ul/li[2]/div[1]/div/div/div[3]/div/div/a/i");
    private By checkoutBtn = By.linkText("Checkout");
    private By booksTitle = By.linkText("Blindside (Michael Bennett Book 12)");


    public void clickOnAddToCartBtn () throws InterruptedException {
        SeleniumHelper.hoverAndFindElement(bookCard);
        Thread.sleep(3000);
        SeleniumHelper.findElement(addToCartBtn).click();}
    public void clickOnWishlistBtn (){
        SeleniumHelper.findElement(wishlistBtn).click();}
    public void clickOnAddToWishlistBtn() throws InterruptedException {
        SeleniumHelper.hoverAndFindElement(bookCard);
        Thread.sleep(3000);
        SeleniumHelper.waitAndFindElement(addToWishListBtn).click();}
    public void clickOnShoppingBag(){
        SeleniumHelper.doubleClick(shoppingBagBtn);}
    public void clickOnCheckoutBtn(){
        SeleniumHelper.findElement(checkoutBtn).click();}
    public String getBooksName(){
        return SeleniumHelper.findElement(booksTitle).getText();}



}
