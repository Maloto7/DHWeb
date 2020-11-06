package base.selenium.interfaces.implementation;

import base.selenium.interfaces.IBrowserConnection;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class FireFoxBrowser implements IBrowserConnection {
    private WebDriver driver;

    public WebDriver driverConnection(Boolean headless) {
        WebDriverManager.firefoxdriver().setup();
        if (headless) {
            FirefoxOptions options = new FirefoxOptions();
            options.addArguments("--headless");
            driver = new FirefoxDriver(options);
        } else {
            driver = new FirefoxDriver();
        }
        return driver;
    }
}
