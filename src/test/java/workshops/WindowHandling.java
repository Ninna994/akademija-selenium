package workshops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ina\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        WebElement theNewTabButton = driver.findElement(By.id("tabButton"));
        WebElement theNewWindowButton = driver.findElement(By.id("windowButton"));
        WebElement theNewWindowMessageButton = driver.findElement(By.id("messageWindowButton"));

        /*
        first scenario
        open new window and try to read text from new window
         */
        theNewWindowButton.click();
        String theMainWindowHandle = driver.getWindowHandle(); //stores main window handles
        Set<String> theChildWindowHandles = driver.getWindowHandles(); // stores all identifiers of child windows
        Iterator<String> iterator = theChildWindowHandles.iterator(); // iterator for Set Collection

        while (iterator.hasNext()) {
            String childWindow = iterator.next();
            if (!theMainWindowHandle.equalsIgnoreCase(childWindow)) { // check windows by comparing main and child windows
                driver.switchTo().window(childWindow); // switch to child window
                // code below without handling windows throws error Unable to locate element because we never went to new window, we are still on parent window
                WebElement theTextContainer = driver.findElement(By.id("sampleHeading"));
                System.out.println("Text in new window is: " + theTextContainer.getText());
            }
        }

        // switch to main window
        driver.switchTo().window(theMainWindowHandle);
        String theMainWindowTitle = driver.findElement(By.className("main-header")).getText();
        System.out.println(theMainWindowTitle + " is the main window title.");
        driver.quit();
    }
}
