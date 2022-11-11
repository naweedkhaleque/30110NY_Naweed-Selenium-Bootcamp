package page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchResultsPage extends BasePage {
    @FindBy(id = "rentRangeLink")
    public WebElement priceDropdown;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minRentOptions js-minRentOptions active']//li")
    public List<WebElement> priceOptions;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minRentOptions js-minRentOptions active']//li[1]")
    public WebElement noMinPriceOption;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minBedOptions active']//li[1]")
    public WebElement noMinBedsOption;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='maxBedOptions active']//li[4]")
    public WebElement maxTwoBeds;

    @FindBy(xpath = "//div[@class='drop-down-container mortar-wrapper active']//div[@data-value='1']/a")
    public WebElement typeApartments;

    @FindBy(xpath = "//*[@id='lifestyleControl']/fieldset/span/span[1]/a")
    public WebElement lifestyleStudent;

    @FindBy(xpath = "//div[@id='datepickerSearch']/div/div[1]/table/thead/tr[1]/th[2]")
    public WebElement nextMonthButton;

    @FindBy(xpath = "//div[@id='datepickerSearch']/div/div[1]/table/tbody/tr[2]/td[2]")
    public WebElement moveInDateManhattan;

    @FindBy(id = "bedRangeLink")
    public WebElement numOfBedsDropdown;

    @FindBy(xpath = "//div[@class='dropdownContent mortar-wrapper']//ul[@class='minBedOptions active']//li")
    public List<WebElement> numOfBedsOptions;

    @FindBy(id = "typeSelect")
    public WebElement typeDropdown;

    @FindBy(xpath = "//div[@class='drop-down-container mortar-wrapper active']//div[@data-path]")
    public WebElement typeOptions;

    @FindBy(id = "lifestyleControl")
    public WebElement lifestyleDropdown;

    @FindBy(xpath = "//fieldset[@class='drop-down-container active']//span[@class='radioGroup']//span//input[@type='radio']")
    public WebElement lifestyleOptions;

    @FindBy(id = "moveInLink")
    public WebElement moveInDateDropdown;

    @FindBy(id = "advancedFiltersIcon")
    public WebElement moreDropdown;

    @FindBy(xpath = "//*[@id='advancedFilterUnitAmenities']/li[1]/a")
    public WebElement airConditioning;

    @FindBy(xpath = "//*[@id='advancedFilterUnitAmenities']/li[2]/a")
    public WebElement washerAndDryer;

    @FindBy(id = "Specialties_128")
    public WebElement cheapAffordability;

    @FindBy(xpath = "//*[@id='advancedFilters']/section/button[2]")
    public WebElement doneButton;

    @FindBy(xpath = "//*[@id='advancedFilters']/section/button[1]")
    public WebElement saveButton;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnPriceDropdown() {
        safeClickOnElement(priceDropdown);
    }

    public String getPriceDropdownText() {
        return getTrimmedElementText(priceDropdown);
    }
}
