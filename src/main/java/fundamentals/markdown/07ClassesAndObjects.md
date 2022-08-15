# Classes and Objects

## Objects

* **Objects** are structures which contain data in the form of fields and methods.
* These fields and methods can be utilized in other classes by creating an object
* **Encapsulation** - Hiding the data of a class by making its fields private and allowing access through public methods is known as
* **Constructor** - same name as Class/Object
  * default constructor does not have a parameter list  - used to assign values to the fields
    * in Java a default constructor is always defined implicitly.
```java
   public Rectangle(){
        length = 0;
        width = 0;
  ```
* this class does not have main because we are not interested in executing methods inside of this class itself
* if we want anyone to use this class and set length and width with generating **getters** and **setters**
* HomeAreaCalculator, Rectangle

## Instantiating Objects

* We make instance of Class by creating a new object
* `Rectangle room1 = new Rectangle();`
* We access object's accessible methods by writing `.`
* When we instantiate the new object we call a constructor of the class
* There can be multiple instances of class in same time - example HomeAreaCalculator
* Data type of an object is Class

## Objects as Method Parameters and Return Types

* We can use objects as the arguments for methods
* When two classes are in same packages they are not imported - For classes that are not within the same package, you have to import them.
* HomeAreaCalculatorRedo

## Overloading Classes within a Class

* Within a class, you can have multiple methods that have the same name but different signatures. **And this is known as overloading.**
* Overloading
  * Classes can have same name
  * Parameter list **must be different**
  * There can be unlimited number of overloaded methods inside a class 
* Month and Month Converter