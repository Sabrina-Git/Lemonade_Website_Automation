package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseClass {
    private static  WebDriver driver;

    public BaseClass() throws IOException, InterruptedException {
        FileInputStream fis = new FileInputStream("C:\\Users\\sabri\\IdeaProjects\\Automation_Lemonade\\src\\test\\java\\utility\\Environment.properties");
        Properties prop = new Properties();
        prop.load(fis);

        String myBrowser = prop.getProperty("browser");
        System.out.println(myBrowser);

        String myUrl = prop.getProperty("url");
        System.out.println(myUrl);


        if(myBrowser.equalsIgnoreCase("chrome")){

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();

            driver.get(myUrl);

        } else if (myBrowser.equalsIgnoreCase("firefox")) {

            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }


        driver.manage().window().maximize();
        Thread.sleep(2000);
    }


    public static WebDriver getDriver() {
    return driver;
    }

    public static void setDriver( ) throws IOException, InterruptedException {
        BaseClass obj = new BaseClass();
    }
}
