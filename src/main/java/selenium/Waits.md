# Waits in Selenium

* Selenium Wait is just a set of commands that wait for a specified period of time before executing test scripts on the elements
* Good Wait method implementation prevents `NoSuchElementFound` exception
* Types of Selenium Waits
  * Implicit Waits
  * Explicit Waits

## Implicit Wait in Selenium

* Condition-less wait command
* **IMPORTANT** `It is applied to all web elements on web page`
* In simple words - it tells Selenium that we would like it to wait for a certain amount of time before throwing and exception that it cannot interact or find element
* Implicit wait stays in place for the entire duration for which the browser is open
* We can implicitly wait through three functions
  * `implicitlyWait()` - polling time specified is time interval in which Selenium starts searching again after the last failed try
  * `pageLoadTimeout()` - waits for page to load completely for a maximum of specified number of seconds
  * `setScriptTimeout()` - waits for the asynchronous parts of the web page to finish loading for a specified number of seconds
* If the element is found earlier, the test executes at that point otherwise the WebDriver waits for the specified duration.

### implicitlyWait()

* Syntax
  * `driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10))`
  * **NOTE - IMPORTANT** - `implicitlyWait(10, TimeUnit.SECONDS)` is deprecated and should not be used!
* Default value of implicit wait is 0

### pageLoadTimeout()

* default value is 0
* negative value is infinite wait 
* Syntax
  * `driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30))`

### setScriptTimeout()

* Syntax
  * `driver.manage().timeouts().setScriptTimeout(Duration.ofSeconds(15))`

## Explicit Wait

* An explicit wait is a conditional wait strategy in Selenium in other words you wait until the condition you specified becomes true or the time duration has elapsed
* Some examples
```java
    alertIsPresent()
    elementSelectionStateToBe()
    elementToBeClickable()
    elementToBeSelected()
    frameToBeAvaliableAndSwitchToIt()
    invisibilityOfTheElementLocated()
    invisibilityOfElementWithText()
    presenceOfAllElementsLocatedBy()
    presenceOfElementLocated()
    textToBePresentInElement()
    textToBePresentInElementLocated()
    textToBePresentInElementValue()
    titleIs()
    titleContains()
    visibilityOf()
    visibilityOfAllElements()
    visibilityOfAllElementsLocatedBy()
    visibilityOfElementLocated()
```

* There are two types of explicit wait commands
  * `WebDriverWait`
  * `FluentWait`

### FluentWait

* Example usage `Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
  .withTimeout(Duration.ofSeconds(30))
  .pollingEvery(Duration.ofSeconds(5))
  .ignoring(NoSuchElementException.class);`
  * In the above code, the maximum allowed time for waiting is specified as 30 seconds (Duration.ofSeconds(30)) and the polling time is 5 seconds (pollingEvery(Duration.ofSeconds(5))). 
  * With this arrangement, the WebDriver will keep checking for the element every 5 seconds to a maximum elapse of 30 seconds.
* The fluent wait is similar to explicit wait in Selenium with one additional argument of frequency (also known as polling time). 
* The frequency number tells the WebDriver to keep checking for the element at regular intervals and wait till the maximum of "Duration.ofSeconds". This saves execution time. If the element becomes available earlier, we can proceed with our execution and finish quickly
* FluentWait in Selenium is an important class when we are dealing with AJAX elements.
* Fluent wait is also called smart wait because  it waits for the time till the condition specified in .until(YourCondition) method becomes true
* 

### WebDriverWait

* WebDriverWait specifies the condition and time for which the WebDriver needs to wait.
* Example usage `WebElement firstResult = new WebDriverWait(driver, Duration.ofSeconds(10))
  .until(ExpectedConditions.elementToBeClickable(By.xpath("//a/h3")));`
  * The WebDriver will wait till a maximum of 10 seconds for the element defined by the XPath to become clickable


## Important notes about Waits in Selenium

* The implicit wait is not advised to be mixed up with explicit wait in the test scripts. A test script with both the waits can produce unpredictable behavior due to erroneous timeout durations.
* it is recommended to use implicit wait only when you are in complete control of the script
* The implicit wait is applied once for all the elements and the next wait cycle starts once the previous one completes. 
* With polling, implicit wait keeps searching for the element at regular intervals till the time it finds the element or the maximum time has elapsed.

