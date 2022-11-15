# Window handling

* A window in any browser is the main webpage on which the user is landed after hitting a link/URL
  * Also known as `parent` or `main window`
* All other windows/tabs are known as child windows
* Practice page [link](https://demoqa.com/browser-windows)

## Locating child and parent windows in Selenium

* When page opens in Selenium, that page is **parent page or window**
* All the windows opened after parent window are **child windows**
* **Window handles** store the unique address of the browser windows. It is pointer to a window.
  * Each browser has a unique window handle value with which we can uniquely identify it
  * Methods for window handling in Selenium
    * `getWindowHandle(): String` - we get unique ID of the current window
    * `getWindowHandles(): Set` - we get all ids of child widows
    * `switchTo()` - used to perform switching from parent to child and vice versa
    * `action()` - helps in performing certain actions on the windows
* Note: After closing a child window we have to explicitly switch back to the parent window before using any WebDriver command to avoid `NoSuchWindow` exception.