import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.function.Function;
import java.util.function.Predicate;

public class WaitExamples {
    WebDriver driver;

    @BeforeMethod
    public void initialize() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/dynamic-properties");
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void implicitWaitExample() {
        /*
        Launch a new browser (such as ChromeDriver).
        Open URL "https://demoqa.com/dynamic-properties".
        Maximize the window.
        Find an element with id "visibleAfter". This element takes 5 secs to load which means this element will appear after 5 secs.
        Use implicitlyWait to wait for that element.
         */
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement visibleAfterFiveSecButton = driver.findElement(By.id("visibleAfter"));
        visibleAfterFiveSecButton.click();
    }

    @Test
    public void explicitWait() {
        /*
        Click on element after it is enabled
        * */
        WebElement enabledAfter5SecButton = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("enableAfter"))));
        enabledAfter5SecButton.click();
    }

    @Test
    public void fluentWait() {
        driver.get("https://demoqa.com/alerts");

        FluentWait<WebDriver> wait = new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(10));
        wait.pollingEvery(Duration.ofMillis(250));
        wait.ignoring(NoSuchElementException.class);
        driver.findElement(By.id("timerAlertButton")).click();
        wait.until(ExpectedConditions.alertIsPresent());
    }


}
