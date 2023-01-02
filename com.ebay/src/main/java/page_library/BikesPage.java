package page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class BikesPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='mainContent']/section[1]/div[2]/a[3]")
    public WebElement cannondaleBikes;

    public BikesPage() {
        PageFactory.initElements(driver, this);
    }

    public SearchResultsPage clickOnCannondaleBikes() {
        safeClickOnElement(cannondaleBikes);

        return new SearchResultsPage();
    }
}
