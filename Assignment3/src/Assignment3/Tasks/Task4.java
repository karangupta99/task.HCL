package Assignment3.Tasks;


import java.util.Hashtable;
import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.Enumeration;

public class Task4 {

    public static void main(String[] args) {

       
        // Hashtable CONSTRUCTORS
     

        // 1. Default constructor
        Hashtable<Integer, String> ht1 = new Hashtable<>();

        // 2. Constructor with initial capacity
        Hashtable<Integer, String> ht2 = new Hashtable<>(10);

        // 3. Constructor with initial capacity and load factor
        Hashtable<Integer, String> ht3 = new Hashtable<>(10, 0.75f);

        // 4. Constructor using another Map
        Hashtable<Integer, String> ht4 = new Hashtable<>(ht1);

        
        // 15 Hashtable METHODS
      

        // 1. put()
        ht1.put(1, "Java");
        ht1.put(2, "Python");
        ht1.put(3, "C++");

        // 2. get()
        System.out.println("Value of key 2: " + ht1.get(2));

        // 3. size()
        System.out.println("Size: " + ht1.size());

        // 4. containsKey()
        System.out.println("Contains key 1: " + ht1.containsKey(1));

        // 5. containsValue()
        System.out.println("Contains value Java: " + ht1.containsValue("Java"));

        // 6. remove()
        ht1.remove(3);

        // 7. isEmpty()
        System.out.println("Is Empty: " + ht1.isEmpty());

        // 8. keySet()
        Set<Integer> keys = ht1.keySet();
        System.out.println("Keys: " + keys);

        // 9. values()
        Collection<String> values = ht1.values();
        System.out.println("Values: " + values);

        // 10. entrySet()
        Set<Map.Entry<Integer, String>> entries = ht1.entrySet();
        System.out.println("Entries: " + entries);

        // 11. replace()
        ht1.replace(2, "JavaScript");

        // 12. putIfAbsent()
        ht1.putIfAbsent(4, "C");

        // 13. getOrDefault()
        System.out.println("GetOrDefault: " + ht1.getOrDefault(5, "Not Found"));

        // 14. clear()
        ht4.clear();

        // 15. Enumeration (keys)
        System.out.print("Using Enumeration: ");
        Enumeration<Integer> e = ht1.keys();
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement() + " ");
        }
        System.out.println();

        // Final Output
        System.out.println("Final Hashtable: " + ht1);
    }
}
