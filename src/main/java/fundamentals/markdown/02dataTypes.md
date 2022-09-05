# Data types

Data types are different sizes and values that can be stored in the variable that is made as per convenience and circumstances to cover up all test cases.

Java is **statically typed**(where each variable and expression type is already known at compile time) and also a strongly typed language because, in Java, each type of data (such as integer, character, hexadecimal, packed decimal, and so forth) is predefined as part of the programming language and all constants or variables defined for a given program must be described with one of the data types.

## Data types in Java

1. **Primitive Data Type** - ```boolean```, ```int```, ```char```, ```short```, ```byte```, ```long```, ```float```, ```double```
2. **Non-Primitive Data Types / Object Data type** - ```String```, ```Array```...

## Types of Primitive Data Types

Primitive data are only single values and have no special capabilities. There are 8 primitive data types. 

1. **boolean** - ```true false```
   1. syntax: ```boolean booleanVar;```
   2. default value ```false```
2. **int**
   1. syntax: ```int intVar;```
   2. values: ```-2, 147, 483, 648 to 2, 147, 483, 647 (inclusive)```
   3. default value: ```0```
3. **double** - double precision 64-bit floating point. Used for decimal values.
   4. syntax ```double doubleVar;```
   5. values: up to 16 decimal digits
   6. default value ```0.0```
4. **long** - 64-bit, two-complement integer, used when int is not enough to hold the desired value
   7. syntax ```long longVar;```
   8. values: ``` {-9, 223, 372, 036, 854, 775, 808} to {9, 223, 372, 036, 854, 775, 807} (inclusive)```
   9. default value ```0```
5. **char** single 16bit unicode character (size 2 byte - not 1 because of cyrillic, arabic etc)
   10. syntax: ```char charVar;```
   11. values: ```\u0000 to \uffff``` or ```0 to 65535```
6. **byte** - The byte data type is used to save memory in large arrays where the memory savings is most required. It saves space because a byte is 4 times smaller than an integer. It can also be used in place of "int" data type.
   1. minimum `-128` maximum `127` 
   2. default 0
7. **short** - The short data type can also be used to save memory just like byte data type. A short data type is 2 times smaller than an integer.
   1. minimum `-32768` maximum `32767`
   2. default 0
8. **float** - Its value range is unlimited. The float data type should never be used for precise values, such as currency
   1. default `0.0F`

## Types of Non-Primitive Data Types / Reference Data Types

The Reference Data Types will contain a memory address of variable values because the reference types won’t store the variable value directly in memory. They are strings, objects, arrays, etc. 

1. **Strings** - array of characters. String is designed to hold a sequence  of characters in a single variable. (Character array is collection of separate char type entities)
   1. declaring a String ```<String_Type> <string_variable> = "<sequence_of_strings>";```
   2. example: ```String name = "QA Automation"; ```
2. **Class** - A class is a user-defined blueprint or prototype from which objects are created.  It represents the set of properties or methods that are common to all objects of one type.
   1. Elements of class are:
      1. **Modifiers:** A class can be public or has default access. 
      2. **Class name:** The name should begin with an initial letter (capitalized by convention)
      3. **Superclass(if any):** The name of the class’s parent (superclass), if any, preceded by the keyword extends. A class can only extend (subclass) one parent.
      4. **Interfaces(if any):** A comma-separated list of interfaces implemented by the class, if any, preceded by the keyword implements. A class can implement more than one interface.
      5. **Body:** The class body is surrounded by braces, { }.
   2. **Object** - Represents real-life entities. A typical Java program creates many objects, which as you know, interact by invoking methods
      1. An object consists of: 
         1. **State:** It is represented by the attributes of an object. It also reflects the properties of an object.
         2. **Behavior:** It is represented by the methods of an object. It also reflects the response of an object to other objects.
         3. **Identity:** It gives a unique name to an object and enables one object to interact with other objects.
   3. **Interface** can have methods and variables, but the methods declared in an interface are by default abstract (only method signature, no body).
      1. Interfaces specify what a class must do and not how. It is the blueprint of the class
3. **Array** - a group of like-typed variables that are referred to by a common name
   1. all arrays are dynamically allocated
   2. A Java array variable can also be declared like other variables with [] after the data type
   3. The variables in the array are ordered and each has an index beginning from 0.
   4. Java array can also be used as a static field, a local variable, or a method parameter
   5. The size of an array must be specified by an int value and not long or short
   6. The direct superclass of an array type is Object
      