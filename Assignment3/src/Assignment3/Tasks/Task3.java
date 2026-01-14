package Assignment3.Tasks;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Collection;


public class Task3 {
public static void main(String[] args) {
	// 1. Default constructor
	HashMap<Integer, String> map1 = new HashMap<>();

	// 2. Constructor with initial capacity
	HashMap<Integer, String> map2 = new HashMap<>(10);

	// 3. Constructor with initial capacity and load factor
	HashMap<Integer, String> map3 = new HashMap<>(10, 0.75f);

	// 4. Constructor using another Map
	HashMap<Integer, String> map4 = new HashMap<>(map1);

	// ================================
	// 15 HashMap METHODS
	// ================================

	// 1. put()
	map1.put(1, "Java");
	map1.put(2, "Python");
	map1.put(3, "C++");

	// 2. get()
	System.out.println("Value for key 2: " + map1.get(2));

	// 3. size()
	System.out.println("Size: " + map1.size());

	// 4. containsKey()
	System.out.println("Contains key 1: " + map1.containsKey(1));

	// 5. containsValue()
	System.out.println("Contains value Java: " + map1.containsValue("Java"));

	// 6. remove()   
	map1.remove(3);

	// 7. isEmpty()
	System.out.println("Is Empty: " + map1.isEmpty());

	// 8. keySet()
	Set<Integer> keys = map1.keySet();
	System.out.println("Keys: " + keys);

	// 9. values()
	Collection<String> values = map1.values();
	System.out.println("Values: " + values);

	// 10. entrySet()
	Set<Map.Entry<Integer, String>> entries = map1.entrySet();
	System.out.println("Entries: " + entries);

	// 11. replace()
	map1.replace(2, "JavaScript");

	// 12. putIfAbsent()
	map1.putIfAbsent(3, "C");

	// 13. clear()
	map4.clear();

	// 14. getOrDefault()
	System.out.println("GetOrDefault: " + map1.getOrDefault(5, "Not Found"));

	// 15. equals()
	System.out.println("map1 equals map2: " + map1.equals(map2));

	// Final Output
	System.out.println("Final Map1: " + map1);
}
}
