package workshops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\inani\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");
        int numberOfInputs = driver.findElements(By.tagName("input")).size();
        System.out.println(numberOfInputs);

        driver.quit();
    }
}
