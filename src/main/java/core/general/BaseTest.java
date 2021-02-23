package core.general;

import core.configuration.ConfigProperties;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.awt.*;
import java.net.MalformedURLException;
import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

public class BaseTest {

    static ConfigProperties configProps = new ConfigProperties();

    @Before
    public void beforeTest() throws MalformedURLException, AWTException, SQLException {
        WebDriverFactory.startDriver();

        WebDriverFactory.getDriver().get(configProps.url);
        WebDriverFactory.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }

    @After
    public void afterTest(Scenario scenario) {
        System.out.println("Scenario :: " + scenario.getName() + " has finished with result :: " + scenario.getStatus() + "\n");
        WebDriverFactory.finishDriver();
    }
}
