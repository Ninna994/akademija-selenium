# HTML

* Language in which most websites are written
* Skeleton for webpages

## Tags

* Tags are used to mark up the start of an HTML element and they are usually enclosed in angle brackets.
* `<tagName>`
* Most tags need to be opened and closed in order to function
* `<h1>Title</title>`
* When using multiple tags, the tags must be closed in the order in which they were opened
* [List of HTML tags](https://html.com/tags/)

## Attributes

* Attributes contain additional pieces of information.
* Attributes take the form of an opening tag and additional info is placed inside.
* Example of attribute `<img src="mydog.jpg" alt="A photo of my dog.">`
    * src and alt are attributes
* [List of HTML attributes](https://html.com/attributes/)

## Basic Construction of HTML page

```html
    <!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
<!-- Content goes here -->
</body>
</html>

```

## Basic elements and tags in HTML

* headings - starting with **h** letter
    * `<h1>Title</h1>`, `<h6>some subtitle</h6>`
* text elements
    * `<p></p>`
    * `<strong></strong>`
    * `<b></b>`
* links - anchor tags
    * `<a href="https://google.com">Link</a>`
* images
    * `<img src="test.jpeg" alt="some image">`
* list - unordered

```html

<ul>
    <li>List item 1</li>
    <li>List item2</li>
    <li>List item3</li>
    <li>List item 4</li>
    <li>List item 5</li>
    <li>List item 6</li>
</ul> 
```

* list - ordered

```html

<ol>
    <li>List item 1</li>
    <li>List item 2</li>
    <li>List item 3</li>
    <li>List item 4</li>
    <li>List item 5</li>
</ol>

```

## Tables in HTML

* Table example
```html
<table>
  <tr>
    <td>Row 1 - Column 1</td>
    <td>Row 1 - Colunm 2 </td>
    <td>Row 1 - Column 3 </td>
  </tr>
  <tr>
    <td>Row 2 - Column 1</td>
    <td>Row 2 - Column 2</td>
    <td>Row 2 - Column 3</td>
  </tr>
</table>

```

* Table tags
  * `<thead>`
  * `<tbody>`
  * `<tfoot>`
  * `<colgroup>`
  * `<th>`
  * `<tr>`
  * `<td>`

## Forms

* Every form must be wrapped inside `<form></form>` tags
* **Input** elements
  * All inputs have type
  * Type defines data needed to be inserted inside input field
  * Some types
    * `password`
    * `radio`
    * `checkbox`
    * `submit`
    * `reset`
    * `button`
    * `file`
    * `image`
    * `search`
    * `number`
    * `range`
    * `color`
    * `date`
    * `email`
    * `tel`
    * `url`
  * **Input attributes**
    * `type`
    * `name` - will be submitted along with form data
    * `value`
    * `readonly`
    * `disabled`
    * `maxlength`
    * `checked`
    * `size`
    * `pattern`
    * `placeholder`
    * `required`
    * `multiple`

## MISC

* Native, pre-populated **dropdowns**
  * `<select> <option></option> </select>`
* Free form text areas - can expand with content
  * `<textarea></textarea>`
* Buttons
  * `<input type="button/submit/reset/image">`
  * `<button type="button/submit/reset/"></button>`
* Labels - text representations connected to input fields
* 
