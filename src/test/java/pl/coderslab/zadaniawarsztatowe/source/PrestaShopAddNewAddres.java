package pl.coderslab.zadaniawarsztatowe.source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestaShopAddNewAddres {
    @FindBy(name = "alias")
    private WebElement newAlias;
    @FindBy(name = "address1")
    private WebElement newAddress;
    @FindBy(name = "city")
    private WebElement newCity;
    @FindBy(name = "postcode")
    private WebElement newPostcode;
    @FindBy(name = "id_country")
    private WebElement chooseCountry;
    @FindBy(name = "phone")
    private WebElement newPhone;
    @FindBy(css = "button.btn.btn-primary.float-xs-right")
    private WebElement save;

    public PrestaShopAddNewAddres(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void addAlias(String alias) {
        newAlias.clear();
        newAlias.sendKeys(alias);
    }

    public void addAddress(String address) {
        newAddress.clear();
        newAddress.sendKeys(address);
    }

    public void addCity(String city) {
        newCity.clear();
        newCity.sendKeys(city);
    }

    public void addPostcode(String postcode) {
        newPostcode.clear();
        newPostcode.sendKeys(postcode);
    }

    public void country(String country) {
        chooseCountry.click();
        chooseCountry.sendKeys(country);
        chooseCountry.click();
    }

    public void addPhone(String phone) {
        newPhone.clear();
        newPhone.sendKeys(phone);
    }

    public void saveClick() {
        save.click();
    }

}
