## General

* Collection in Java is framework that provides an architecture to store and manipulate the group of object
* operations: search, sort, insert, manipulate, delete
* Collection = single unit of objects
* Interfaces
  * Set
  * List
  * Queue
  * Deque
* Classes
  * ArrayList
  * Vector
  * LinkedList
  * PriorityQueue
  * HashSet
  * LinkedHashSet
  * TreeSet
  
## Methods of Collection Interface

* `boolean add(e)` - insert element in collection
* `boolean addAll(Collection <? extends E> c)`  insert collection elements in invoking collection
* `boolean remove(Object element)` delete an element
* `boolean removeAll(collection <?> c)` - delete all the elements 
* `boolean removeIf(Predicate<? super E> filter)` - delete all the elements of the collection that satisfy the specified predicate.
* `boolean retainAll(Collection<?> c)` - delete all the elements of invoking collection except the specified collection
* `int size()` - returns the total number of elements in the collection.
* `void clear()` - removes the total number of elements from the collection.
* `boolean contains(Object element)` - used to search an element.
* `boolean containsAll(Collection<?> c)` - to search the specified collection in the collection.
* `Iterator iterator()` returns an iterator.
* `Object[] toArray()` -  converts collection into array.
* `public <T> T[] toArray(T[] a)` - It converts collection into array. Here, the runtime type of the returned array is that of the specified array.
* `boolean isEmpty()` - checks if collection is empty.
* `Stream<E> parallelStream()` - returns a possibly parallel Stream with the collection as its source.
* `Stream<E> stream()` - returns a sequential Stream with the collection as its source.
* `Spliterator<E> spliterator()` - generates a Spliterator over the specified elements in the collection.
* `boolean equals(Object element)` - matches two collections.
* `int hashCode()` - returns the hash code number of the collection.

## ArrayList

* implements the List interface
* no size limit(array has size limit)
* The ArrayList class **maintains** the insertion **order** and is non-synchronized. 
* The elements stored in the ArrayList class can be **randomly** accessed.
* We can **add** or **remove** elements **anytime**
* **can** **have** the **duplicate** elements.
* We can not create an array list of the primitive types, such as int, float, char, etc. It is required to use the required wrapper class in such cases.
  * Example
```java 
    ArrayList<int> al = ArrayList<int>(); // does not work  
    ArrayList<Integer> al = new ArrayList<Integer>(); // works fine  
    ArrayList<String> list=new ArrayList<String>();//creating new generic arraylist. Now ArrayList is forced to have the only specified type of object in it. If you try to add another type of object, it gives a compile-time error.
```
* Constructors of ArrayList
```java
    ArrayList();
    ArrayList(Collection<? extends E> c)
    ArrayList(int capacity)
```
* Array list items start at index 0
* to get element we use `list.get(index)`
* to change element we use `list.set(index, "with-what"")`
* to sort collections we use `Collections.sort(list)`

## LinkedList

* Java LinkedList class uses a doubly linked list to store the elements.
* faster than ArrayList
* some specific methods such as: 
  * `clone()`
  * `peek()` - retrieves the first element of a list
  * `peekFirst()`
  * `peekLast()`
  * `poll()` - retrieves and removes the first element of a list.
  * `pollFirst()`
  * `pollLast()`
  * `pop()` - pops an element from the stack represented by a list.
  * `removeFirstOccurrence()` - remove the first occurrence of the specified element in a list
  * `removeLastOccurrence()`

```java
    //constructors
    LinkedList()
    LinkedList(Collection<? extends E> c)
```

## List Interface

* the child interface of Collection interface
* List is an interface whereas ArrayList is the implementation class of List.
* It inhibits a list type data structure in which we can store the **ordered** collection of objects
* It **can have duplicate** values.
```java
        List <data-type> list1= new ArrayList();
        List <data-type> list2 = new LinkedList();
        List <data-type> list3 = new Vector();
        List <data-type> list4 = new Stack();  
```

* Array can be converted to List and vice versa

```java
    String[] array={"Java","Python","PHP","C++"};
    List<String> list=new ArrayList<String>();
    for(String lang:array){
    list.add(lang);
    }
    System.out.println("Printing List: "+list);  
    
    // List to array
    String[] array = fruitList.toArray(new String[fruitList.size()]);
    System.out.println("Printing Array: "+Arrays.toString(array));  
```

## Map Interface

* A map contains values on the basis of key, i.e. **key and value** pair.
* Each key and value pair is known as an entry. 
* A Map contains **unique** **keys**.
* A Map doesn't allow duplicate keys, but you can have duplicate values. 
* HashMap and LinkedHashMap allow null keys and values, but TreeMap doesn't allow any null key or value.
* A Map can't be traversed, so you need to convert it into Set using keySet() or entrySet() method.
* **HashMap** - it doesn't maintain any order
* **LinkedHashMap** - it inherits HashMap class. It maintains insertion order
* **TreeMap** - implementation of Map and SortedMap. It maintains ascending order.

## Iterator Interface

* provides the facility of iterating the elements in a forward direction only. 
* methods
  * `boolean hasNext()` - returns true if the iterator has more elements otherwise it returns false.
  * `Object next()` - returns the element and moves the cursor pointer to the next element.
  * `void remove()` - removes the last elements returned by the iterator. It is less used.

## Methods for Collection iteration

* By `Iterator interface`.
* By `for-each` loop.
* By `ListIterator interface`.
* By `for loop`.
* By `forEach()` method.
* By `forEachRemaining()` method.