package pages;

import helpers.SeleniumHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage {

    private By firstNameFld = By.id("billing_first_name");
    private By lastNameFld = By.id("billing_last_name");
    private By countryRegionFld = By.id("billing_country");
    private By streetAddressFld = By.id("billing_address_1");
    private By townCityFld = By.id("billing_city");
    private By stateCountryFld = By.id("billing_state");
    private By postcodeZipFld = By.id("billing_postcode");
    private By phoneFld = By.id("billing_phone");
    private By emailFld = By.id("billing_email");
    private By placeOrderBtn = By.id("place_order");

    public void fillTheCheckoutForm(String firstName, String lastName,String country,
                                    String streetAddress, String townCity,String stateCountry,
                                    String zip, String phone, String email) throws InterruptedException {
        SeleniumHelper.findElement(firstNameFld).sendKeys(firstName);
        SeleniumHelper.findElement(lastNameFld).sendKeys(lastName);
        WebElement countryRegionDropdown = SeleniumHelper.findElement(countryRegionFld);
        Select countryRegionList = new Select(countryRegionDropdown);
        countryRegionList.selectByValue(country);
        SeleniumHelper.findElement(streetAddressFld).sendKeys(streetAddress);
        SeleniumHelper.findElement(townCityFld).sendKeys(townCity);
        SeleniumHelper.findElement(stateCountryFld).sendKeys(stateCountry);
        SeleniumHelper.findElement(postcodeZipFld).sendKeys(zip);
        SeleniumHelper.findElement(phoneFld).sendKeys(phone);
        SeleniumHelper.findElement(emailFld).sendKeys(email);
    }
    public void clickOnPlaceOrderBtn (){
        SeleniumHelper.findElement(placeOrderBtn).click();}


}
