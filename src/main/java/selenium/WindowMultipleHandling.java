package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowMultipleHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ina\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/browser-windows");
        WebElement theNewTabButton = driver.findElement(By.id("tabButton"));
        WebElement theNewWindowButton = driver.findElement(By.id("windowButton"));
        WebElement theNewWindowMessageButton = driver.findElement(By.id("messageWindowButton"));

        // cliock on two buttons to open two windows

        theNewWindowButton.click();
        theNewWindowMessageButton.click();

        String theMainWindow = driver.getWindowHandle();
        System.out.println("Main window handle is: " + theMainWindow);

        // handling all new opened windows
        Set<String> theChildWindows = driver.getWindowHandles();
        System.out.println("child window handles are " + theChildWindows);
        Iterator<String> i = theChildWindows.iterator();

        while (i.hasNext()) {
            String theChildWindow = i.next();
            if (!theMainWindow.equalsIgnoreCase(theChildWindow)) {
                driver.switchTo().window(theChildWindow);
                driver.close();
                System.out.println("All child windows closed");
            }
        }

        driver.quit(); //main window closed
    }
}
