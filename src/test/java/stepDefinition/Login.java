package stepDefinition;

import core.configuration.TestsConfig;
import core.general.WebDriverWaits;
import core.general.WebDriverFactory;
import core.configuration.ConfigProperties;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import pages.Page;

import java.awt.*;
import java.io.IOException;

public class Login extends Page {

    public Login() throws AWTException {}

    @Given("^\\[Login] User logins to application$")
    public void login_User_logins_to_application() throws Exception {
        getPageHome().getLoginLink().click();
        getPageLogin().login();
        Assert.assertTrue(getPageHome().getDropDownText().getText().contains("Maaz"));
        Assert.assertTrue(getPageHome().getH1().isDisplayed());
        Assert.assertTrue(getPageHome().getH1().getText().equals("Hackathon Starter"));
    }


}