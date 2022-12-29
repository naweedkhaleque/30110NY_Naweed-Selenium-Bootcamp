package page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

    @FindBy(id = "quickSearchLookup")
    public WebElement searchBox;

    @FindBy(className = "go")
    public WebElement searchButton;

    @FindBy(id = "headerMenuLabel")
    public WebElement menuButton;

    @FindBy(xpath = "//ul[@id='menuNavigation']/li[1]/a")
    public WebElement renterTools;

    @FindBy(xpath = "//ul[@id='menuNavigation']/li[1]/ul/li[3]/a")
    public WebElement rentalCalculator;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void inputSearchIntoSearchBox(String searchTerm) {
        sendKeysToElement(searchBox, searchTerm);
    }

    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    public void clickOnMenuButton() {
        safeClickOnElement(menuButton);
    }

    public void clickOnRenterToolsButton() {
        safeClickOnElement(renterTools);
    }

    public RentCalculatorPage clickOnRentalCalculator() {
        safeClickOnElement(rentalCalculator);

        return new RentCalculatorPage();
    }

    public SearchResultsPage doSearch(String searchTerm) {
        inputSearchIntoSearchBox(searchTerm);
        clickOnSearchButton();

        return new SearchResultsPage();
    }

    public RentCalculatorPage navigateToRentCalculatorPage() {
        clickOnMenuButton();
        clickOnRenterToolsButton();
        clickOnRentalCalculator();

        return new RentCalculatorPage();
    }
}
