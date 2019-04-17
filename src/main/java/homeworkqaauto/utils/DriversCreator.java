package homeworkqaauto.utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriversCreator {
    static WebDriver driver;

    public static WebDriver getBrowserInstance(DriversList drivers, String URL){

        switch (drivers){
            case CHROME:
                System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\chromedriver.exe");
                driver = new ChromeDriver(  );
                break;
            case FIREFOX:
                System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\geckodriver.exe");
                driver = new FirefoxDriver(  );
                break;
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get( URL );
        return driver;
    }
}
