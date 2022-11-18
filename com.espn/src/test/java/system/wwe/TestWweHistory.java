package system.wwe;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.SportsPage;

public class TestWweHistory extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testWweChampionshipHistory")
    public void testWweChampionshipHistory(String expected) {
        HomePage homePage = new HomePage();
        SportsPage sportsPage = homePage.systemBar.clickOnWweButton();
        sportsPage.clickOnWweTitleHistory();
        sportsPage.clickOnWweTitleHistoryArticle();
        Assert.assertEquals(sportsPage.getBrockLesnarText(), expected);
    }
}
