
package list;

import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original list: " + fruits);

        // addFirst()
        fruits.addFirst("Pineapple");
        System.out.println("After addFirst(): " + fruits);

        // addLast()
        fruits.addLast("Grapes");
        System.out.println("After addLast(): " + fruits);

        // get()
        System.out.println("Element at index 2: " + fruits.get(2));

        // removeFirst()
        fruits.removeFirst();
        System.out.println("After removeFirst(): " + fruits);

        // removeLast()
        fruits.removeLast();
        System.out.println("After removeLast(): " + fruits);

        // size()
        System.out.println("Size: " + fruits.size());
    }
}



