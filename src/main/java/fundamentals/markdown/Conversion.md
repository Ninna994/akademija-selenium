# Conversion

* It is generally used if we have to perform mathematical operations on the string which contains a number.
* Whenever we receive data from TextField or TextArea, entered data is received as a string. 
* If entered data is in number format, we need to convert the string to an int.

* convert String to int
  * `Integer.parseInt(string)`
  * `Integer.valueOf(string)`
* convert int to String
  * `String.valueOf(int/double/float)`
  * `Integer.toString(int)`
  * `String.format("%d", int)`
    * %d - decimal
* same logic goes for other data types
  * examples Double.toString(), Float.parseFloat(string);  ....
* String to Date
* Object to String
* Date to Timestamp
* ... any type to any type almost
