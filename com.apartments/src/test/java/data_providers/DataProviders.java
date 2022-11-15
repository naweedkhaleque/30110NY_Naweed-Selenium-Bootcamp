package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "testSimpleSearch")
    public Object[][] getSimpleSearchTerm() {
        return excel.readStringArrays("SimpleSearch");
    }

    @DataProvider(name = "testCustomizedSearch")
    public Object[][] getSecondSearchTerm() {
        return excel.readStringArrays("SecondSearchTerm");
    }

    @DataProvider(name = "testAddFavorites")
    public Object[][] getFavorites() {
        return excel.readStringArrays("NumberOfFavorites");
    }

    @DataProvider(name = "testRemoveFavorites")
    public Object[][] getOneFavorite() {
        return excel.readStringArrays("RemoveFavorites");
    }

    @DataProvider(name = "testReview")
    public Object[][] getReview() {
        return excel.readStringArrays("WriteAReview");
    }

    @DataProvider(name = "testRentCalculatorDP")
    public Object[][] getRentalInformation() {
        return excel.readStringArrays("RentCalculator");
    }

}
