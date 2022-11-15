package workshops;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;


public class Alerts {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ina\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/alerts");

        WebElement theAlertSimpleButton = driver.findElement(By.id("alertButton"));
        WebElement theAlertAfterFiveSecondsButton = driver.findElement(By.id("timerAlertButton"));
        WebElement theAlertConfirmBoxButton = driver.findElement(By.id("confirmButton"));
        WebElement theAlertPromptButton = driver.findElement(By.id("promtButton"));
        WebElement theAlertPageTitle = driver.findElement(By.className("main-header"));

        /*
        Task 1
        click first alert
        read text from first button
        close alert and read title from main page
         */
        System.out.println("************************ Task 1 ************************\n");
        theAlertSimpleButton.click();
        Alert simpleAlert = driver.switchTo().alert();
        String simpleAlertText = simpleAlert.getText();
        System.out.println(simpleAlertText + " is the simple alert text");
        simpleAlert.accept();
        String theMainPageTitleText = theAlertPageTitle.getText();
        System.out.println(theMainPageTitleText + " is the main page heading text");

        System.out.println("\n************************ Task 2 ************************\n");
        /*
        open prompt alert
        dismiss alert
        open prompt alert again
        insert your name
        accept alert
        validate if your name is displayed on main screen in
         */
        String name = "Nikolina Djekic";
        theAlertPromptButton.click();
        Alert promptAlert = driver.switchTo().alert();
        promptAlert.dismiss();
        theAlertPromptButton.click();
        promptAlert.sendKeys(name);
        promptAlert.accept();
        WebElement promptResult = driver.findElement(By.id("promptResult"));
        String promptResultText = promptResult.getText();

        if (promptResultText.contains(name)) {
            System.out.println(name + " is successfully added");
        } else {
            System.out.println("Something went wrong. ");
        }

        System.out.println("\n************************ Task 3 ************************\n");
        /*
            click on button that triggers alert after 5 seconds
            wait for alert to be displayed
            validate that displayed text is "This alert appeared after 5 seconds"
         */
        String expectedMessage = "This alert appeared after 5 seconds";
        theAlertAfterFiveSecondsButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());

        Alert fiveSecAlert = driver.switchTo().alert();
        String alertText = fiveSecAlert.getText();
        if (alertText.equalsIgnoreCase(expectedMessage)) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("\n************************ Task 4 ************************\n");
        /*
        click on confirmBox alert
        accept alert
        validate that You selected Ok text is displayed
        click on confirmBox alert again
        dismiss alert
        validate that You selected Cancel txt is displayed
         */
        theAlertConfirmBoxButton.click();
        Alert confirmAlert = driver.switchTo().alert();
        confirmAlert.accept();
        if (confirmAlert.getText().equalsIgnoreCase("You selected Ok")) {
            System.out.println("Test passed, OK clicked");
        } else {
            System.out.println("Test failed");
        }
        theAlertConfirmBoxButton.click();
        confirmAlert.dismiss();
        if (confirmAlert.getText().equalsIgnoreCase("You selected Cancel")) {
            System.out.println("Test passed. Cancel clicked");
        } else {
            System.out.println("Test failed");
        }


        driver.quit();

    }
}
