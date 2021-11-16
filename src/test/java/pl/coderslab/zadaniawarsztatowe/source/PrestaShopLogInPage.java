package pl.coderslab.zadaniawarsztatowe.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestaShopLogInPage {
    @FindBy(name = "email")
    private WebElement emailInput;
    @FindBy(name = "password")
    private WebElement password;
    @FindBy(id = "submit-login")
    private WebElement singIn;

    public PrestaShopLogInPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void inputEmailAndPassword(String email, String passwrd) {
        emailInput.clear();
        emailInput.sendKeys(email);
        password.clear();
        password.sendKeys(passwrd);
    }
    public void singInClick2(){
        singIn.click();
    }
}
