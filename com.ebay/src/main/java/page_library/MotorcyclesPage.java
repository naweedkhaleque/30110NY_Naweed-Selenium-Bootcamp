package page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class MotorcyclesPage extends SharedStepsUI {

    @FindBy(name = "Make")
    public WebElement allMakesDropdown;

    @FindBy(name = "Model")
    public WebElement allModelsDropdown;

    @FindBy(name = "LH_ItemCondition")
    public WebElement conditionDropdown;

    @FindBy(xpath = "//button[text() = 'Find Vehicle']")
    public WebElement findAVehicleButton;

    public void clickOnAllMakesDropdown() {
        safeClickOnElement(allMakesDropdown);
    }

    public void clickOnAllModelsDropdown() {
        safeClickOnElement(allModelsDropdown);
    }

    public void clickOnConditionDropdown() {
        safeClickOnElement(conditionDropdown);
    }

    public SearchResultsPage clickOnFindAVehicleButton() {
        safeClickOnElement(findAVehicleButton);

        return new SearchResultsPage();
    }

    public MotorcyclesPage() {
        PageFactory.initElements(driver, this);
    }
}
