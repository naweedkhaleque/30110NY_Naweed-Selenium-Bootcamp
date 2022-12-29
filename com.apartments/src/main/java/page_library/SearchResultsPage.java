package page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultsPage extends BasePage {

    @FindBy(id = "rentRangeLink")
    public WebElement priceDropdown;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minRentOptions js-minRentOptions active']//li[1]")
    public WebElement noMinPriceOption;

    @FindBy(xpath = "//ul[@id='maxRentOptions']/li[5]")
    public WebElement maxPriceOption;

    @FindBy(id = "bedRangeLink")
    public WebElement numOfBedsDropdown;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minBedOptions active']//li[1]")
    public WebElement noMinBedsOption;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='maxBedOptions active']//li[4]")
    public WebElement maxTwoBeds;

    @FindBy(id = "typeSelect")
    public WebElement typeDropdown;

    @FindBy(xpath = "//div[@class='drop-down-container mortar-wrapper active']//div[@data-value='1']/a")
    public WebElement typeOptionApartments;

    @FindBy(id = "lifestyleControl")
    public WebElement lifestyleDropdown;

    @FindBy(xpath = "//*[@id='lifestyleControl']/fieldset/span/span[1]/a")
    public WebElement lifestyleOptionStudent;

    @FindBy(id = "moveInLink")
    public WebElement moveInDateDropdown;

    @FindBy(xpath = "//div[@id='datepickerSearch']/div/div[1]/table/thead/tr[1]/th[2]")
    public WebElement nextMonthButton;

    @FindBy(xpath = "//div[@id='datepickerSearch']/div/div[1]/table/tbody/tr[2]/td[2]")
    public WebElement moveInDateSelection;

    @FindBy(id = "advancedFiltersIcon")
    public WebElement moreDropdown;

    @FindBy(id = "_baths")
    public WebElement anyBathsOption;

    @FindBy(id = "Specialties_128")
    public WebElement cheapAffordability;

    @FindBy(id = "Specialties_64")
    public WebElement luxuryAffordability;

    @FindBy(id = "Rating_16")
    public WebElement fiveStarRatings;

    @FindBy(xpath = "//*[@id='advancedFilters']/section/button[2]")
    public WebElement doneButton;

    @FindBy(xpath = "//*[@id='advancedFilters']/section/button[1]")
    public WebElement saveButton;

    @FindBy(xpath = "//div[@id='placardContainer']/ul/li[1]/article/header/div[3]/a")
    public WebElement favoritesButton1;

    @FindBy(xpath = "//div[@id='placardContainer']/ul/li[2]/article/header/div[3]/a")
    public WebElement favoritesButton2;

    @FindBy(xpath = "//div[@id='notificationsFavorites']/i[1]")
    public WebElement seeFavoritesButton;

    @FindBy(id = "backToSearch")
    public WebElement backToSearchButton;

    @FindBy(xpath = "//div[@id='noFavoritesYetModal']/div/div/h3")
    public WebElement noFavoritesModalText;

    @FindBy(xpath = "//*[@id='placardContainer']/ul/li[2]/article/header/div[1]/a")
    public WebElement propertyTitle;

    @FindBy(id = "notificationsFavoritesCount")
    public WebElement favoritesCountHeader;

    @FindBy(id = "sortSearchIcon")
    public WebElement sortButton;

    @FindBy(xpath = "//*[@id='searchResultSortMenu']/ul/li[3]")
    public WebElement rentSortOption;

    @FindBy(xpath = "//*[@id='placardContainer']/ul/li[1]/article/section/div/div[2]/div/div/a")
    public WebElement expensiveQueensProperty;

    @FindBy(xpath = "//*[@id='placardContainer']/ul/li[3]/article/header/div[1]/a")
    public WebElement brooklynProperty;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnPriceDropdown() {
        safeClickOnElement(priceDropdown);
    }

    public String getPriceDropdownText() {
        return getTrimmedElementText(priceDropdown);
    }

    public void clickOnSelectors(WebElement element) {
        safeClickOnElement(element);
    }

    public void clickOnSelectorOptions(WebElement element) {
        safeClickOnElement(element);
    }

    public void navigateToDate(WebElement element) {
        safeClickOnElement(element);
    }

    public void clickOnDoneButton() {
        safeClickOnElement(doneButton);
    }

    public void clickOnSaveButton() {
        safeClickOnElement(saveButton);
    }

    public String getPropertyTitleText() {
        return getTrimmedElementText(propertyTitle);
    }

    public void clickToAddFavorites(WebElement element) {
        safeClickOnElement(element);
    }

    public void clickOnFavoritesCountButton() {
        safeClickOnElement(favoritesCountHeader);
    }

    public String getCountOfFavoritesText() {
        return getTrimmedElementText(favoritesCountHeader);
    }

    public void clickToSeeFavorites() {
        safeClickOnElement(seeFavoritesButton);
    }

    public String getNoFavoritesYetModalText() {
        return getTrimmedElementText(noFavoritesModalText);
    }

    public void clickOnSortButton() {
        safeClickOnElement(sortButton);
    }

    public void clickOnRentSortOption() {
        safeClickOnElement(rentSortOption);
    }

    public PropertyPage clickOnBrooklynProperty() {
        jsScrollElementIntoView(brooklynProperty);
        safeClickOnElement(brooklynProperty);

        return new PropertyPage();
    }

    public PropertyPage clickOnProperty() {
        clickOnSortButton();
        clickOnRentSortOption();
        jsScrollElementIntoView(expensiveQueensProperty);
        safeClickOnElement(expensiveQueensProperty);

        return new PropertyPage();
    }

    public void checkAddTwoFavorites() {
        clickToAddFavorites(favoritesButton1);
        clickToAddFavorites(favoritesButton2);
        jsScrollElementIntoView(favoritesCountHeader);
        clickOnFavoritesCountButton();
    }

    public void removeFavorites() {
        clickToAddFavorites(favoritesButton1);
        clickToAddFavorites(favoritesButton2);
        jsScrollElementIntoView(favoritesCountHeader);
        clickOnFavoritesCountButton();
        safeClickOnElement(favoritesButton1);
        safeClickOnElement(favoritesButton2);
    }

    public void doNarrowSearch() {
        clickOnSelectors(priceDropdown);
        clickOnSelectorOptions(noMinPriceOption);
        clickOnSelectorOptions(maxPriceOption);
        clickOnSelectors(typeDropdown);
        clickOnSelectorOptions(typeOptionApartments);
        clickOnSelectors(lifestyleDropdown);
        clickOnSelectorOptions(lifestyleOptionStudent);
        clickOnSelectors(moveInDateDropdown);
        navigateToDate(nextMonthButton);
        navigateToDate(nextMonthButton);
        clickOnSelectorOptions(moveInDateSelection);
        clickOnSelectors(moreDropdown);
        clickOnSelectorOptions(anyBathsOption);
        jsScrollElementIntoView(luxuryAffordability);
        clickOnSelectorOptions(luxuryAffordability);
        clickOnSelectorOptions(fiveStarRatings);
        clickOnDoneButton();
    }

    public void doCustomSearchForRental() {
        clickOnSelectors(typeDropdown);
        clickOnSelectorOptions(typeOptionApartments);
        clickOnSelectors(lifestyleDropdown);
        clickOnSelectorOptions(lifestyleOptionStudent);
        clickOnSelectors(moveInDateDropdown);
        navigateToDate(nextMonthButton);
        navigateToDate(nextMonthButton);
        clickOnSelectorOptions(moveInDateSelection);
        clickOnSelectors(moreDropdown);
        clickOnSelectorOptions(anyBathsOption);
        jsScrollElementIntoView(luxuryAffordability);
        clickOnSelectorOptions(luxuryAffordability);
        clickOnSelectorOptions(fiveStarRatings);
        clickOnDoneButton();
    }

}
