package pages.e2e;

import core.general.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

import java.util.List;

public class PageAccount {
    public PageAccount(Page page){}

    private By byName = By.id("name");
    private By byMaleGender = By.id("option-male");
    private By byFemaleGender = By.id("option-female");
    private By byOtherGender = By.id("option-other");
    private By byLocation = By.id("location");
    private By byWebsite = By.id("website");

    private By byPassword = By.id("password");
    private By byConfirmPassword = By.id("confirmPassword");

    private By byUpdateProfileButton = By.className("fa-pencil");
    private By byUpdatePasswordButton = By.className("fa-lock");
    private By byDeleteAccountButton = By.className("fa-trash");

    private By byAlertSuccess = By.className("alert-success");
    private By byAlertDanger = By.className("alert-danger");
    private By byAlertInfo = By.className("alert-info");
    private By byAlertClose = By.className("close");

    private By byH3 = By.tagName("h3");

    public WebElement getHeading(String headingText){
        List<WebElement> headingList = WebDriverFactory.getDriver().findElements(byH3);

        for (WebElement heading : headingList) {
            if (heading.getText().contains(headingText))
                return heading;
        }

        return null;
    }

    public WebElement getName() {
        return WebDriverFactory.getDriver().findElement(byName);
    }

    public WebElement getLocation() {
        return WebDriverFactory.getDriver().findElement(byLocation);
    }

    public WebElement getWebsite() {
        return WebDriverFactory.getDriver().findElement(byWebsite);
    }

    public WebElement getGender(String gender){
        gender = gender.toLowerCase();

        if (gender.equals("male"))
            return WebDriverFactory.getDriver().findElement(byMaleGender);
        else if (gender.equals("female"))
            return WebDriverFactory.getDriver().findElement(byFemaleGender);
        else if (gender.equals("other"))
            return WebDriverFactory.getDriver().findElement(byOtherGender);
        else
            return null;
    }

    public WebElement getUpdateProfile() {
        return WebDriverFactory.getDriver().findElement(byUpdateProfileButton);
    }

    public WebElement getPassword() {
        return WebDriverFactory.getDriver().findElement(byPassword);
    }

    public WebElement getConfirmPassword() {
        return WebDriverFactory.getDriver().findElement(byConfirmPassword);
    }

    public WebElement getUpdatePassword() {
        return WebDriverFactory.getDriver().findElement(byUpdatePasswordButton);
    }

    public WebElement getDeleteAccount() {
        return WebDriverFactory.getDriver().findElement(byDeleteAccountButton);
    }

    public WebElement getAlertSuccess() {
        return WebDriverFactory.getDriver().findElement(byAlertSuccess);
    }

    public WebElement getAlertDanger() {
        return WebDriverFactory.getDriver().findElement(byAlertDanger);
    }

    public WebElement getAlertInfo() {
        return WebDriverFactory.getDriver().findElement(byAlertInfo);
    }

    public WebElement getAlertClose() {
        return WebDriverFactory.getDriver().findElement(byAlertClose);
    }

}
