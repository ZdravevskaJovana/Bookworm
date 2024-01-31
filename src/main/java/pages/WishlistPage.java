package pages;

import helpers.SeleniumHelper;
import org.openqa.selenium.By;

public class WishlistPage {

    private By editTitleBtn = By.xpath("//input[@name=\"wishlist_name\"]");
    private By wishlistTitle = By.xpath("//*[@id=\"yith-wcwl-form\"]/div[1]/div[1]/h2");
    private By productName = By.cssSelector("td.product-name");
    private By checkMarkBtn = By.cssSelector("i.fa-check");


    public void editTitle(String title){
        SeleniumHelper.findElement(editTitleBtn).clear();
        SeleniumHelper.findElement(editTitleBtn).sendKeys(title);
        SeleniumHelper.findElement(checkMarkBtn).click();}
    public String getWishlistTitle(){
        return SeleniumHelper.findElement(wishlistTitle).getText();}

    public String getProductName(){
        return SeleniumHelper.findElement(productName).getText();}



}
