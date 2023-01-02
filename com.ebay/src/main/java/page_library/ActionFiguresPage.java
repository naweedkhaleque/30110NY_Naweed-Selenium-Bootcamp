package page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class ActionFiguresPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[2]-0-0-12-list']/li[1]/a")
    public WebElement mattelBrand;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[1]-0-0-6-5-4[6]-flyout']/button")
    public WebElement conditionDropdown;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[1]-0-0-6-5-4[6]-flyout']/div/ul/li[1]/a")
    public WebElement newConditionOption;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-6-5-4[5]-flyout']/button")
    public WebElement franchiseDropdown;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-6-5-4[5]-flyout']/div/ul/li[4]/a")
    public WebElement dcUniverseOption;

    public ActionFiguresPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnMattel() {
        safeClickOnElement(mattelBrand);
    }

    public void clickOnConditionDropdown() {
        safeClickOnElement(conditionDropdown);
    }

    public void clickOnNewCondition() {
        safeClickOnElement(newConditionOption);
    }

    public void clickOnFranchiseDropdown() {
        safeClickOnElement(franchiseDropdown);
    }

    public SearchResultsPage clickOnDcUniverse() {
        safeClickOnElement(dcUniverseOption);

        return new SearchResultsPage();
    }


}
