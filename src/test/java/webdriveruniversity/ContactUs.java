package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ContactUs extends WUBase{
    @Test
    public void testContactUsFormBasic() {
        // Populate all fields, click reset, than populate them once again and click submit

        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement theFirstNameField = driver.findElement(By.name("first_name"));
        WebElement theLastNameField = driver.findElement(By.name("last_name"));
        WebElement theEmailField = driver.findElement(By.name("email"));
        WebElement theCommentsTextarea = driver.findElement(By.name("message"));
        WebElement theResetButton = driver.findElement(By.cssSelector("[type='reset']"));
        WebElement theSubmitButton = driver.findElement(By.cssSelector("[type='submit']"));

        theFirstNameField.sendKeys("Nikolina");
        theLastNameField.sendKeys("Djekic");
        theEmailField.sendKeys("ina@mailinator.com");
        theCommentsTextarea.sendKeys("Ovo je neki text");
        theResetButton.click();
        theFirstNameField.sendKeys("Nikolina2");
        theLastNameField.sendKeys("Djekic2");
        theEmailField.sendKeys("ina2@mailinator.com");
        theCommentsTextarea.sendKeys("Ovo je neki text duzi malo test 2");
        theSubmitButton.click();
    }

    @Test
    public void testFindAllInputs() {
        driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");

        List<WebElement> inputs = driver.findElements(By.tagName("input"));
        int inputNumber = inputs.size();
        if (inputNumber > 0) {
            System.out.println("There are exactly " + inputNumber + " inputs on page.");
        } else {
            System.out.println("There are no inputs on page");
        }
    }

    @Test
    public void testAssertMessageSent() {
        testContactUsFormBasic();
        Assert.assertEquals(driver.findElement(By.tagName("h1")).getText(), "Thank You for your Message!", "Contact us message not received");
    }


}
