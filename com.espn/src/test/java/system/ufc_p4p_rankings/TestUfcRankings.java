package system.ufc_p4p_rankings;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.SportsPage;

public class TestUfcRankings extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testP4pRankings")
    public void testMmaRankings(String expected) {
        HomePage homePage = new HomePage();

        SportsPage sportsLeaguePage = homePage.systemBar.clickOnMmaButton();

        sportsLeaguePage.clickP4pTab();

        Assert.assertEquals(sportsLeaguePage.getNumberOneFighterText(), expected);

    }
}
