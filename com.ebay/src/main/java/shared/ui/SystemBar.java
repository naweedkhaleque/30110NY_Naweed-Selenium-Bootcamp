package shared.ui;

import base.BasePage;
import page_library.SearchResultsPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SystemBar extends BasePage {

    @FindBy(xpath = "//div[@id='gh-top']//ul[@id='gh-topl']//li[@id='gh-eb-u']//a[contains(text(), 'Sign in')]")
    public WebElement signInButton;

    @FindBy(id = "gh-ug")
    public WebElement accountDropdown;

    @FindBy(xpath = "//a[contains(text(), 'Account settings')]")
    public WebElement accountSettingsButton;

    @FindBy(xpath = "//a[contains(text(), 'Daily Deals')]")
    public WebElement dailyDealsButton;

    @FindBy(xpath = "//a[contains(text(), ' Brand Outlet')]")
    public WebElement brandOutletButton;

    @FindBy(xpath = "//div[@id='gh-top']//ul[@id='gh-topl']//li[@id='gh-p-3']/a[contains(text(), ' Help & Contact')]")
    public WebElement helpAndContactButton;

    @FindBy(xpath = "//div[@id='gh-top']//ul[@id='gh-eb']//li[@id='gh-p-2']/a[contains(text(), ' Sell')]")
    public WebElement sellButton;

    @FindBy(xpath = "//div[@id='gh-top']//ul[@id='gh-eb']//li[@id='gh-wl-click']//a[@class='gh-eb-li-a gh-rvi-menu watchlist-menu']")
    public WebElement watchlistDropdown;

    @FindBy(xpath = "//div[@id='gh-top']//ul[@id='gh-eb']//li[@id='gh-eb-My']//a[@class='gh-eb-li-a gh-rvi-menu']")
    public WebElement myEbayDropdown;

    @FindBy(xpath = "//div[@id='gh-top']//ul[@id='gh-eb']//li[@id='gh-eb-My']//ul[@id='gh-ul-nav']//a")
    public List<WebElement> myEbayOptions;

    @FindBy(id = "gh-ac")
    public WebElement searchBox;

    @FindBy(id = "gh-cat")
    public WebElement categoryDropdown;

    @FindBy(xpath = "//td[@id='gh-cat-td']/div/select//option")
    public List<WebElement> categories;

    @FindBy(id = "gh-btn")
    public WebElement searchButton;

    public SystemBar() {
        PageFactory.initElements(driver, this);
    }

    public void inputSearch(String searchTerm) {
        sendKeysToElement(searchBox, searchTerm);
    }

    public SearchResultsPage clickOnSearchButton() {
        safeClickOnElement(searchButton);

        return new SearchResultsPage();
    }

    public SearchResultsPage doSearch(String searchTerm, WebElement element, String value) {
        inputSearch(searchTerm);
        safeClickOnElement(categoryDropdown);
        selectFromDropdownByValue(element, value);
        clickOnSearchButton();

        return new SearchResultsPage();
    }
}
