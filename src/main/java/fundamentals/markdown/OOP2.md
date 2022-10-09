# Interfaces

* Interface is similar to class
* Only difference is Interface will have methods but not body
```java
    public greenGo() {} //throws error - { } - body not allowed in interfaces 
```
* Country and traffic rules example
  * if all countries have some same rules they could be Interfaces
  * should be followed by all countries
* Interfaces are **implemented**, not extended
* Class implements some interface
* CentralTraffic, AustralianTraffic example
* After implementing Interface right click + generate
  * Implement Methods
* `@Override` - sign that method is defined somewhere else and that we are writing new code that will be executed for that class
* **All methods from interfaces should be implemented!**
* If we are implementing an interface and are writing methods that Override that methods then we are making object like this
```java
    public class Class implements Interface  {
    Interface object = new Class(); //!important
}
```

* Naming convention - Interfaces are usually Adjectives
  * Serializable, Cloneable, Iterable...


# Polymorphism

* Polymorphism is the ability to take multiple forms. Specifically, in object-oriented programming, polymorphism is where a subclass can define their own unique behaviors, and yet share some of the same behaviors of their superclass.
* An example of polymorphism is where an object has a superclass type but is an instance of a subclass.
* Overloading and Overriding
* [Link](https://testautomationu.applitools.com/java-programming-course/chapter10.html)

# Abstraction

* Abstraction is defined as something that exists in theory but does not have a concrete existence. In Java, we have the reserved word, abstract — which is a non-access modifier that can be used on classes and methods. It is used when you want to define a template for a class or a method, but do not intend for it to be used as is.
* An abstract class is not designed to be instantiated. It's designed to be extended, thus pushing the burden of implementation onto the subclass.
* An abstract method has no body, only the signature of the method is defined, and it is not designed to be run as is. It's designed to be overridden by a subclass.
* [Link](https://testautomationu.applitools.com/java-programming-course/chapter11a.html)
* 2 ways to achieve abstraction:
  * Abstract class 0-100%
  * Interface - 100%

