# Alert/Popup Handling in Selenium

* `Alerts` - small popup boxes that notify user some information seeking for permission or displaying warning message. User sometimes needs to insert some data into alert
  * When alert is displayed users will be blocked and will not be able to work further unless the alert message box gets handled.
* Types of alerts
  * **Windows/OS Alerts** - cannot be automated using Selenium only, we need to use either AutoIT or Robot Class in Java
  * **Web/JS/workshops.Browser based alerts** - commonly used across web, handled by Selenium
    * **Simple alerts**
      * informal
      * OK button displayed
    * **Prompt Alert**
      * input required from user
      * OK and Cancel buttons displayed
    * **Confirmation Alert**
      * user needs to accept or dismiss something
      * OK and Cancel buttons displayed
* Handling alerts in Selenium
  * `driver().switchTo().alert()` - invoke Alert interface usage
* Methods used for alert handling in Selenium
  * `accept(): void` - clicks OK button
  * `dismiss(): void` - clicks Cancel button
  * `getText(): String` - captures text from alert box
  * `sendKeys(): void` - sends data to alert box
* Practice page [link](https://demoqa.com/alerts)