package utilities;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.model.environment.EnvironmentSpecificConfiguration;
import net.thucydides.model.environment.SystemEnvironmentVariables;
import net.thucydides.model.util.EnvironmentVariables;

public class BaseTest extends PageObject {
    private static final EnvironmentVariables env = SystemEnvironmentVariables.createEnvironmentVariables();
    private static final String BASE_URL = EnvironmentSpecificConfiguration.from(env).getProperty("webdriver.base.url");

    public static String getBaseUrl() {
        return BASE_URL;
    }

    /**
     * Will be executed after each Scenario.
     */
    @After("not @ApiTesting")
    public void closeBrowser() {
       getDriver().quit();
    }
}
