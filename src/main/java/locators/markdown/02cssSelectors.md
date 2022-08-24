# CSS Selectors

* CSS Selectors are expressions that use pattern matching to find elements on a webpage.
* **tagName**
  * `div, p, input, select, img`
* **.className**
  * `div.className`
* **#id**
  * `div#id`
* **locate by descendants " "**
  * `div p`, `a span`
* **locate by direct parent-child relationship >**
  * `div > p`, `a > span`
* **locate by multiple selectors ,**
  * `div, p.class, a#id`
* **locate by attributes []**
  * existance `[attribute]`
  * equality `[attribute = 'test']`
  * contains `div[class*='result']`
* **locate by pseudo classes**
  * `:not(.className)`
  * `:nth-child(N)`

## XPATH

```xpath
Path from root

/html/body

Tag anywhere

//input

Direct Children

//ul/li/a

Descendants

//div/a

Any Element

//*

Any Descendants

//div//*

Attribute Value Equality

//li[@class='zcm__item']

Attribute Condition AND

//img[@width<20][@height<20]

//img[@width<20 and @height<20]

Attribute Condition OR

//input[@name='q' or @id='search_form_input']

Contains Function

//div[contains(@class, 'result')]

//div[contains(@class, 'result__snippet')]

Starts with function

//div[starts-with(@class, 'result')]

Logical not function

//a[not(contains(@class, 'header'))]

```