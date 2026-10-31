
package list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {

        // Creating an ArrayList
        List<String> fruits = new ArrayList<>();

        // add(): adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original list: " + fruits);

        // get(): accessing an element
        System.out.println("Element at index 1: " + fruits.get(1));

        // set(): replacing an element
        fruits.set(1, "Pineapple");
        System.out.println("After set(): " + fruits);

        // remove(): removing an element
        fruits.remove("Mango");
        System.out.println("After remove(): " + fruits);

        // size(): getting the number of elements
        System.out.println("Size: " + fruits.size());

        // contains(): checking whether an element exists
        System.out.println("Contains Apple? " + fruits.contains("Apple"));

        // isEmpty(): checking whether the list is empty
        System.out.println("Is the list empty? " + fruits.isEmpty());

        // iterator(): traversing the list
        Iterator<String> iterator = fruits.iterator();

        System.out.println("Using Iterator:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

