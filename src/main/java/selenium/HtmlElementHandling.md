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

## Dynamic Tables in Selenium