package pages.e2e;

import core.general.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.Page;

import java.util.List;

public class PageHome {
    public PageHome(Page page){}

    private By byNavBar = By.className("navbar");
    private By byNavItem = By.className("nav-item");
    private By byDropdownMenu = By.className("dropdown-menu");
    private By byDropdownToggle = By.className("dropdown-toggle");

    private By bySignUpLink = By.partialLinkText("Create Account");
    private By byLogin = By.partialLinkText("Login");

    private By byAccountItem = By.partialLinkText("My Account");
    private By byLogoutItem = By.partialLinkText("Logout");

    private By byH1 = By.tagName("h1");
    private By bySpan = By.tagName("span");

    public List<WebElement> getNavItems(){
        return WebDriverFactory.getDriver().findElement(byNavBar).findElements(byNavItem);
    }

    public WebElement getDropDownToggle(){
        return WebDriverFactory.getDriver().findElement(byNavBar).findElement(byDropdownToggle);
    }

    public WebElement getDropDownText(){
        return getDropDownToggle().findElement(bySpan);
    }

    public WebElement getDropDownMenu(){
        return WebDriverFactory.getDriver().findElement(byDropdownMenu);
    }

    public WebElement getSignUpLink(){
        return WebDriverFactory.getDriver().findElement(bySignUpLink);
    }
    public WebElement getLoginLink(){
        return WebDriverFactory.getDriver().findElement(byLogin);
    }

    public WebElement getDropDownItem(String itemName){
        itemName = itemName.toLowerCase();
        WebElement element = null;

        if (itemName.contains("account"))
            element = getDropDownMenu().findElement(byAccountItem);
        else if (itemName.contains("logout"))
            element = getDropDownMenu().findElement(byLogoutItem);

        return element;
    }

    public WebElement getH1(){
        return WebDriverFactory.getDriver().findElement(byH1);
    }

}
