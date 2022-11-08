# HTML Elements Handling

## Checkbox Handling

* What is checkbox?
  * GUI option used for selecting choices
  * The checkbox allows users to select single or multiple choices out of the given list
  * `<input type="checkbox">`
* Checkbox states
  * `checked`
  * `unchecked`
  * `tristate/indeterminate` - neutral option - auto-selection (parent when child is selected)
* [Demo page](https://demoqa.com/automation-practice-form)
* Note - usually on Web checkboxes can be checked and unchecked by clicking on label
* Handling Checkboxes in Selenium
  * **Common handling - locate and click**
    * locating by checkbox id, name, className....
    * locating by label
    * locating by cssSelector
  * **Validations using Selenium WebDriver**
    * `isSelected()`
    * `isDisplayed()`
    * `isEnabled()`

## Radio Button Handling

* What is Radio button?
  * HTML element which allows the user to select only one of the given options
  * `<input type="radio">`
  * Note - Usually radio buttons of same group have same name
* [Demo page](https://demoqa.com/radio-button)
* Handling radio buttons in Selenium
  * **Common handling - locate and click**
    * locating by radio id, className, name...
    * locating by xpath, cssSelector
  * **Validations using Selenium WebDriver**
    * `isSelected()`
    * `isDisplayed()`
    * `isEnabled()`

## Dropdowns in Selenium

* There are currently various types of dropdowns - single-select, multi-select, dynamic etc. 
* Selenium WebDriver provides a class that handles single-select and multi-select native dropdowns
* `<select></select>`
* `Select` class
* `Select select = new Select(WebElement webelement)`
* Select methods
  * `selectByIndex(int)`
  * `selectByValue(int)`
  * `selectByVisibleText(String)`
* Deselect methods
  * `deselectAll()`
  * `deselectByIndex(int)`
  * `deselectByValue(int)`
  * `deselectByVisibleText(String)`
* Get Options
  * `getAllSelectedOptions()`
  * `getFirstSelectedOption()`
  * `getOptions()`
* Select methods for multiple-select
  * `isMultiple(): boolean`

## Dynamic Tables in Selenium

* In order to handle dynamic content on any page we can use parametrized xpath notation
* Examples
  * `.//*[@id='content']/table/tbody/tr[" + sRow + "]/td[" + sCol + "]`
  * More examples can be found [here](../../../test/java/workshops/DynamicTables.java)