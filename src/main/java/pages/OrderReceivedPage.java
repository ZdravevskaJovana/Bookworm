package pages;

import helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class OrderReceivedPage {
    private By pageTitle = By.cssSelector("h6.font-weight-medium");
    private By message = By.cssSelector("h6.font-size-3");

    public String getPageTitle(){
        return SeleniumHelper.waitAndFindElement(pageTitle).getText();
    }
    public String getPageMessage(){
        return SeleniumHelper.findElement(message).getText();
    }
}
