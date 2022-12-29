package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testNetsName")
    public Object[][] getNetsName() {
        return excel.readStringArrays("Nets");
    }

    @DataProvider(name = "testMetsName")
    public Object[][] getMetsName() {
        return excel.readStringArrays("Mets");
    }

    @DataProvider(name = "testLakersSchedule")
    public Object[][] getLakersSchedule() {
        return excel.readStringArrays("LakersScheduleTitle");
    }

    @DataProvider(name = "testLewisStats")
    public Object[][] getLewisStats() {
        return excel.readStringArrays("LHRaceResults");
    }

    @DataProvider(name = "testLakersStats")
    public Object[][] getLakersStats() {
        return excel.readStringArrays("LakersSeasonValue");
    }

    @DataProvider(name = "testWorldCupSchedule")
    public Object[][] getWorldCupFixture() {
        return excel.readStringArrays("WorldCupDate");
    }


    @DataProvider(name = "testFightHistory")
    public Object[][] getFightHistory() {
        return excel.readStringArrays("IslamMakhachev");
    }

    @DataProvider(name = "testLeBronStats")
    public Object[][] getLebronStats() {
        return excel.readStringArrays("LebronJamesStats");
    }

    @DataProvider(name = "testP4pRankings")
    public Object[][] getMmaRankings() {
        return excel.readStringArrays("MMAP4P#1");
    }

    @DataProvider(name = "testWweChampionshipHistory")
    public Object[][] getWweChampionshipHistory() {
        return excel.readStringArrays("BrockLesnarWWETitleHistory");
    }

    @DataProvider(name = "testAddFavorites")
    public Object[][] getUnfollowText() {
        return excel.readStringArrays("UnfollowButtonText");
    }

    @DataProvider (name = "testNhlScores")
    public Object[][] getDateForNhlScores() {
        return excel.readStringArrays("NHLScoresText");
    }
}
