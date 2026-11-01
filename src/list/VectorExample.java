
package list;

import java.util.Vector;
import java.util.Iterator;
public class VectorExample {

    public static void main(String[] args) {

        // Creating a Vector
        Vector<String> fruits = new Vector<>();

        // add(): adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original Vector: " + fruits);

        // addElement(): adding an element
        fruits.addElement("Pineapple");
        System.out.println("After addElement(): " + fruits);

        // size(): getting the number of elements
        System.out.println("Size: " + fruits.size());

        // firstElement(): getting the first element
        System.out.println("First element: " + fruits.firstElement());

        // lastElement(): getting the last element
        System.out.println("Last element: " + fruits.lastElement());

        // elementAt(): accessing an element by index
        System.out.println("Element at index 2: " + fruits.elementAt(2));

        // removeElementAt(): removing an element by index
        fruits.removeElementAt(1);
        System.out.println("After removeElementAt(): " + fruits);
        // iterator(): traversing the Vector
        Iterator<String> iterator = fruits.iterator();

        System.out.println("Using Iterator:");

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}

