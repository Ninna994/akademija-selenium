package workshops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdowns {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\inani\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com/select-menu");

        /* 1. task
        Launch the browser.
        Open "https://demoqa.com/select-menu".
        Select the Old Style Select Menu using the element id.
        Print all the options of the dropdown.
        Select 'Purple' using the index.
        After that, select 'Magenta' using visible text.
        Select an option using value.
        Close the browser
         */

        WebElement oldSelect = driver.findElement(By.id("oldSelectMenu"));
        Select select = new Select(oldSelect);
        List<WebElement> allOldSelectOptions = select.getOptions();

        for (WebElement singleOption : allOldSelectOptions) {
            System.out.println(singleOption.getText());
        }

        select.selectByIndex(4);
        Thread.sleep(2000);
        select.selectByVisibleText("Magenta");
        Thread.sleep(2000);
        select.selectByValue("10");
        Thread.sleep(2000);

        /*
        2. task

    Launch the browser.
    Open "https://demoqa.com/select-menu".
    Select the Standard Multi-Select using the element id.
    Verifying that the element is multi-select.
    Select 'Opel' using the index and deselect the same using index.
    Select 'Saab' using value and deselect the same using value.
    Deselect all the options.
    Close the browser.

         */
        WebElement theMultipleSelectDropdown = driver.findElement(By.id("cars"));
        Select multipleSelect = new Select(theMultipleSelectDropdown);

        if (multipleSelect.isMultiple()) {
            multipleSelect.selectByIndex(2);
            multipleSelect.deselectByIndex(2);
            Thread.sleep(2000);
            multipleSelect.selectByValue("saab");
            multipleSelect.deselectByValue("saab");
            Thread.sleep(2000);
            multipleSelect.deselectAll();
        } else {
            System.out.println("Cannot select multiple elements");
        }

        driver.quit();

    }
}
