package workshops;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String row = "5";
        String column = "3";

        String dynamicRowText = driver.findElement(By.xpath("//table[@name='courses']//tbody/tr[" + row  + "]")).getText();
        String dynamicColumnText = driver.findElement(By.xpath("//table[@name='courses']//tbody/tr[" + row + "]/td["+ column +"]")).getText();

        System.out.println(dynamicRowText);
        System.out.println("Text in " + column + ". column of " + row + ". row is: " + dynamicColumnText);

        driver.quit();
    }
}
