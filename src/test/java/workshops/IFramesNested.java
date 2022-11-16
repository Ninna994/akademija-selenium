package workshops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFramesNested {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/nestedframes");
         /*
        Print the number of frames with Selenium WebDriver inside this web page. We should get the count as 1 because we only have one parent frame inside the web page.
        Switch to the parent frame using the id of the frame.
        Print the number of frames using Selenium WebDriver inside the parent frame. We should again get the count as 1 because it has only one child frame.
        Print text inside child iframe
          */
        int numOfIframes = driver.findElements(By.tagName("iframe")).size();
        driver.switchTo().frame("frame1");
        System.out.println("Number of parent iframes on page is: " + numOfIframes);
        int numOfChildFrames = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Number of child iframes is:" + numOfChildFrames);
        driver.switchTo().frame(0);
        System.out.println(driver.findElement(By.tagName("p")).getText() + " ---- this is child frame text");
        driver.switchTo().parentFrame();
        System.out.println(driver.findElement(By.tagName("body")).getText() + " ---- this is parent frame text after switching to parent frame from child frame");

        driver.quit();


    }
}
