package pl.coderslab.zadaniawarsztatowe.source;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestaShopProductPage {
    @FindBy(id = "group_1")
    private WebElement chooseSize;
    @FindBy(name = "qty")
    private WebElement chooseQuantity;
    @FindBy(css = "button.btn.btn-primary.add-to-cart")
    private WebElement addToCartButton;
    @FindBy(css = "a.btn.btn-primary")
    private WebElement proceedToCheackoutButton;

    public PrestaShopProductPage(WebDriver driver) {
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
}
