package fundamentals;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Milk");
        list.add("Bread");
        list.add("Banana");
        list.add("Grapes");

        System.out.println(list);
        //get the iterator
        for (String s : list) { //same as commented while
            System.out.println(s); //print element and move to next
        }
        /*
        while (i.hasNext()) { //same as enhanced for
            System.out.println(i.next()); //print element and move to next
        }
         */

        list.add("Change me");
        System.out.println("Element that needs to be changed: " + list.get(4));
        list.set(4, "Now changed");
        for (String fruit:list) {
            System.out.println(fruit);
        }
        Collections.sort(list);
        System.out.println("Sorted list" + list);

        /*
        List of numbers
         */
        List<Integer> list2=new ArrayList<>();
        list2.add(21);
        list2.add(11);
        list2.add(51);
        list2.add(1);
        //Sorting the list
        Collections.sort(list2);
        //Traversing list through the for-each loop
        for(Integer number:list2)
            System.out.println(number);
    }
}

