package pages;

import utils.LogHelper;
import pages.e2e.*;
import java.awt.*;

public class Page {


    private final PageLogin PageLogin = new PageLogin(this);
    private final PageSignUp PageSignUp = new PageSignUp(this);
    private final PageHome PageHome = new PageHome(this);
    private final PageAccount PageAccount = new PageAccount(this);

    public Page() throws AWTException {
    }


    protected PageLogin getPageLogin() {return PageLogin;}
    protected PageSignUp getPageSignUp() {return PageSignUp;}
    protected PageHome getPageHome() {return PageHome;}
    protected PageAccount getPageAccount() {return PageAccount;}

}
