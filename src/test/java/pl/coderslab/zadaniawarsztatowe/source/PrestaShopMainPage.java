package pl.coderslab.zadaniawarsztatowe.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestaShopMainPage {
    @FindBy(css = "span.hidden-sm-down")
    private WebElement singInClick;

    public PrestaShopMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void clickSingIn() {
        singInClick.click();
    }

}

