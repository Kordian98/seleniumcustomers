package pom;

import common.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersPage {

    public WebDriver driver = Hooks.driver;

    @FindBy(id = "search-input")
    public WebElement searchInput;

    @FindBy(id = "search-column")
    public WebElement searchColumnSelect;

    @FindBy(id = "match-case")
    public WebElement matchCaseCheckbox;

    @FindBy(tagName = "tbody")
    public WebElement customersTable;

    public CustomersPage() {
        PageFactory.initElements(driver, this);
    }
}
