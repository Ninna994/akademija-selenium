# Browser Commands

* Commands accessed by calling driver methods
* Method list
  * `get(String): void` - Loads a new website in current browser window 
  * `getTitle(): String` - Fetches the title of current page
  * `getCurrentUrl(): String` - Fetches the string representing the current url of browser tab  
  * `getPageSource(): String` - Returns the Source Code 
  * `close(): void` - Closes the current window 
  * `quit(): void` - Closes all windows opened bt the WebDriver 

# Navigation Commands

* To access navigation methods just type `driver.navigate()` - this will wake Navigation Interface
* Method list
  * `to(String): void` - Load a new webpage
  * `forward(): void` - browser forward
  * `back(): void` - browser back
  * `refresh(): void` - F5
  
# WebElement Commands

* WebElement is HTML Element
* When we want to use WebElement methods for interaction we are doing that through WebElement Interface
* Getting WebElement `findElement(By by): WebElement`
* Method list
  * `clear(): void` - if element is input/textarea it will clear the value
  * `sendKeys(CharSequence...keysToSend): void` - Simulates typing
  * `click(): void` - This simulates the clicking of any element
    * Preconditions for clicking - **element must be Visible and must have a height and width greater than 0**
  * `isDisplayed(): boolean` - This method determines if an element is currently being displayed or not
      * will return `true` if the element is present on the page and throw a NoSuchElementFound if the element is not present
      * if Element is present but hidden it will return `false`
  * `isEnabled(): boolean`
  * `isSelected(): boolean` - Determine whether this element is selected or not
    * This operation only applies to input elements such as Checkboxes, Select Options, and Radio Buttons. 
    * This returns True if the element is currently selected or checked, false otherwise.
  * `submit(): void` - This method works well/better than the click() if the current element is a form, or an element within a form. 
  * `getText() : String` - This method will fetch the visible (i.e. not hidden by CSS) innerText of the element.
  * `getTagName() : String` - This method gets the tag name of this element.
  * `getCssValue(): String ` - This method Fetch CSS property value of the given element
  * `getAttribute(String): String` - This method gets the value of the given attribute of the element
  * `getSize(): Dimension` - This method fetch the width and height of the rendered element.
  * `getLocation(): Point` - This method locate the location of the element on the page

# Finding elements in Selenium

* `findElement(By by): WebElement` - returns one element
* `findElements(By by): List of Web Elements` - returns list of web elements
* In order to interact with elements we need to first find or locate them on a web page
* Way we are going to find WebElement is also called **locator strategy**
* Different locator strategies
  * `id`
  * `name`
  * `className`
  * `tagName`
  * `cssSelector`
  * `xpath`
  * `linkText`
  * `partialLinkText`
* In case there is no matching element found, the findElement command throws NoSuchElementException.
* Syntax for multiple elements
  * `List<WebElement> elementName = driver.findElement(By.LocatorStrategy("locatorValue"))`