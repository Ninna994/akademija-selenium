import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Drivers {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\inani\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        System.setProperty("webdriver.gecko.driver", "C:\\Users\\inani\\Desktop\\akademija-selenium\\drivers\\geckodriver.exe");
        WebDriver driverGecko = new FirefoxDriver();

        driverGecko.get("https://google.com");

       System.setProperty("webdriver.edge.driver", "C:\\Users\\inani\\Desktop\\akademija-selenium\\drivers\\msedgedriver.exe");
        WebDriver driverEdge = new EdgeDriver();
        driverEdge.get("https://google.com");

    }
}
