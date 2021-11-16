package pl.coderslab.zadaniawarsztatowe.source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DriverCommand;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.sql.DriverAction;

public class PrestaShopProductPageProbadodatek {
    @FindBy(id = "group_1")
    private WebElement chooseSize;
    @FindBy(name = "qty")
    private WebElement chooseQuantity;
    @FindBy(css = "button.btn.btn-primary.add-to-cart")
    private WebElement addToCartButton;
    @FindBy(css = "a.btn.btn-primary")
    private WebElement proceedToCheackoutButton;
    @FindBy(css = "span.regular-price")
    private WebElement regularPrice;
    @FindBy(css = "span.discount.discount-percentage")
    private WebElement discount;
    @FindBy(css = "span.price")
    private WebElement price;

    public PrestaShopProductPageProbadodatek(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void chooseSize(String size) {
        chooseSize.click();
        chooseSize.sendKeys(size + Keys.ENTER);
    }

    public void chooseQuantity(String quantity) {
        chooseQuantity.clear();
        chooseQuantity.sendKeys(quantity);
    }

    public void clickAddToCartButton() {
        addToCartButton.click();
    }

    public void clickProceedToCheackoutButton() {
        proceedToCheackoutButton.click();
    }

    public void isItDiscount() {
        String dis;
//        price.getText();
        discount.getText().replaceAll("\\s", "");
        regularPrice.getText().replaceAll("\\s", "");
    }
}
