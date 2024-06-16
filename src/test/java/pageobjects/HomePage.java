package pageobjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utilities.BaseTest;
import utilities.WebElementUtils;

import static constants.SearchProductContants.SELECTOR_INPUT_SEARCH;

public class HomePage extends WebElementUtils {
    private final String URL_HOME_PAGE = BaseTest.getBaseUrl();


    public void openUrl(){
        openUrl(URL_HOME_PAGE);
        waitFor(ExpectedConditions.urlToBe(URL_HOME_PAGE));
    }

    public void searchKeyword(String keyword) {
        waitFor(ExpectedConditions.visibilityOfElementLocated(SELECTOR_INPUT_SEARCH));
        typeInto(find(SELECTOR_INPUT_SEARCH), keyword + Keys.ENTER);

        waitFor(ExpectedConditions.urlContains("catalogsearch"));


    }
}