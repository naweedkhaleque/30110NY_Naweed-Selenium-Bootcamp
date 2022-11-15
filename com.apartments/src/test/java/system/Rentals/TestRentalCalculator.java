package system.Rentals;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.PropertyPage;
import page_library.RentCalculatorPage;
import page_library.SearchResultsPage;

public class TestRentalCalculator extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testRentCalculator")
    public void testFindRentals(String monthlyIncome, String incomePercentage, String location, String locationText) {
        HomePage homePage = new HomePage();
        RentCalculatorPage rentAffordabilityCalculatorPage = homePage.navigateToRentCalculatorPage();
        SearchResultsPage searchResultsPage = rentAffordabilityCalculatorPage.findAffordableRentals(monthlyIncome, Integer.parseInt(incomePercentage), location);
        searchResultsPage.doCustomSearchForRental();
        PropertyPage propertyPage = searchResultsPage.clickOnBrooklynProperty();

        Assert.assertEquals(propertyPage.getPropertyNameText(), locationText);
    }
}
