package page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class FurniturePage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[1]/div[2]/a[1]")
    public WebElement sofasCategory;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[1]/a")
    public WebElement sofasType;

    public FurniturePage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnSofasCategory() {
        safeClickOnElement(sofasCategory);

    }

    public SearchResultsPage clickOnSofas() {
        safeClickOnElement(sofasType);

        return new SearchResultsPage();
    }
}
