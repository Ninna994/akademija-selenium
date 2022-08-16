# Inheritance

* Java is an object-oriented programming language.
* Inheritance is where one class becomes an extension of another class, therefore inheriting the members of that class.
* There are two parties involved in an inheritance — a parent and a child.
* The **parent** is known as the superclass, or sometimes also referred to as the parent class or base class.
* The **child** is known as the subclass, or sometimes referred to as the child class or the derived class.
* When an inheritance relationship is created between these two classes, then the child class inherits the members of the parent class.
* This allows classes to reuse data that already exists within other classes.
* Subclasses should be a more specialized form of the superclass that they inherit from.
* Person class and employee classs

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
* It's encouraged that you use the override annotation, which is the @ symbol followed by the word Override — @Override. This is not required, but it's strongly encouraged. This lets Java know that your intention is to override the method that you inherited from your super class.

## Polymorphism

* Polymorphism is the ability to take multiple forms. Specifically, in object-oriented programming, polymorphism is where a subclass can define their own unique behaviors, and yet share some of the same behaviors of their superclass.
* An example of polymorphism is where an object has a superclass type but is an instance of a subclass.
* [Link](https://testautomationu.applitools.com/java-programming-course/chapter10.html)

## Abstraction

* Abstraction is defined as something that exists in theory but does not have a concrete existence. In Java, we have the reserved word, abstract — which is a non-access modifier that can be used on classes and methods. It is used when you want to define a template for a class or a method, but do not intend for it to be used as is.
* An abstract class is not designed to be instantiated. It's designed to be extended, thus pushing the burden of implementation onto the subclass.
* An abstract method has no body, only the signature of the method is defined, and it is not designed to be run as is. It's designed to be overridden by a subclass.
* [Link](https://testautomationu.applitools.com/java-programming-course/chapter11a.html)

## Interfaces



