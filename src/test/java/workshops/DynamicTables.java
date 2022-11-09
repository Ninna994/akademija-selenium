package workshops;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class DynamicTables {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        String row = "5";
        String column = "3";
        WebElement dynamicTableCell = driver.findElement(By.xpath("//table[@name='courses']/tbody/tr[" + row + "]/td[" + column + "]"));
        String dynamicTableText = dynamicTableCell.getText();
        System.out.println(dynamicTableText);


        int sum = 0;
        List<WebElement> tableRows = driver.findElements(By.xpath("//div[@class=\"tableFixHead\"]/table/tbody/tr/td[last()]"));

        for (WebElement singleRow : tableRows) {
            sum += Integer.parseInt(singleRow.getText());
        }
        System.out.println("Sum of all amounts is: " + sum);

        /*
        // select 2. radio button
        // select 2. option
        // select 2. checkbox
        // choose dynamically second row and print it from first table
        // print all positions from second table
        // print size of second list
         */

        driver.quit();
    }
}
