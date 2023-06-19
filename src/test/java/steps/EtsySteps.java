package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.EtsyPage;
import utils.Driver;

import java.util.List;

public class EtsySteps {
    WebDriver driver;
    EtsyPage etsyPage;

    @Before
    public void setPage(){
        driver = Driver.getDriver();
        etsyPage = new EtsyPage();
    }


    @Then("user should see below menu item links")
    public void userShouldSeeBelowMenuItemLinks(DataTable dataTable) {
        List<String> expected = dataTable.asList();

        for (int i = 0; i < expected.size(); i++) {
            Assert.assertEquals(expected.get(i), etsyPage.mainHeaderLabels.get(i).getText());
        }
    }
}
