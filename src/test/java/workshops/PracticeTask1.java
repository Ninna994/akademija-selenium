package workshops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTask1 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\inani\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        /*

         */
        driver.findElement(By.id("state")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-3-option-0")).click();
        driver.findElement(By.id("city")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("react-select-4-option-0")).click();
        driver.quit();



    }
}
