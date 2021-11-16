package pl.coderslab.zadaniawarsztatowe.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestaShopYourAccount {
    @FindBy(partialLinkText = "Addresses")
    private WebElement addresses;

    public PrestaShopYourAccount(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void goToAddresses() {
        addresses.click();
    }
}

