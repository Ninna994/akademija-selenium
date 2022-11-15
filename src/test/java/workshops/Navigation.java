package workshops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Navigation {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\inani\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://akademija.amplitudo.me");
        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
    }
}
