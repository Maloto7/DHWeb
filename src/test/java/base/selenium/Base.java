package base.selenium;

import base.selenium.interfaces.IBrowserConnection;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import base.selenium.enums.Browsers;

public class Base {
    private WebDriver driver;
    private Actions actions;
    private WebDriverWait wait;

    public Base(WebDriver driver){
        this.driver = driver;
    }

    public WebDriver driverConnection(Browsers browser, Boolean headless){

        try {
            BrowserFactory browserConnection = new BrowserFactory();
            IBrowserConnection browserDriver = browserConnection.getBrowserConnection(browser);
            this.driver = browserDriver.driverConnection(headless);
            this.actions = new Actions(driver);
            this.wait = new WebDriverWait(driver,60);
        }catch (Exception e){
            System.out.println("The message is: " + e.getMessage());
            System.out.println("The cause is: " + e.getCause() );
            e.printStackTrace();
        }
        return driver;
    }

    public void waitElementVisible(By locator){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void waitElementToBeClickable(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public void type(String inputText, By locator){
        driver.findElement(locator).sendKeys(inputText);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }
    public void goTo(String url){
        driver.get(url);
    }

}
