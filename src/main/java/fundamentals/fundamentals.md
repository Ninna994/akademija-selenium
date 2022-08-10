# Computer / Program

**Computer** - a machine that is capable of processing data

**Program** - set of instructions that a computer follows to perform a specific task

**Algorithm** - is a high level step by step guide to complete a task

# Java Terminology

* **src** - source code, folder that contains code

* **case-sensitive** java is case-sensitive, meaning that the identifiers AB, Ab, aB, and ab are different in Java.

* **package** - is a folder or container that holds java files. We can and should have multiple packages. Packages should
be all lowercase by convention.

* **Class** - java file. 
  * Plan of the instance of the class(object).
  * First letter should be uppercase.
  * Each inner word's first letter is also uppercase
  * Encouraged are letters and numbers 
  ```java
        class MyJavaProgram    // valid syntax
        class 1Program         // invalid syntax
        class My1Program       // valid syntax
        class $Program        // valid syntax, but discouraged
        class My$Program      // valid syntax, but discouraged (inner class Program inside the class My)
        class myJavaProgram   // valid syntax, but discouraged
   ```
  * Name should be a reflection of the context of code inside the class. 
  * If class is inside a package, the first line of code should contain that package. 
  * Next line is class declaration.
  * Example - Blueprint of the house

* **Object** is an instance of the class
  * It is an entity that has behaviour and state
  * Car is object, states are: brand, color, number plate
  * Behaviour - running on the road

* **Method** the behaviour of the object 
  * all method names should start with lowercase letters
  * camelCase in encouraged

* **default method in java** - public static void main, starting point of the program. Every wexecutable code must be
inside methods.

* **comments**
  * One line comments ```//```
  * Multiple line comments ```/*  */```
  * Documentation comments ```/** */```
  * Used for humans to read, not for computers. Ignored by computer.

* **end of statement** - ```;```

* **Access Modifiers** - [Link for table](https://prnt.sc/0OQ1hREuviTf)

# Variables

Variable in Java is a data container that saves the data values during Java program execution. Every variable is
assigned a data type that designates the type and quantity of value it can hold. A variable is a memory location name
for the data.

A variable is a name given to a memory location. It is the basic unit of storage in a program.

Important notes about variables:

* The value stored in a variable can be changed during program execution.
* A variable is only a name given to a memory location. All the operations done on the variable affect that memory
  location.
* In Java, all variables must be declared before use.

Declaring variables:

* datatype ```int``` data_name ```count```

## Initialize variables:

* datatype (type of data stored) ```int```
* variable_name (name given to variable) ```age```
* value (initial valud stored in variable) ```= 20;```
* => ```int age = 20;```

## Types of variables

* **Local** - A variable defined within a block or method.
    * Created when function is called and destroyed after exiting the block.
    * Mandatory initialization before using it in defined scope.
    * ```int age = 20;```
* **Instance** - Instance variables are non-static variables and are declared in a class outside of any method,
  constructor, or block.
    * Declared in a class and are created when an object of the class is created and destroyed when the object is
      destroyed.
    * Initialization is not required.
    * Default value is 0.
    * ```public int age;```
* **Static** - Class variables.
    * Static are declared using the **static** keyword within a class outside any method, constructor or block.
    * We can have only one copy of static variable per class.
    * Created at the beginning of the program execution and destroyed automatically after it ends.
    * Initialization is not mandatory.
    * Default value is 0

## Identifiers

In programming languages, identifiers are used for identification purposes. In Java, an identifier can be a class name, method name, variable name, or label. 

* The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore).For example “geek@” is not a valid java identifier as it contain ‘@’ special character.
* Identifiers should not start with digits([0-9]). For example “123geeks” is a not a valid java identifier.
* Java identifiers are case-sensitive.
* There is no limit on the length of the identifier but it is advisable to use an optimum length of 4 – 15 letters only.
* Reserved Words can’t be used as an identifier. For example “int while = 20;” is an invalid statement as while is a reserved word. There are 53 reserved words in Java.

```txt
// valid identifiers
MyVariable
MYVARIABLE
myvariable
x
i
x1
i1
_myvariable
$myvariable
sum_of_array
geeks123

// invalid identifiers
My Variable  // contains a space
123geeks   // Begins with a digit
a+c // plus sign is not an alphanumeric character
variable-2 // hyphen is not an alphanumeric character
sum_&_difference // ampersand is not an alphanumeric character
```

* **Reserved words** - Any programming language reserves some words to represent functionalities defined by that language. These words are called reserved words.They can be briefly categorized into two parts : keywords(50) and literals(3)


## Scope of Variables

Scope of a variable is the part of the program where the variable is accessible. Java programs are organized in the form of classes. Every class is part of some package. Java scope rules can be covered under following categories.

1. **Member Variables (Class Level Scope)** 
   1. Must be declared inside class, outside any function
   2. They can be directly accessed anywhere in class.
![Class level scope](/src/main/resources/images-md/class-level-scope.png)
2. 