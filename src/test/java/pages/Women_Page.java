package pages;

import base.automationpractice.BaseAutomationPractice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Women_Page extends BaseAutomationPractice {
    By addFirstProductButton = By.xpath("(//a[@title='Faded Short Sleeve T-shirts'])[2]");
    By addToCartButton = By.name("Submit");
    By proceedToCheckoutButton = By.xpath("(//a[@title='Proceed to checkout'])[1]");
    By proceedToCheckoutSummaryButton = By.xpath("(//a[@title='Proceed to checkout'])[2]");
    By processAddressButton = By.name("processAddress");
    By shippingCheckboxButton = By.xpath("//input[@type='checkbox']");
    By processCarrierButton = By.name("processCarrier");
    By payByBankButton = By.xpath("//a[@title='Pay by bank wire']");
    By confirmOrderButton = By.xpath("(//button[@type='submit'])[2]");
    By successfulMessageText = By.cssSelector(".cheque-indent");

    public Women_Page(WebDriver driver){
        super(driver);
    }
    public void addFirstProduct() {
        waitElementToBeClickable(addFirstProductButton);
        click(addFirstProductButton);
        waitElementToBeClickable(addToCartButton);
        click(addToCartButton);
        waitElementToBeClickable(proceedToCheckoutButton);
        click(proceedToCheckoutButton);
        waitElementToBeClickable(proceedToCheckoutSummaryButton);
        click(proceedToCheckoutSummaryButton);
        waitElementToBeClickable(processAddressButton);
        click(processAddressButton);
        click(shippingCheckboxButton);
        waitElementToBeClickable(processCarrierButton);
        click(processCarrierButton);
        waitElementToBeClickable(payByBankButton);
        click(payByBankButton);
        waitElementToBeClickable(confirmOrderButton);
        click(confirmOrderButton);
    }
    public String successfulMessage() {
        waitElementVisible(successfulMessageText);
        return getText(successfulMessageText);
    }

}
