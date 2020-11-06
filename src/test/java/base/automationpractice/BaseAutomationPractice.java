package base.automationpractice;

import base.automationpractice.enums.Menu;
import base.selenium.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseAutomationPractice extends Base {
    By usernameLocator = By.id("email");
    By passwordLocator = By.id("passwd");
    By loginButtonLocator = By.id("SubmitLogin");
    By womenMenu = By.xpath("(//a[@class='sf-with-ul'])[1]");
    By dressesMenu = By.xpath("(//a[@class='sf-with-ul'])[4]");

    public BaseAutomationPractice(WebDriver driver){
        super(driver);
    }
    public void login(String userName , String password) {
        type(userName,usernameLocator);
        type(password,passwordLocator);
        click(loginButtonLocator);
    }
    public void goToMenu(Menu menu) {
        switch (menu) {
            case WOMEN:
                waitElementToBeClickable(womenMenu);
                click(womenMenu);
                break;
            case DRESSES:
                waitElementToBeClickable(dressesMenu);
                click(dressesMenu);
                break;
            default:
                System.out.println("no menu selected");
                break;
        }
    }

}
