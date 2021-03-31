package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import pom.CustomersPage;

public class CustomersSteps extends CustomersPage {

    @Given("User on customers main page")
    public void userOnCustomersPage() {
        driver.get("REPLACE ME WITH LINK TO INDEX.HTML");
    }

    @When("User fills search input with {string}")
    public void userFillSearchInputWith(String value) {
        searchInput.clear();
        searchInput.sendKeys(value);
    }

    @And("User set search column select as {string}")
    public void userSetSearchColumnSelectAs(String value) {
        new Select(searchColumnSelect).selectByValue(value);
    }

    @When("User clicks on match case checkbox")
    public void userClickOnMatchCaseCheckbox() {
        matchCaseCheckbox.click();
    }

    @Then("{int} rows displayed")
    public void assertRowsNumber(int amount) {
        int actualRowsNumber = customersTable.findElements(By.tagName("tr")).size();
        Assert.assertEquals(String.format("We expected %s, but there is %s rows displayed", amount, actualRowsNumber),
                actualRowsNumber, amount);
    }
}
