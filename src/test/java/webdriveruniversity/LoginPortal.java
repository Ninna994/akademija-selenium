package webdriveruniversity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LoginPortal extends WUBase{

    @Test
    public void testLoginValidCredentials() {
        driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
        WebElement theUsernameField = driver.findElement(By.id("text"));
        WebElement thePasswordField = driver.findElement(By.id("password"));
        WebElement theLoginButton = driver.findElement(By.id("login-button"));
        String username = "username";
        String password = "password";

        theUsernameField.sendKeys(username);
        thePasswordField.sendKeys(password);
        theLoginButton.click();
    }



}
