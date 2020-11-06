package test;

import base.automationpractice.enums.Menu;
import base.selenium.enums.Browsers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.*;
import static org.testng.AssertJUnit.assertEquals;

public class BuyProduct {
    private WebDriver driver;
    private String url;
    Women_Page womenPage;
    String userName = "testmail2@email.com";
    String password = "Password.1";

    @BeforeMethod
    public void setUp(){
        url = "http://automationpractice.com/index.php?controller=authentication&back=my-account";
        womenPage = new Women_Page(driver);
        driver = womenPage.driverConnection(Browsers.CHROME,false);
        driver.manage().window().maximize();
        womenPage.goTo(url);
        womenPage.login(userName,password);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void TC_buy() {
        womenPage.goToMenu(Menu.WOMEN);
        womenPage.addFirstProduct();
        assertEquals("Your order on My Store is complete.",womenPage.successfulMessage());
    }
}
