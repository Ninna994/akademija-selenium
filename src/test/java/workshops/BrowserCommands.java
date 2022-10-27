package workshops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\inani\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        String url = "https://amplitudo.me";
        driver.get(url);
        String title = driver.getTitle();
        String source = driver.getPageSource();
        String currentUrl = driver.getCurrentUrl();

        System.out.println("Title of this page is: " + title + ".");
        System.out.println("Current url of this page is: " + currentUrl);
        // System.out.println("Page source is " + source);

        driver.navigate().to("https://google.com");
        driver.navigate().back();
        driver.navigate().refresh();

        driver.close();
    }
}
