package helpers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class BrowserFactory {
    public static WebDriver driver;


    private static Map<String, WebDriver> drivers = new HashMap<String, WebDriver>();

    static {
        drivers = new HashMap<String, WebDriver>();
    }

    @BeforeClass

    public static void getBrowser() {

        System.setProperty("webdriver.chrome.driver", "/D://chromedriver.exe");
        driver = new ChromeDriver();
        long time = 2000;
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.abv.bg/");
        driver.manage().window().maximize();


    }

    @AfterClass
    public static void closeAllDriver() {
        for (String key : drivers.keySet()) {
            drivers.get(key).close();
            drivers.get(key).quit();
        }
    }
}
