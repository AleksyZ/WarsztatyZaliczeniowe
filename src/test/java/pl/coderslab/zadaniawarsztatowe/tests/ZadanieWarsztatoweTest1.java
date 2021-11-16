package pl.coderslab.zadaniawarsztatowe.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/cucumber/features/prestashop-add-new-address.feature", plugin = {"pretty", "html:out.html"})

public class ZadanieWarsztatoweTest1 {
}
