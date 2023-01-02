package page_library;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import shared.SharedStepsUI;

public class MensShirtsPage extends SharedStepsUI {

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-0-12-list']/li[1]/a")
    public WebElement tShirtsCategory;

    @FindBy(xpath = "//*[@id='s0-28_1-9-0-1[0]-0-1[0]-0-12-list']/li[1]/a")
    public WebElement nikeBrand;

    public MensShirtsPage() {
        PageFactory.initElements(driver, this);
    }

    public void clickOnTShirts() {
        safeClickOnElement(tShirtsCategory);
    }

    public SearchResultsPage clickOnNike() {
        safeClickOnElement(nikeBrand);

        return new SearchResultsPage();
    }


}
