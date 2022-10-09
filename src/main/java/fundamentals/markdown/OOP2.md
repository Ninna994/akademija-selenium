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


# Inheritance

