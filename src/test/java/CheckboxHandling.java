import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CheckboxHandling {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\inani\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/automation-practice-form");
        // Click on Sports by checkbox
        // Click on Reading by label
        // check if Music is selected
        // check if radio buttons are enabled
        // if they are enabled click on second one
        // check if it is selected and write adequate message
        List<WebElement> radioButtons = driver.findElements(By.xpath("//*[@type='radio']/following-sibling::*"));
        WebElement theFemaleRadioButton = driver.findElement(By.id("gender-radio-2"));
        if (radioButtons.get(0).isEnabled() && radioButtons.get(1).isEnabled() && radioButtons.get(2).isEnabled()) {
            radioButtons.get(1).click();
        }

        if (theFemaleRadioButton.isSelected()) {
            System.out.println("Test passed");
        } else {
            System.out.println("Test failed");
        }
        driver.quit();
    }
}
