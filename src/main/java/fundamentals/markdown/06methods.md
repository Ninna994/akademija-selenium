# Methods

In Java, methods are subtasks within a class. Methods are used to break a complex problem into small, manageable pieces.

Methods should perform a specific task and can help eliminate redundancy in code.

## Parts of methods

```java
    public static int calculateSum(int num1, int num2){ // header
     // body
        int sum = num1 + num2;
        return sum;
        }
```

Header items: 
* **public** - access modifier
  * indicate who is allowed access to use this method.
* **static** - non-access modifier
  * every method requires on of them(static, final, abstract, synchronized)
* **int** - return type
  * data type of the value that this method will return to the code that calls it
  * Every method is required to specify a return type.
  * _void_ -  Meaning, it is not going to return any value. So, even if your method returns nothing, you still have to specify a return type.
  * It's also important to note that a method can only return one value.
* **calculateSum** - name. Required
  * should begin with verb
  * if is boolean then method asks a question, for example - _isSumNegative_
  * lower case by convention
* **()** - set of parentheses
  * required, can be empty
  * parameter list container
  * comma-delimited list of inputs
* **signature** - name of the method and method's parameter list
  * must be unique within a class

Body items:

* After the method's header, comes the method's body, which is contained within a set of curly braces: {}
* The body consists of 0 or more statements that are to be executed should this method be called.
* If the body has specified a return type as anything other than void, the method must include a return statement, that returns a value that matches the return type specified in the header.

