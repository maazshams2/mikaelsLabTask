package utils;

import core.general.WebDriverFactory;
import core.configuration.TestsConfig;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import ru.yandex.qatools.allure.annotations.Step;


public class LogHelper {
    private static Logger log = LogManager.getLogger("### "  + TestsConfig.getConfig().getProject());
    final Level VERBOSE = Level.forName("VERBOSE", 200);

    @Step("{0}")
    protected void logInfo(String comment) {
        log.info(comment + "\n");
    }


    @Step("{0}")
    protected void logVerifyTrue(String comment, Object expected, Object actual) {
        log.info(comment + "\n");
        WebDriverFactory.saveAllureScreenshot();
        Assert.assertEquals(comment,expected, actual);

    }

    @Step("{0}")
    protected void logVerifyContains(String comment, String actual, String expected) {
        log.info(comment + "\n");
        WebDriverFactory.saveAllureScreenshot();
        Assert.assertTrue(comment,actual.contains(expected));

    }
    @Step("{0}")
    protected void logVerifyTrue(String comment, Object[] actual, Object[] expected) {
        log.info(comment + "\n");
        WebDriverFactory.saveAllureScreenshot();
        for(int i=0;i<actual.length;i++)
            Assert.assertEquals(comment,expected[i], actual[i]);

    }

    @Step("{0}")
    protected void logVerifyTrue(String comment, Object actual) {
        log.info(comment + "\n");
        WebDriverFactory.saveAllureScreenshot();
        Assert.assertEquals(comment,true,actual);
    }

    @Step("{0}")
    protected void logVerifyFalse(String comment, Object actual) {
        log.info(comment + "\n");
        WebDriverFactory.saveAllureScreenshot();
        Assert.assertEquals(comment,false,actual);
    }
    @Step("{0}")
    protected void logVerifyFalse(String comment, Object actual, Object expected) {
        log.info(comment+ "\n");
        WebDriverFactory.saveAllureScreenshot();
        Assert.assertFalse(comment,actual.equals(expected));
    }


    @Step("{0}")
    protected void logStep(String comment,boolean enableScreen) {
        log.info("STEP: " + comment + "\n");
        if(enableScreen)
            WebDriverFactory.saveAllureScreenshot();
    }

    @Step("{0}")
    public static void logStep(String comment) {
        log.info("STEP: " + comment + "\n");
       // WebDriverFactory.saveAllureScreenshot();
    }

    @Step("{0}")
    protected void logDataCheck(String comment, Object actual, Object expected) {
        log.log(VERBOSE, "Data Check "+ comment+ "\n");

    }

    @Step("{0}")
    protected void logCompareFormat(String comment, boolean actual) {
        log.log(VERBOSE, "Pattern check :: "+ comment+ "\n");
        WebDriverFactory.saveAllureScreenshot();
        if (!actual){
            Assert.fail("Pattern failed");
        } else {
            logInfo("Pattern Pass");
        }
    }

    @Step("{0}")
    protected void logVerifyNull(String comment, Object actual) {
        log.info(comment+ "\n");
        WebDriverFactory.saveAllureScreenshot();
        Assert.assertNull(comment,actual);
    }

    @Step("{0}")
    protected void logVerifyNotNull(String comment, Object actual) {
        log.info(comment+ "\n");
        WebDriverFactory.saveAllureScreenshot();
        Assert.assertNotNull(comment,actual);
    }

}
