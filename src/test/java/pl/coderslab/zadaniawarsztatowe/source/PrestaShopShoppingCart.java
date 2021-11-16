package pl.coderslab.zadaniawarsztatowe.source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestaShopShoppingCart {

    @FindBy(css = "a.btn.btn-primary")
    private WebElement proceedToCheackoutButton;
    @FindBy(name = "confirm-addresses")
    private  WebElement contunueButton;
    @FindBy(name = "confirmDeliveryOption")
    private WebElement continueButton2;
    @FindBy(id = "payment-option-1")
    private WebElement paymentOption;
    @FindBy(id = "conditions_to_approve[terms-and-conditions]")
    private WebElement agreeCheackbox;
    @FindBy(css = "button.btn.btn-primary.center-block")
    private WebElement orderButton;

    public PrestaShopShoppingCart(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void cickProceedToCheackoutButton2() {
        proceedToCheackoutButton.click();
    }

    public void clickContunueButton(){
        contunueButton.click();
    }

    public void clickContinueButton2(){
        continueButton2.click();
    }

    public void clickPaymentOption(){
        paymentOption.click();
    }

    public void clickAgreeCheackbox(){
        agreeCheackbox.click();
    }

    public void clickOrderButton(){
        orderButton.click();
    }
}
