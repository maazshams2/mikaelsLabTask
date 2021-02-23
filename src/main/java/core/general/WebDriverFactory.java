package core.general;

import core.configuration.TestsConfig;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import ru.yandex.qatools.allure.annotations.Attachment;

import java.io.File;
import java.sql.Timestamp;

public class WebDriverFactory {

    private static WebDriver driver;
    private static String device = TestsConfig.getConfig().getDevice();
    private static Boolean headless = Boolean.valueOf(TestsConfig.getConfig().getHeadless());
    private static String chromeDriverPath = device.equals("Windows") ? "driver/chromedriver.exe" : "driver/chromedriver";

    public static WebDriver getDriver() {
        if (driver != null) {
            return driver;
        } else {
            throw new IllegalStateException("Driver has not been initialized. " +
                    "Please call WebDriverFactory.startBrowser() before use this method");
        }
    }

    static void startDriver()  {
        ChromeOptions op = new ChromeOptions();
        if(device .equals("linux"))
        {
            chromeDriverPath = "driver/chromedriver_linux";
        }

        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", chromeDriverPath);
            if (device.equals("Windows")) {
                op.addArguments("--start-maximized");
            }
            else
                op.addArguments("start-fullscreen");
            if(headless)
                op.addArguments("headless");

            driver = new ChromeDriver(op);

        } else

        {
            throw new IllegalStateException("Driver has already been initialized. Quit it before using this method");
        }}


    /**
     * Finishes browser
     */
    static void finishDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

    @Attachment(value = "Page screenshot", type = "image/png")
    public static File saveAllureScreenshot() {
      return null;
//        return driver.getScreenshotAs(OutputType.BYTES);
//        return ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    }


}
