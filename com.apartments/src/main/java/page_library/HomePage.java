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

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void inputSearchIntoSearchBox(String searchTerm) {
        sendKeysToElement(searchBox, searchTerm);
    }

    public void clickOnSearchButton() {
        safeClickOnElement(searchButton);
    }

    public SearchResultsPage doSearch(String searchTerm) {
        inputSearchIntoSearchBox(searchTerm);
        clickOnSearchButton();

        return new SearchResultsPage();
    }
}
