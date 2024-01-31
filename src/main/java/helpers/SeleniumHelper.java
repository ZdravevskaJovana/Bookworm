package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SeleniumHelper {

    private static WebDriver driver;
    private static WebDriverWait wait;

    private static Actions actions;

    public static void initializingWebDriver() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    public static WebElement waitAndFindElement(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement hoverAndFindElement(By locator) {
        WebElement element = driver.findElement(locator);
        actions.moveToElement(element).perform();
        return element;}

    public static WebElement doubleClick (By locator){
        WebElement element = driver.findElement(locator);
        actions.doubleClick(element).perform();
        return element;
    }
    }

