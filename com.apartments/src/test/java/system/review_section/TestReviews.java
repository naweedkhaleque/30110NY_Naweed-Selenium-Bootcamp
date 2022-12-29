package system.review_section;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.PropertyPage;
import page_library.SearchResultsPage;

public class TestReviews extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testReview")
    public void testWriteAReview(String searchTerm, String headline, String body, String buttonText) {
        HomePage homePage = new HomePage();
        SearchResultsPage searchResultsPage = homePage.doSearch(searchTerm);
        searchResultsPage.doNarrowSearch();
        PropertyPage propertyPage = searchResultsPage.clickOnProperty();
        propertyPage.getReviewModal();
        propertyPage.inputReview(headline, body);
        Assert.assertEquals(propertyPage.getSubmitReviewButtonText(), buttonText);
    }
}
