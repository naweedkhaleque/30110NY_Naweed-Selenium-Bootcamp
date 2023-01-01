package page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

import java.util.List;

public class SearchResultsPage extends SharedStepsUI {

    @FindBy(xpath = "//h1//span[@class='BOLD'][2]")
    public WebElement searchResultText;

    @FindBy(xpath = "//div[@class='fake-tabs srp-format-tabs srp-controls__control']//ul//li[4]//a")
    public WebElement buyItNowTab;

    @FindBy(xpath = "//div[@class='srp-controls__resize-display']//span[1]/button")
    public WebElement conditionDropdown;

    @FindBy(xpath = "//div[@class='srp-controls__resize-display']//span[1]//span[@class='filter-menu-button__menu']//div[@role='menuitemcheckbox']")
    public List<WebElement> conditions;

    @FindBy(xpath = "//div[@id='srp-river-results']//ul//li[@class='s-item s-item__pl-on-bottom' or @class='s-item s-item__pl-on-bottom s-item__before-answer']//div[@class='s-item__info clearfix']/a")
    public List<WebElement> products;

    public SearchResultsPage() {
        PageFactory.initElements(driver, this);
    }

    public String getResultsText() {
        return getTrimmedElementText(searchResultText);
    }

    public void clickOnBuyItNowTab() {
        safeClickOnElement(buyItNowTab);
    }

    public void clickOnConditionDropdown() {
        safeClickOnElement(conditionDropdown);
    }

    public ItemPage selectProduct(List<WebElement> elements, int optionIndex) {
        try {
            safeClickOnElement(elements.get(optionIndex));
        } catch (IndexOutOfBoundsException e) {
            safeClickOnElement(elements.get(elements.size() - 1));
        }

        return new ItemPage();
    }
}
