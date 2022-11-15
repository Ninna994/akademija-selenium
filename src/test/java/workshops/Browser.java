package workshops;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\inani\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amplitudo.me");
        String pageTitle = driver.getTitle();
        String pageUrl = driver.getCurrentUrl();
        String pageSource = driver.getPageSource();
        System.out.println(pageTitle + "\n" + pageUrl + "\n"  + pageSource);
        driver.close();

        /*
        * Task 1
        * Launch Chrome Browser
        * Open Amplitudo Academy website
        * Get page title and title length
        * Print page title and title length
        * Get page URL and check if it is secure
        * Get Page Source and check its length
        * Close the browser
        * */

    }

}
