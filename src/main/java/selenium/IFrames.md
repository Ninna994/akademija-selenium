# Iframes

* iFrame is a HTML document embedded inside an HTML document. 
* It is defined by `<iframe></iframe>` tags in HTML
* Practise page [link](https://demoqa.com/frames)
* To switch between iframes we use `driver.switchTo().frame()`
* `frame()` function accepts one of three arguments
  * `frame(int frameNum)` - frame index
  * `frame(String frameName)` - frame name or ID
  * `frame(WebElement frameElement)` - WebElement
* To switch back to main content use ` switchTo().defaultContent()`
* To switch to parent from child frame use `switchTo().parentFrame()`