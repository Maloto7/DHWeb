package base.selenium;

import base.selenium.enums.Browsers;
import base.selenium.interfaces.implementation.ChromeBrowser;
import base.selenium.interfaces.IBrowserConnection;
import base.selenium.interfaces.implementation.FireFoxBrowser;

public class BrowserFactory {
    public IBrowserConnection getBrowserConnection(Browsers browser) {
        switch (browser) {
            case CHROME:
                return new ChromeBrowser();
            case FIREFOX:
                return new FireFoxBrowser();
            default:
                System.out.println("no browser selected");
                return (null);
        }
    }
}
