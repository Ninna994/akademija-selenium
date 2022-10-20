## Basics 

* **Web page**
  * A web page is a document on the worldwide web that can be displayed in a browser on a computer or device
  * Web pages have three main components
    * **HTML**
      * skeleton of the page, structure of content
      * element format `<tagName attribute="value">content</tagName>`
      * body, tags, attributes, head
    * **CSS**
      * skin of the page
      * controls colors, size, font, position, layout
    * **JavaScript**
      * dynamic content
  * **Browser** - itself is an application that loads and renders content from the worldwide web in these file formats. When a user requests a page through a browser, the website will return those three types of documents for the browser to execute and display on the local device. The browser truly brings the page to life.
  * **DOM** - Document Object Model
    * Programming interface for HTML and XML documents used to manipulate the page
    * It represents page as an object
  * **Web element** -  is an object representing a live rendered HTML element on the page
  * **Web element locator / selector** - query that finds and returns specific elements from the DOM
    * Locators find elements
    * Locators can return multiple elements(all elements that match)
    * Anything a user can do visually in the browser can also be done programmatically with JavaScript actions
  
## Locators

* **IDs**
  * By HTML standards, the id attribute must have a unique value on a given page. Thus, a locator that uses an id will uniquely identify a single target element.
* **name**
  * Name attributes are used for input related elements like input, button, and text area. Each input element within a form should have a unique name and oftentimes, the names are unique for the whole page as well.
* **className**
  * Class names attach CSS styling to HTML elements
  * An element may have one class name, many class names, or none at all.
  * class names do not need to be unique per element

Example 1:

```html
<html>
<body>
	<div class=”article opinion” id=”main-article”>
	    <div class=”section”>
			<h2 class=”topic-header”>Main Argument</h2>
			<p>...</p>
		</div>
		<div class=”section”>
			<h2 class=”topic-header”>Rebuttal</h2>
			<p>...</p>
		</div>
		<div class=”section”>
			<button class=”response-button” name=”agree”>Agree with Argument</button>
			<button class=”response-button” name=”disagree”>Agree with Rebuttal</button>
		</div>
	</div>
</body>
</html>
```

