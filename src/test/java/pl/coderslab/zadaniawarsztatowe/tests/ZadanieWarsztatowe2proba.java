package pl.coderslab.zadaniawarsztatowe.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pl.coderslab.zadaniawarsztatowe.source.*;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

public class ZadanieWarsztatowe2proba {
    private WebDriver driver;
    private PrestaShopMainPage mainPage;
    private PrestaShopLogInPage logInPage;
    private PrestaShopYourAccount yourAccountPage;
    private PrestaShopYourAddressesPage yourAddressesPage;
    private PrestaShopAddNewAddres addNewAddres;
    private PrestaShopSearchResultsPage shearchResult;
    private PrestaShopProductPage productPage;
    private PrestaShopShoppingCart shoppingCart;
    //proba
    private PrestaShopProductPageProbadodatek productPageProba;

    @Test
    public void buyHummingbirdSweaterWithScreeShot() throws IOException {
        mainPage.clickSingIn();
        logInPage.inputEmailAndPassword("vmllkmjbjfueezfaez@mrvpt.com", "Warsztaty");
        logInPage.singInClick2();
        yourAccountPage.goToAddresses();
        yourAddressesPage.newAddressButton();
        addNewAddres.country("United");
        addNewAddres.addAlias("Nowy");
        addNewAddres.addAddress("Moja 19m3");
        addNewAddres.addCity("Krakov");
        addNewAddres.addPostcode("30-551");
        addNewAddres.addPhone("888-888-888");
        addNewAddres.saveClick();
        yourAddressesPage.searchThing("Hummingbird Printed Sweater");
        shearchResult.chooseSweater();
        productPage.chooseSize("m");
        productPage.chooseQuantity("5");
        //proba
        productPageProba.isItDiscount();
        //proba
        productPage.clickAddToCartButton();
        productPage.clickProceedToCheackoutButton();
        shoppingCart.cickProceedToCheackoutButton2();
        shoppingCart.clickContunueButton();
        shoppingCart.clickContinueButton2();
        shoppingCart.clickPaymentOption();
        shoppingCart.clickAgreeCheackbox();
        shoppingCart.clickOrderButton();
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File tmpScreenshot = screenshot.getScreenshotAs(OutputType.FILE);
        String currentDateTime = LocalDateTime.now().toString().replaceAll(":", "_");
        Files.copy(tmpScreenshot.toPath(), Paths.get("C:", "test-evidence", "buying-success-evidence-"+currentDateTime+".png"));
    }

    @Before
    public void beforeEach() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        driver.get("https://mystore-testlab.coderslab.pl");
        mainPage = new PrestaShopMainPage(driver);
        logInPage = new PrestaShopLogInPage(driver);
        yourAccountPage = new PrestaShopYourAccount(driver);
        yourAddressesPage = new PrestaShopYourAddressesPage(driver);
        addNewAddres = new PrestaShopAddNewAddres(driver);
        shearchResult = new PrestaShopSearchResultsPage(driver);
        productPage = new PrestaShopProductPage(driver);
        shoppingCart = new PrestaShopShoppingCart(driver);
        //proba
        productPageProba = new PrestaShopProductPageProbadodatek(driver);
    }

    @After
    public void afterEach() {
        driver.quit();
    }
}


