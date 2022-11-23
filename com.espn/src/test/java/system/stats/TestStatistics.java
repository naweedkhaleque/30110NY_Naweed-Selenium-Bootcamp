package system.stats;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import page_library.AthletesPage;
import page_library.HomePage;
import page_library.SportsPage;
import page_library.TeamPage;

public class TestStatistics extends BasePage {

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLewisStats")
    public void testViewLewisStats(String expected) {
        HomePage homePage = new HomePage();
        homePage.systemBar.clickOnF1();
        SportsPage sportsLeaguePage = new SportsPage();
        sportsLeaguePage.clickOnDriversButton();
        AthletesPage athletePage = sportsLeaguePage.clickOnLewisHamilton();
        athletePage.clickOnRaceResultsTab();

        Assert.assertEquals(athletePage.getResultsTitleText(), expected);
    }

    @Test(dataProviderClass = data_providers.DataProviders.class, dataProvider = "testLakersStats")
    public void testViewLakersStats(String expectedValue, String expectedName) {
        HomePage homePage = new HomePage();
        homePage.systemBar.navigateToNetsPage();
        TeamPage teamPage = new TeamPage();
        teamPage.clickOnLakersStatsButton();
        teamPage.clickOnSeasonDropdown();
        teamPage.selectSeason(expectedValue);
        AthletesPage athletePage = teamPage.clickOnKobeBryantLink();

        Assert.assertEquals(athletePage.getKobeText(),expectedName);


    }
}
