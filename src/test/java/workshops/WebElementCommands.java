package workshops;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\inani\\Desktop\\akademija-selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // visit page
        driver.get("http://automationpractice.com/index.php");

        // locate elements on page
        WebElement theSearchField = driver.findElement(By.id("search_query_top"));
        WebElement theSearchButton = driver.findElement(By.name("submit_search"));

        String stringToSearch = "dress";

        theSearchField.click();
        theSearchField.sendKeys(stringToSearch);
        theSearchButton.click();

        WebElement theSearchPageHeading = driver.findElement(By.cssSelector(".page-heading.product-listing"));
        if (theSearchPageHeading.isDisplayed()) {
            System.out.println("Search successful");
        } else {
            System.out.println("Search unsuccessful");
        }

        driver.quit();



    }
}
