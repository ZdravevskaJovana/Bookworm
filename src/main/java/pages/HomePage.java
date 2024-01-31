package pages;

import helpers.SeleniumHelper;
import org.openqa.selenium.By;

public class HomePage {

    private By categoriesBtn = By.linkText("Categories");

    public void navigateToCategories (){
        SeleniumHelper.findElement(categoriesBtn).click();}


}
