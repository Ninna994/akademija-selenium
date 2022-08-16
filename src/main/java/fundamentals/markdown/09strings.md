# Strings

* A String is an object and it's a sequence of characters. But much like the wrapper classes, the String class provides a lot of helpful methods for dealing with them.

## Methods available for Strings

* **charAt()** - will allow you to get a specific character within the String by its index. This is how you would iterate a String as you would an array. So, you won't be able to use the brackets like we use for other arrays. You would use the charAt() method within a loop, for example. Or if you wanted to get the very first element of the String, you can do a charAt(0).
* **contains()** - will allow you to see if a String contains a certain sequence of characters.
* **equals() and equalsIgnoreCase()**
* **endsWith(), startsWith()**
* **format()** - where you can use placeholders and then add items back into the String.
* **indexOf()** where you can pass in some substring of the String and it'll tell you what position it is within the String.
* **isEmpty()** can be used if you want to know if this String has data in it or not.
* **length()** lets us know how many characters are in the String and we can use this just like we use on the arrays.
* **matches()**  - where you can pass in a regular expression and see if the String matches that regular expression.
* **replace()** and **replaceAll()** are useful if there's something within a String that you want to change to something else. You can use these replace methods.
* **substring()** - get part of the String — you can give it a beginning and ending index, and just get that portion of the String.
* **toLowerCase(), toUpperCase()**
* **trim()** is used to get off the white spaces at the beginning or the end of a String.
* **valueOf()** lets you pass in any data type and get the String value of it.