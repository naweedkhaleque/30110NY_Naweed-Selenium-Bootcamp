package page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class CellPhonesAndSmartphonesPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[1]-0-1[0]-0-12-list']/li[1]/a")
    public WebElement appleBrand;

    @FindBy(xpath = "//*[@id='mainContent']/section[1]/div[2]/a[3]")
    public WebElement iPhoneModel;

    public CellPhonesAndSmartphonesPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnAppleBrand() {
        jsScrollElementIntoView(appleBrand);
        safeClickOnElement(appleBrand);
    }

    public SearchResultsPage clickOnIphoneModel() {
        jsScrollElementIntoView(iPhoneModel);
        safeClickOnElement(iPhoneModel);

        return new SearchResultsPage();
    }

}
