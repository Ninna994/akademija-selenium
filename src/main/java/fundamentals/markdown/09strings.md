# Strings

* A String is an object and it's a sequence of characters. 
* But much like the wrapper classes, the String class provides a lot of helpful methods for dealing with them.
* Strings represent sequence of Unicode characters
  * example - String Java consists of 4 unicode characters - J, a, v and a.
* Java does not have embedded type string but instead of that it uses predefined class String
* Every string surrounded with `" "` represents class String
* Strings are immutable
  * Objects of String class are immutable

```java
    String e = "";
    String greeting = "Hello";
    // to change greeting to Help! we can do this
    String help = greeting.substring(0,3) + "p!";
```

## substring()

* Part of bigger string
* `string.substring(x,y)`
  * x - first position to start from, to exclude
  * y - first position to exclude
  * length of substring is always `y-x`

```java
    String greeting = "Hello";
    String substring = greeting.substring(0,3); //return Hel
```

## Concatenation

* To concatenate two strings use `+` sign

```java
    String greeting = "Hello";
    String name = "Nina";
    String greetMe = greeting + name; // HelloNina
    String greetMeSpace = greeting + " " + name; // Hello Nina
    String number = 10;
    String string = greeting + " " + name + number; // Hello Nina10
```

## Equality of strings .equals() and .equalsIgnoreCase()

* To check if two strings are equal we use `.equals()` method
* It returns `true` or `false`
* `==` sign is not used to compare two Strings. It is only used to check if two Strings are stored on same location

```java
    String greeting = "Hello";
    String greet = "Hello";
    greeting.equals("Hello");
    greetings.equals(greet);
    // to check equality without checking case we use
    greetings.equalsIgnoreCase("hello"); //true
```

## Empty Strings

* Empty string is string with length 0

```java
    //to check if string is empty
    if(str.length() == 0 || str.equals(""))
```

* String can also be `null`
  * null means that right now no object is connected to string
  * to check if string is null we use ```str == null```

## .charAt()

* Return character at index position
* Has limitations because of characters that are stored in two code units in Unicode(like Z character). 

## .replace()

* returns new string

```java
    String replace(oldString, newString);
```

## String methods

* There are more than 50 methods connected to Strings in Java
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

