package Assignment3.Tasks;

import java.util.Enumeration;
import java.util.Vector;

public class Task2 {
	Vector<Integer> v1 = new Vector<>();

    Vector<Integer> v2 = new Vector<>(5);
    
    // 1. add()
    v1.add(10);
    v1.add(20);
    v1.add(30);

    // 2. addElement() Method
    v1.addElement(40);

    // 3. size() Method
    System.out.println("Size: " + v1.size());

    // 4. capacity()
    System.out.println("Capacity: " + v1.capacity());

    // 5. get() Method
    System.out.println("Element at index 1: " + v1.get(1));

    // 6. elementAt() Method
    System.out.println("ElementAt index 2: " + v1.elementAt(2));

    // 7. set() Method
    v1.set(1, 25);

    // 8. remove() Method
    v1.remove(0);

    // 9. contains()
    System.out.println("Contains 30: " + v1.contains(30));

    // 10. indexOf() Method
    System.out.println("Index of 30: " + v1.indexOf(30));

    // 11. isEmpty() Method
    System.out.println("Is Empty: " + v1.isEmpty());

    // 12. firstElement() Method 
    System.out.println("First Element: " + v1.firstElement());

    // 13. lastElement() Method
    System.out.println("Last Element: " + v1.lastElement());

    // 14. Enumeration Method Method
    System.out.print("Using Enumeration: ");
    Enumeration<Integer> e = v1.elements();
    while (e.hasMoreElements()) {
        System.out.print(e.nextElement() + " ");
    }
    System.out.println();

    // 15. sort() Method
    Collections.sort(v1);

   
    System.out.println("Final Vector: " + v1);
}
}
