package Assignment3.Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Task1 {
public static void main(String[] args) {
	  ArrayList<Integer> list1 = new ArrayList<>();
	  
	  ArrayList<Integer> list2 = new ArrayList<>();
	  
	  
	  list1.add(2);
	  list1.add(3);
	  list1.add(4);
	  
	  // 2. add(index, element)
      list1.add(1, 15);

      // 3. size()
      System.out.println("Size: " + list1.size());

      // 4. get()  Method 
      System.out.println("Element at index 2: " + list1.get(2));

      // 5. set() Method
      list1.set(2, 25);

      // 6. remove(index) Method 
      list1.remove(1);

      // 7. contains() Method
      System.out.println("Contains 30: " + list1.contains(30));

      // 8. indexOf()
      System.out.println("Index of 30: " + list1.indexOf(30));

      // 9. isEmpty() Method 
      System.out.println("Is list empty: " + list1.isEmpty());

      // 10. iterator() Method
      System.out.print("Using Iterator: ");
      Iterator<Integer> itr = list1.iterator();
      while (itr.hasNext()) {
          System.out.print(itr.next() + " ");
      }
      System.out.println();

     
      // 11. addAll()
      list2.addAll(list1);

      // 12. sort()  Method
      Collections.sort(list2);

      // 13. toArray() Method
      Object[] arr = list1.toArray();
      System.out.print("Array: ");
      for (Object obj : arr) {
          System.out.print(obj + " ");
      }
      System.out.println();

      // 14. clear() Method
      

      // 15. removeAll() Method 
      list2.removeAll(list1);

      // Final Output
      System.out.println("Final list1: " + list1);
      System.out.println("Final list2: " + list2);  
	  
	  
}
}
