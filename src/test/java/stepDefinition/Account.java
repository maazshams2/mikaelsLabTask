package stepDefinition;

import core.configuration.TestsConfig;
import core.general.WebDriverWaits;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;

import java.awt.*;

public class Account extends Page {
    public Account() throws AWTException {}

    @When("^\\[Account] User navigates to My Account$")
    public void account_User_navigates_to_My_Accounts() throws Exception {
        getPageHome().getDropDownToggle().click();
        WebDriverWaits.waitUntilElementIsDisplayed(getPageHome().getDropDownMenu());
        getPageHome().getDropDownItem("account").click();
        Assert.assertTrue(getPageAccount().getHeading("Profile Information").isDisplayed());
    }

    @When("^\\[Account] User updates profile information$")
    public void account_User_updates_profile_information() throws Exception {
        getPageAccount().getName().sendKeys("Maaz");
        getPageAccount().getGender("male").click();
        getPageAccount().getLocation().sendKeys("Karachi, Pakistan");
        getPageAccount().getWebsite().sendKeys("http://localhost:300");
        getPageAccount().getUpdateProfile().click();
        Assert.assertTrue(getPageAccount().getAlertSuccess().isDisplayed());
        Assert.assertTrue(getPageAccount().getAlertSuccess().getText().contains("Profile information has been updated."));
        Assert.assertTrue(getPageHome().getDropDownText().getText().contains("Maaz"));
        getPageAccount().getAlertClose().click();
    }

    @When("^\\[Account] User updates password$")
    public void account_User_updates_password() throws Exception {
        getPageAccount().getPassword().sendKeys("admin321");
        getPageAccount().getConfirmPassword().sendKeys("admin321");
        getPageAccount().getUpdatePassword().click();
        Assert.assertTrue(getPageAccount().getAlertSuccess().isDisplayed());
        Assert.assertTrue(getPageAccount().getAlertSuccess().getText().contains("Password has been changed."));
        getPageAccount().getAlertClose().click();
    }

    @When("^\\[Account] User deletes newly created account$")
    public void account_User_deletes_newly_created_account() throws Exception {
        getPageAccount().getDeleteAccount().click();

        Assert.assertTrue(getPageAccount().getAlertInfo().isDisplayed());
        Assert.assertTrue(getPageAccount().getAlertInfo().getText().contains("Your account has been deleted."));
        getPageAccount().getAlertClose().click();

        Assert.assertTrue(getPageHome().getH1().isDisplayed());
        Assert.assertTrue(getPageHome().getH1().getText().equals("Hackathon Starter"));
        Assert.assertTrue(getPageHome().getLoginLink().isDisplayed());
        Assert.assertTrue(getPageHome().getSignUpLink().isDisplayed());
    }
}
