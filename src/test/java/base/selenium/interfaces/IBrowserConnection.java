package base.selenium.interfaces;

import org.openqa.selenium.WebDriver;

public interface IBrowserConnection {
    WebDriver driverConnection(Boolean headless);
}
