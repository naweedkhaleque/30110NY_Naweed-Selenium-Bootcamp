package system.scores;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.HomePage;
import page_library.SportsPage;

public class TestScores extends BasePage {
    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testNhlScores")
    public void testNhlScores(String expected) {
        HomePage homePage = new HomePage();
        SportsPage sportsLeaguePage = homePage.systemBar.clickOnNhlScoresButton();
        sportsLeaguePage.getNhlScores();

        Assert.assertEquals(sportsLeaguePage.getNhlScoresDateHeadingText(), expected);
    }
}
