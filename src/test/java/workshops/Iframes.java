package workshops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Iframes {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/frames");

        /*
        find number of iframes on page
         */
        List<WebElement> allIframes = driver.findElements(By.tagName("iframe"));
        int numOfIframes = allIframes.size();
        System.out.println("Total number of iframe elements on page is: " + numOfIframes);

        /*
        switch to first iframe by index and get its title
        Note - because of ads on this page we are unable to locate by id because number of ads displayed in iframe changes
         */
        driver.switchTo().frame("frame1");
        String firstIframeHeadingText = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(firstIframeHeadingText);
        driver.switchTo().defaultContent();
        /*
        switch to second iframe by if and take its text
         */
        driver.switchTo().frame("frame2");
        String secondIframeHeading = driver.findElement(By.id("sampleHeading")).getText();
        System.out.println(secondIframeHeading);
        driver.switchTo().defaultContent();

        driver.quit();
    }
}
