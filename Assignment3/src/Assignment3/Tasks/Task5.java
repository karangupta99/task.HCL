package Assignment3.Tasks;


import java.util.TreeMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;

public class Task5 {

    public static void main(String[] args) {

    
        // TreeMap CONSTRUCTORS
       

        // 1. Default constructor (Natural sorting order)
        TreeMap<Integer, String> tm1 = new TreeMap<>();

        // 2. Constructor with another Map
        TreeMap<Integer, String> tm2 = new TreeMap<>(tm1);

        // 3. Constructor with SortedMap
        TreeMap<Integer, String> tm3 = new TreeMap<>(tm1);

        // 4. Constructor with Comparator (Reverse Order)
        TreeMap<Integer, String> tm4 = new TreeMap<>((a, b) -> b - a);

       
        // 15 TreeMap METHODS
       

        // 1. put() Method
        tm1.put(3, "C++");
        tm1.put(1, "Java");
        tm1.put(2, "Python");

        // 2. get() Method
        System.out.println("Value for key 2: " + tm1.get(2));

        // 3. size() Method
        System.out.println("Size: " + tm1.size());

        // 4. containsKey() Method
        System.out.println("Contains key 1: " + tm1.containsKey(1));

        // 5. containsValue()
        System.out.println("Contains value Java: " + tm1.containsValue("Java"));

        // 6. remove()
        tm1.remove(3);

        // 7. isEmpty()
        System.out.println("Is Empty: " + tm1.isEmpty());

        // 8. keySet()
        Set<Integer> keys = tm1.keySet();
        System.out.println("Keys: " + keys);

        // 9. values()
        Collection<String> values = tm1.values();
        System.out.println("Values: " + values);

        // 10. entrySet()
        Set<Map.Entry<Integer, String>> entries = tm1.entrySet();
        System.out.println("Entries: " + entries);

        // 11. firstKey()
        System.out.println("First Key: " + tm1.firstKey());

        // 12. lastKey()
        System.out.println("Last Key: " + tm1.lastKey());

        // 13. higherKey()
        System.out.println("Higher key than 1: " + tm1.higherKey(1));

        // 14. lowerKey()
        System.out.println("Lower key than 2: " + tm1.lowerKey(2));

        // 15. getOrDefault()
        System.out.println("GetOrDefault: " + tm1.getOrDefault(5, "Not Found"));

        System.out.println("Final TreeMap: " + tm1);
}
}