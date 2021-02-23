package stepDefinition;

import core.configuration.TestsConfig;
import core.general.WebDriverWaits;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.Page;

import java.awt.*;

public class Home extends Page {

    public Home() throws AWTException {}

    public static String email = TestsConfig.getConfig().getEmail();


    @Then("^\\[Home] Verify account is deleted$")
    public void home_Verify_account_is_deleted() throws Exception {
        getPageHome().getLoginLink().click();
        getPageLogin().login();

        Assert.assertTrue(getPageAccount().getAlertDanger().isDisplayed());
        Assert.assertTrue(getPageAccount().getAlertSuccess().getText().contains("Email " + email + " not found."));
        getPageAccount().getAlertClose().click();
    }

    @When("^\\[Home] User logouts from application$")
    public void home_User_logouts_from_application() throws Exception {
        getPageHome().getDropDownToggle().click();
        WebDriverWaits.waitUntilElementIsDisplayed(getPageHome().getDropDownMenu());
        getPageHome().getDropDownItem("logout").click();
    }

    @Then("^\\[Home] Verify user is logged out from application$")
    public void home_Verify_user_is_logged_out_from_application() throws Exception {
        Assert.assertTrue(getPageHome().getH1().isDisplayed());
        Assert.assertTrue(getPageHome().getH1().getText().equals("Hackathon Starter"));
        Assert.assertTrue(getPageHome().getLoginLink().isDisplayed());
        Assert.assertTrue(getPageHome().getSignUpLink().isDisplayed());
    }
}
