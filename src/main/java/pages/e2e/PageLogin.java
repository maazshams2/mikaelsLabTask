package pages.e2e;

import core.general.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import core.configuration.TestsConfig;
import pages.Page;

public class PageLogin {

    public PageLogin(Page page){}

    public static String email = TestsConfig.getConfig().getEmail();
    public static String password = TestsConfig.getConfig().getPassword();

    private By byEmail = By.id("email");
    private By byPassword = By.id("password");
    private By byLoginBtn = By.className("fa-user");
    private By byForgotPassword = By.partialLinkText("forgot");

    private By byH3 = By.tagName("h3");

    public void login() throws InterruptedException {
        if (WebDriverFactory.getDriver().findElement(byH3).getText().contains("Sign in")) {
            WebDriverFactory.getDriver().findElement(byEmail).sendKeys(email);
            WebDriverFactory.getDriver().findElement(byPassword).sendKeys(password);
            WebDriverFactory.getDriver().findElement(byLoginBtn).click();
        }
    }

    public WebElement getForgotPasswordLink(){
        return WebDriverFactory.getDriver().findElement(byForgotPassword);
    }
}
