package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.Project4Page;
import utils.Driver;

import java.util.List;

public class Project4Steps {
      /*
    Given the user is on https://techglobal-training.com/frontend/project-4
    Then the user should see the “Inventory” heading
    And the user should see the table with the headers below

    | Quantity | Product | Price $ | Total $ |
    And the user should see the table with the rows below

    | 1 | iPhone  | 1,000 | 1,000 |
    | 3 | Airpods | 100   | 300   |
    | 2 | iPad    | 500   | 1,000 |
    And the user should see the “ADD PRODUCT” button is enabled
    And the user should see the “Total = $2,300” text displayed
     */

    WebDriver driver;
    Project4Page project4Page;

    @Before
    public void setDriver(){
        driver = Driver.getDriver();
        project4Page = new Project4Page();

    }


    @Then("the user should see the “Inventory” heading")
    public void theUserShouldSeeTheInventoryHeading() {
        Assert.assertTrue(project4Page.inventoryHeading.isDisplayed());
    }

    @And("the user should see the table with the headers below")
    public void theUserShouldSeeTheTableWithTheHeadersBelow(DataTable dataTable) {
        List<String> expectedHeaders = dataTable.asList();
        for (int i = 0; i < expectedHeaders.size(); i++) {
            Assert.assertEquals(expectedHeaders.get(i), project4Page.dynamicTableAllHeaders.get(i).getText());

        }

    }

    @And("the user should see the table with the rows below")
    public void theUserShouldSeeTheTableWithTheRowsBelow(DataTable dataTable) {
        List<String> expectedRowsText = dataTable.asList();

        for (int i = 0; i < expectedRowsText.size(); i++) {
            Assert.assertEquals(expectedRowsText.get(i), project4Page.tableRows.get(i).getText());
        }

    }

    @And("the user should see the “ADD PRODUCT” button is enabled")
    public void theUserShouldSeeTheADDPRODUCTButtonIsEnabled() {
        Assert.assertTrue(project4Page.addProductButton.isEnabled());
    }

    @And("the user should see the “Total = ${string}” text displayed")
    public void theUserShouldSeeTheTotal$TextDisplayed() {
        Assert.assertTrue(project4Page.totalPriceAmount.isDisplayed());

    }

    @When("the user clicks on the “ADD PRODUCT” button")
    public void theUserClicksOnTheADDPRODUCTButton() {
        project4Page.addProductButton.click();
    }

    @Then("the user should see the “Add New Product” modal with its heading")
    public void theUserShouldSeeTheAddNewProductModalWithItsHeading() {
        Assert.assertTrue(project4Page.addNewProductModalTitleHeadiing.isDisplayed());
    }

    @And("the user should see the “X” button is enabled")
    public void theUserShouldSeeTheXButtonIsEnabled() {
        Assert.assertTrue(project4Page.xButton.isEnabled());
    }

    @And("the user should see the “Please select the quantity” label")
    public void theUserShouldSeeThePleaseSelectTheQuantityLabel() {
        Assert.assertTrue(project4Page.quantityInputLabel.isDisplayed());
    }

    @And("the user should see the “Quantity” input box is enabled")
    public void theUserShouldSeeTheQuantityInputBoxIsEnabled() {
        Assert.assertTrue(project4Page.quantityInput.isEnabled());

    }

    @And("the user should see the “Please enter the name of the product” label")
    public void theUserShouldSeeThePleaseEnterTheNameOfTheProductLabel() {
        Assert.assertTrue(project4Page.nameOfProductInputLabel.isDisplayed());

    }

    @And("the user should see the “Product” input box is enabled")
    public void theUserShouldSeeTheProductInputBoxIsEnabled() {
        Assert.assertTrue(project4Page.nameOfProductInput.isEnabled());

    }

    @And("the user should see the “Please enter the price of the product” label")
    public void theUserShouldSeeThePleaseEnterThePriceOfTheProductLabel() {
        Assert.assertTrue(project4Page.priceOfProductInputLabel.isDisplayed());

    }

    @And("the user should see the “Price” input box is enabled")
    public void theUserShouldSeeThePriceInputBoxIsEnabled() {
        Assert.assertTrue(project4Page.priceOfProductInput.isEnabled());

    }

    @And("the user should see the “SUBMIT” button is enabled")
    public void theUserShouldSeeTheSUBMITButtonIsEnabled() {
        Assert.assertTrue(project4Page.submitButton.isEnabled());

    }

    @When("the user clicks on the “X” button")
    public void theUserClicksOnTheXButton() {
        project4Page.xButton.click();
    }

    @Then("the user should not see the “Add New Product” modal")
    public void theUserShouldNotSeeTheAddNewProductModal() {
        Assert.assertFalse(project4Page.addNewProductModalTitleHeadiing.isDisplayed());
    }

    @And("the user enters the quantity as “{int}”")
    public void theUserEntersTheQuantityAs(int input) {
        project4Page.quantityInput.sendKeys("2");
    }

    @And("the user enters the product as “Mouse”")
    public void theUserEntersTheProductAsMouse() {
        project4Page.priceOfProductInput.sendKeys("Mouse");
    }

    @And("the user enters the price as “{int}”")
    public void theUserEntersThePriceAs(int input) {
        project4Page.priceOfProductInput.sendKeys("100");
    }

    @And("the user clicks on the “SUBMIT” button")
    public void theUserClicksOnTheSUBMITButton() {
        project4Page.submitButton.click();
    }

    @Then("the user should see the table with the new row below")
    public void theUserShouldSeeTheTableWithTheNewRowBelow(DataTable dataTable) {

        List<String> expectedRow = dataTable.asList();
        for (int i = 0; i < expectedRow.size(); i++) {
            Assert.assertEquals(expectedRow.get(i), project4Page.tableRows.get(i).getText());

        }

    }


    @And("the user should see the “Total = ${double}” text displayed")
    public void theUserShouldSeeTheTotal$TextDisplayed2() {
        Assert.assertTrue(project4Page.totalPriceAmount.isDisplayed());

    }
}
