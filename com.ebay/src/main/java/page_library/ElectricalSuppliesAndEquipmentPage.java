package page_library;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ElectricalSuppliesAndEquipmentPage extends BasePage {

    @FindBy(xpath = "//*[@id='mainContent']/section[2]/div[2]/a[3]")
    public WebElement oscilloscopesCategory;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[1]-0-0-6-5-4[0]-flyout']/button")
    public WebElement oscilloscopeTypeDropdown;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[1]-0-0-6-5-4[0]-flyout']/div/ul/li[8]/a")
    public WebElement mixedSignalOption;

    public ElectricalSuppliesAndEquipmentPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnOscilloscopes() {
        safeClickOnElement(oscilloscopesCategory);
    }

    public void clickOnOscilloscopeTypeDropdown() {
        safeClickOnElement(oscilloscopeTypeDropdown);
    }

    public SearchResultsPage clickOnMixedSignalOption() {
        safeClickOnElement(mixedSignalOption);

        return new SearchResultsPage();
    }

}
