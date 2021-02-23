package stepDefinition;

import core.configuration.TestsConfig;
import cucumber.api.java.en.Given;
import org.junit.Assert;
import pages.Page;

import java.awt.*;

public class SignUp extends Page {
    public SignUp() throws AWTException {}

    @Given("^\\[SignUp] User signs up$")
    public void signup_User_signs_up() throws Exception {
        getPageHome().getSignUpLink().click();
        getPageSignUp().signUp();
        Assert.assertTrue(getPageHome().getDropDownText().getText().equals(TestsConfig.getConfig().getEmail()));
        Assert.assertTrue(getPageHome().getH1().isDisplayed());
        Assert.assertTrue(getPageHome().getH1().getText().equals("Hackathon Starter"));
    }
}
