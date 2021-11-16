package pl.coderslab.zadaniawarsztatowe.tests;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.zadaniawarsztatowe.source.*;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class ZadanieWarsztatowe1 {
    private WebDriver driver;
    private PrestaShopMainPage mainPage;
    private PrestaShopLogInPage logInPage;
    private PrestaShopYourAccount yourAccountPage;
    private PrestaShopYourAddressesPage yourAddressesPage;
    private PrestaShopAddNewAddres addNewAddres;

    @Given("Opened webpage: {word}")
    public void openPrestaShopMainPage(String url) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get(url);
        mainPage = new PrestaShopMainPage(driver);
        logInPage = new PrestaShopLogInPage(driver);
        yourAccountPage = new PrestaShopYourAccount(driver);
        yourAddressesPage = new PrestaShopYourAddressesPage(driver);
        addNewAddres = new PrestaShopAddNewAddres(driver);
    }

    @And("Click sing in button")
    public void clickSingInButton() {
        mainPage.clickSingIn();
    }

    @When("Valid email={word} and password={word} provided in login and password input box")
    public void inputEmailAndPassword(String email, String password) {
        logInPage.inputEmailAndPassword(email, password);
    }

    @And("Click another sing in button")
    public void clickAnotherSingInClick() {
        logInPage.singInClick2();
    }

    @And("Go to addresses page")
    public void goToAddressesPage() {
        yourAccountPage.goToAddresses();
    }

    @And("Click add new address button")
    public void clickNewAddressButton() {
        yourAddressesPage.newAddressButton();
    }

    @And("Fill valid address data: {word}, {}, {word}, {}, {}, {}")
    public void fillAddressDta(String alias, String address, String city, String postalcode, String country, String phone) {
        addNewAddres.country(country);
        addNewAddres.addAlias(alias);
        addNewAddres.addAddress(address);
        addNewAddres.addCity(city);
        addNewAddres.addPostcode(postalcode);
        addNewAddres.addPhone(phone);

    }

    @And("Click save button")
    public void clickSaveButton() {
        addNewAddres.saveClick();
    }

    @Then("Confirmed add new address success: {word}, {}, {word}, {}, {}, {}")
    public void confirmAddNewAddressSuccess(String alias, String address, String city, String postalcode, String country, String phone) {
        assertTrue(yourAddressesPage.isAddNewAddressSuccess(alias));
        assertTrue(yourAddressesPage.isAddNewAddressSuccess(address));
        assertTrue(yourAddressesPage.isAddNewAddressSuccess(city));
        assertTrue(yourAddressesPage.isAddNewAddressSuccess(postalcode));
        assertTrue(yourAddressesPage.isAddNewAddressSuccess(country));
        assertTrue(yourAddressesPage.isAddNewAddressSuccess(phone));
    }

    @And("Delete added address")
    public void deleteNewAddress() {
        yourAddressesPage.deleteNewAddress();
    }

    @And("Confirmed deleted added address")
    public void confirmNewAddressDeleted() {
        assertTrue(yourAddressesPage.isNewAddressSuccessDelete());
    }

    @And("Browser quit")
    public void browserQuit() {
        driver.quit();
    }

}
