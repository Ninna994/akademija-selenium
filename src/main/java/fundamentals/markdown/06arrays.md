# Arrays

* An array in Java is a group of like-typed variables referred to by a common name.
* In Java, all arrays are dynamically allocated.
* Since arrays are objects in Java, we can find their length using the object property length.
* A Java array variable can also be declared like other variables with [] after the data type
* The variables in the array are ordered, and each has an index beginning from 0
* The size of an array must be specified by int or short value
* The direct superclass of an array type is Object.
* An array can contain primitives (int, char, etc.) and object (or non-primitive) references of a class depending on the
  definition of the array.

## Creating, initializing and accessing an Array

* Arrays are special objects or containers which can hold multiple values.
* Declaration of array `int[] lottoTicket = new int[6];`
    * **int** - data type, all values must be of the same data type
    * **[]** - indicate an array of ints, can appear after data type or after variable name
    * **lottoTicket**  - name
    * **=** - after name, equal sign
    * **new** - keyword
    * **[6]** - This number inside of the brackets represents the length of the array, meaning how many values can this
      array store. Once the length is declared, it's fixed — meaning it cannot be lengthened to hold more values.
* Adding values to array

```java
lottoTicket[0]=24;
        lottoTicket[1]=10;
        lottoTicket[2]=5;
        lottoTicket[3]=1;
        lottoTicket[4]=800;
        lottoTicket[5]=11;
```

* Each element in an array works as an individual variable.
* It can be **read** or set by accessing its **index**.
* We can **assign** values to an element of the array by specifying the elements index.
* Alternatively, if you know all values of the array's elements, you can use curly braces as a shortcut to initialize
  the array.
* `int[] lottoTickets = {24,10,5,1,800,11}`
* To **read** the value of an element, you simply use the array's name and the index of the element that you like.
    * `lottoTicket[2] //returns 5`\
* Anonymous arrays
  * We can declare array without name
  * `new int [] {10,15,17}`
* Other ways to initialize array
  * `int[] array = {17,19,20,21}`
  * `array = new int[] {17,19,20,21}`

## Arrays - important notes

* Arrays are data type that hold collection of values that have **same** type
* Every value can be accessed by unique **index** (whole number representing position)
* if **a** is array of values, then **a[i]** represents value on **[i]** index
* Length of an arrays is calculated using **array.length**
* Array's size cannot be changed once it is declared. Only its elements can be changed
* Enhanced **for loop**
  * Java has loop which is used only for arrays. It allows us to go through all array elements without using indexes
  * syntax `for(variable : collection) statement`
    * we read this as: For every element of array do some statement
  * in enhanced for variable goes through all elements, not through all indexed

```java
  //for loop to print all elements
    for(int i = 0; i < a.length; i++){
        System.out.println(a[i]);
        }
    //enchanced for to print all elements
    for(int element : a) System.out.println(element);
    
    // Arrays.toString() to print all elements

    System.out.println(Arrays.toString(a));
```

## Array sort

* Arrays class has multiple **sort** methods
* Default **Arrays.sort()** method is QuickSort algorithm 

### One dimensional arrays

* declaration `type var-name[];` or `type[] var-name;`
* When an array is declared, only a reference of an array is created.
* To create or give memory to the array, you create an array like this
    * `var-name = new type [size];`
    * Here, type specifies the type of data being allocated, size determines the number of elements in the array, and
      var-name is the name of the array variable that is linked to the array. To use new to allocate an array, you must
      specify the type and number of elements to allocate.
    * `int intArray[]; //declaring array`
    * `intArray = new int[20]; // allocating memory to array` OR
    * `int[] intArray = new int[20]; // combining both statements in one`
* The elements in the array allocated by new will automatically be initialized to zero (for numeric types), false (for
  boolean), or null (for reference types).

### Array Literal

* In a situation where the size of the array and variables of the array are already known, array literals can be used.
* `int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; `
* The length of this array determines the length of the created array.

### Accessing Java Array Elements using for Loop

* Each element in the array is accessed via its index.
* The index begins with 0 and ends at (total array size)-1.
* All the elements of array can be accessed using Java for Loop.

```java
// accessing the elements of the specified array
for(int i=0;i<arr.length;i++){
        System.out.println("Element at index "+i+" : "+arr[i]);
        }
```

### Array of Objects

* An array of objects is created like an array of primitive type data items in the following way.
* `Student[] arr = new Student[7]; //student is a user-defined class`

### Multi-dimensional arrays

* Multidimensional arrays are arrays of arrays with each element of the array holding the reference of other arrays.
* A multidimensional array is created by appending one set of square brackets ([]) per dimension.
* `int[][] intArray = new int[10][20]; //a 2D array or matrix`
* `int[][][] intArray = new int[10][20][10]; //a 3D array`
