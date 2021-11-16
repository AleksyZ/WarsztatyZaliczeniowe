//import org.junit.Before;
//import org.junit.Test;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class ZadanieWarsztatowe {
//    private WebDriver driver;
//    private PrestaShopMainPage mainPage;
//    private PrestaShopLogInPage logInPage;
//    private PrestaShopYourAccount yourAccountPage;
//    private PrestaShopYourAddressesPage yourAddressesPage;
//    private PrestaShopAddNewAddres addNewAddres;
//
//    @Test
//    public void shouldClickSingInButton() {
//        mainPage.clickSingIn();
//        logInPage.inputEmailAndPassword("vmllkmjbjfueezfaez@mrvpt.com", "Warsztaty");
//        logInPage.singInClick2();
//        yourAccountPage.goToAddresses();
//        yourAddressesPage.newAddressButton();
//        addNewAddres.addAlias("Nowe");
//        addNewAddres.addAddress("Limanowskiego 19/3");
//        addNewAddres.addCity("Krakov");
//        addNewAddres.addPostcode("30-551");
//        addNewAddres.country("United Kingdom");
//        addNewAddres.addPhone("888-888-888");
//        addNewAddres.saveClick();
//    }
//
//    @Before
//    public void beforeEach() {
//        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//        driver.get("https://mystore-testlab.coderslab.pl");
//        mainPage = new PrestaShopMainPage(driver);
//        logInPage = new PrestaShopLogInPage(driver);
//        yourAccountPage = new PrestaShopYourAccount(driver);
//        yourAddressesPage = new PrestaShopYourAddressesPage(driver);
//        addNewAddres = new PrestaShopAddNewAddres(driver);
//    }
//}
