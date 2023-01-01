package data_providers;

import base.BasePage;
import org.testng.annotations.DataProvider;

public class DataProviders extends BasePage {

    @DataProvider(name = "SearchDP")
    public Object[][] getSearchTerm() {
        return excel.readStringArrays("Searching");
    }

}
