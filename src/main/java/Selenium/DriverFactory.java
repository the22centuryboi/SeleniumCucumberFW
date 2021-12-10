package Selenium;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



public class DriverFactory {


    public static WebDriver getDriver() {

        String browser = System.getenv("BROWSER");
        System.setProperty("webdriver.chrome.driver","src/test/resources/Drivers/chromedriver.exe");
        if (browser == null) {
            //WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            return new ChromeDriver(options);
        }
        switch (browser)
        {
            case "IE":
                //WebDriverManager.iedriver().setup();
                return new InternetExplorerDriver();
            case "EDGE":
               // WebDriverManager.edgedriver().setup();
                return new EdgeDriver();
            case "FIREFOX":
                //WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                //WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

        }
    }

    public static void close(WebDriver driver){
        driver.quit();
    }
}
