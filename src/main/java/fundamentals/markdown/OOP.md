## Class

* Class represents blueprint or template that tells how object is actually built
  * Class - Cookie cutter
  * Object - Cookie
* When we make object from Class we actually built **sample** of that class
* All Java code must be inside class
* All Classes in Java come from superclass Object

## Objects

* Data inside objects are called - **fields**
* Procedures that are inside objects and use fields are **methods**
* Union of fields is actual **state of object**
* Whenever we call some object's method its state can be change
* Three key characteristics:
  * **Object behaviour** - what are  methods we can use to manipulate and use this object
  * **Object state** - What is object's reaction when method is used
  * **Object identity** - How to differentiate it from other objects that could have similar behavior and states 

## Class Design

* When we think of Methods - we think of Verbs
  * add, cancel, ship, pay
* When we think of Classes - we think of Nouns
  * Item, Order, Address, Payment, Person

## Class Relations

* Most common relations between classes are
  * `Depends on` - **it uses** - Order uses Account
  * `Has, agregation` - **it has, it consists of**
  * `inherits` - **it inherits - it is**

## Constructors

* In order for us to work with Objects we need to make them and to set their starting state
* Only after that we can use its methods
  * Example - Scanner, Math
* To create new instance of Class we use `constructors`
  * special method used to create and initialize objects
  * always has same name as Class
  * can have 0, 1 or more parameters
  * returns nothing
  * we always call it with `new` keyword
* When we declare variables they do not have that object but only point on it
* Example - Dates, GregorianCalendar, CurrentCalendar
* `Inspectors`
  * methods starting with `get()`
  * they just return some value
* `Mutators`
  * methods starting with `set()`
  * they change values

## Custom Classes

* All classes until now had only one method - `main()`
* Custom classes usually don't have main method but own fields and methods
* main in custom methods is used to test method
* example: Employee class

## Encapsulation

* First and key concept of OOP
* Method of combining data, fields and states in one package and hiding their implementation
* How it works, key concepts:
  * methods never access other class's fields directly
  * Programs should modify fields of object only through methods of that object
* Key feature - programmer can change whole functionality of how system stores data, but as long as other objects still use same methods for handling those data they are not aware of change

## Inheritance - IS A

* Second concept of OOP
* One class can inherit states of other Class and all its methods
* Inheritance is where one class becomes an extension of another class, therefore inheriting the members of that class.
* There are two parties involved in an inheritance — a parent and a child.
  * The **parent** is known as the superclass, or sometimes also referred to as the parent class or base class.
  * The **child** is known as the subclass, or sometimes referred to as the child class or the derived class.
* When an inheritance relationship is created between these two classes, then the child class inherits the members of the parent class.
* This allows classes to reuse data that already exists within other classes.
* Subclasses should be a more specialized form of the superclass that they inherit from.
* Person class and employee class examples
* Syntax
```java
  class SubClassName extends SuperClassName {
    //methods and fields
    // SubClassName is a SuperClassName
    // Employee is a Person
}
```
* Employees example

## Aggregation HAS A

* If a class have an entity reference, it is known as Aggregation
* Used for code re-usability
* Student example

## Constructors in Inheritance

* Rules
    * Superclass constructors run first
    * Use super to call specific constructors
    * super calls must be first
    * some constructors must be executed
* [Explanation](https://testautomationu.applitools.com/java-programming-course/chapter9b.html)

## Overriding inherited methods

* a subclass inherits the members of its parent, however, a subclass may want to change the functionality of a method that it inherited. - overriding
* Rectangle and Square
* It's encouraged that you use the override annotation, which is the @ symbol followed by the word Override — `@Override`.
  * This is not required, but it's strongly encouraged. 
  * This lets Java know that your intention is to override the method that you inherited from your super class.
