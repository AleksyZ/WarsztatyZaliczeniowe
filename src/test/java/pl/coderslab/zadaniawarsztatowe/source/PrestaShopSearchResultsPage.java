package pl.coderslab.zadaniawarsztatowe.source;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PrestaShopSearchResultsPage {
    @FindBy(xpath = "/html/body/main/section/div/div/section/section/div[3]/div/div[1]/article[1]/div/div[1]/h2/a")
    private WebElement sweater;

    public PrestaShopSearchResultsPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void chooseSweater(){
        sweater.click();
    }
}
