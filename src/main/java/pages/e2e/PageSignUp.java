package pages.e2e;

import core.configuration.TestsConfig;
import core.general.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.Page;

public class PageSignUp {
    public PageSignUp(Page page){}

    private static String email = TestsConfig.getConfig().getEmail();
    private static String password = TestsConfig.getConfig().getPassword();

    private By bySignUpText = By.tagName("h3");
    private By byEmail = By.id("email");
    private By byPassword = By.id("password");
    private By byConfirmPassword = By.id("confirmPassword");
    private By bySignUpButton = By.className("btn-success");

    public void signUp(){
        if (WebDriverFactory.getDriver().findElement(bySignUpText).getText().equals("Sign up")) {
            WebDriverFactory.getDriver().findElement(byEmail).sendKeys(email);
            WebDriverFactory.getDriver().findElement(byPassword).sendKeys(password);
            WebDriverFactory.getDriver().findElement(byConfirmPassword).sendKeys(password);
            WebDriverFactory.getDriver().findElement(bySignUpButton).click();
        }
    }
}
