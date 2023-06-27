package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Project5Page;
import utils.Driver;

import java.util.List;

public class Project5Steps {

    WebDriver driver;
    Project5Page project5Page;

    @Before
    public void setDriver() {
        driver = Driver.getDriver();
        project5Page = new Project5Page();
    }

    //TASK 1

    @Then("the user should see the “Pagination” heading")
    public void theUserShouldSeeThePaginationHeading() {
        Assert.assertTrue(project5Page.paginationHeading.isDisplayed());
    }

    @And("the user should see the “World City Populations 2022” heading")
    public void theUserShouldSeeWorldCityPopulationHeading() {
        Assert.assertTrue(project5Page.subHeading.isDisplayed());
    }

    @And("the user should see the “What are the most populated cities in the world? Here is a list of the top five most populated cities in the world:” paragraph")
    public void theUserShouldSeeTheContentParagraph() {
        Assert.assertTrue(project5Page.content.isDisplayed());
    }

    // TASK 2

    @Then("the user should see the “Previous” button is disabled")
    public void theUserShouldSeePreviousButtonDisplayed() {
        Assert.assertTrue(project5Page.previousButton.isDisplayed());
    }

    @And("the user should see the “Next” button is enabled")
    public void theUserShouldSeeNextButtonIsEnabled() {
        Assert.assertTrue(project5Page.nextButton.isEnabled());
    }

    @When("the user clicks on the “Next” button")
    public void theUserClicksOnNextButton() {
        project5Page.nextButton.click();
    }

    @Then("the user should see the “Previous” button is enabled")
    public void theUserShouldSeePreviousButtonIsEnabled() {
        Assert.assertTrue(project5Page.previousButton.isEnabled());
    }

    @When("the user clicks on the “Next” button till it becomes disabled")
    public void theUserClicksNextUntilItIsDisabled() {
        if (project5Page.nextButton.isEnabled()) project5Page.nextButton.click();
    }

    @And("the user should see the “Next” button is disabled")
    public void theUserShouldSeeNextButtonIsDisplayed() {
        Assert.assertTrue(project5Page.nextButton.isDisplayed());
    }

    //Task 3

    @Then("the user should see “<City>” City with the info below and an image")
    public void userShouldSeeCityWithOtherInfoAndImage(DataTable dataTable) {
        List<String> expectedCities = dataTable.asList();
        for (String expectedCity : expectedCities) {
            Assert.assertEquals(expectedCity, project5Page.cityInfo.getText());
        }

    }

    @Then("the user should see “<City>” City with the info below and an image")
    public void theUserShouldSeeCityCityWithTheInfoBelowAndAnImage(DataTable dataTable) {
        List<String> expectedCities = dataTable.asList();
        for (String expectedCity : expectedCities) {
            Assert.assertEquals(expectedCity, project5Page.cityInfo.getText());

            List<String> expectedCountries = dataTable.asList();
            for (String expectedCountry : expectedCountries) {
                Assert.assertEquals(expectedCountry, project5Page.countryInfo.getText());
            }

            List<String> expectedPopulation = dataTable.asList();
            for (String expectedPop : expectedPopulation) {
                Assert.assertEquals(expectedPop, project5Page.populationInfo.getText());
            }


        }
    }
}
