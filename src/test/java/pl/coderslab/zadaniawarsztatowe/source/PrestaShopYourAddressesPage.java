package pl.coderslab.zadaniawarsztatowe.source;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestaShopYourAddressesPage {
    @FindBy(partialLinkText = "Create new address")
    private WebElement createNewAddressButton;
    @FindBy(xpath = "//*[@id=\"content\"]")
    private WebElement addedNewAddressConfirm;
    @FindBy(css = "div.address-footer > a:nth-child(2) > span")
    private WebElement deleteAddedAddress;
    @FindBy(css = "#notifications > div > article > ul > li")
    private WebElement confirmDeleteAddedAddress;
    @FindBy(name = "s")
    private WebElement search;

    public PrestaShopYourAddressesPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void newAddressButton() {
        createNewAddressButton.click();
    }

    public boolean isAddNewAddressSuccess(String cheack) {
        return addedNewAddressConfirm.getText().contains(cheack);
    }

    public void deleteNewAddress() {
        deleteAddedAddress.click();
    }

    public boolean isNewAddressSuccessDelete() {
        return confirmDeleteAddedAddress.getText().equals("Address successfully deleted!");
    }

    public void searchThing(String thing) {
        search.clear();
        search.sendKeys(thing + Keys.ENTER);
    }
}
