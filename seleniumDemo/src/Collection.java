


import java.util.Vector;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Deque;
import java.util.Iterator;
import java.util.Stack;
import java.util.*;
import java.util.Map.Entry;

public class Collection {

	
	
	public static void main(String[] args) {
//		Vector<Integer> v = new Vector<>();
//		System.out.println(v.size());
//		v.add(5);
//		v.add(6);
//		v.add(7);
//		System.out.println(v.capacity());
//		v.add(8);
//		v.size();
//		System.out.println(v.firstElement());
//		System.out.println(v.lastElement());
//		
//     for(int i:v) {
//    	 System.out.println(i);
//     }
//		
		
		//List<String> list = new ArrayList<String>();
//		list.add("one");
//		list.add("Karan");
//		list.add("Arjun");
//		list.add("bhaiyaaaaa");
//		for(String s : list) {
//			System.out.println(s);
//		}
//		
//		list.remove(0);
//		System.out.print(list);
		
		
//		LinkedList<String> list = new LinkedList<String>();
//		list.add("null");
//		list.add("jello");
//		list.add("hello");
//		System.out.println(list);
//		for(String i : list) {
//System.out.println(i);
//		}
//list.remove();
//list.addLast("hey baby");
//System.out.println(list.size());
//
//
//
//		}
//	
	// convert aRRAYList into Array
	
//	

		//Stack folows LIFO abstract 
//		Stack<Integer> s = new Stack();
//		s.push(4);
//		s.push(4);
//		s.push(5);
//		System.out.print(s.pop());
//		System.out.print(s.pop());
		
		//QUEUE IS A INTERFACE It is A LINEAR COLLECTION    FOLLOWS FIFO PRINCIPLE
		
//				Queue<String> q = new LinkedList<>();
//				q.add("hanji");
//				q.add("hey");
//				q.add("hello");
//				System.out.print(q);
//				System.out.print(q.size());
//				System.out.print(q.contains("hey"));
//				q.clear();
		
		//DEQUEUE  IT IS A DOUBLE ENDED QUEUE  INHERITED FOR  COLLECTIONS INTERFACE  SUPPORT INSERTION AND DELETION OPERATION ON BOTH SIDES  OF THE QUEUE 
//		Deque<Integer> num = new ArrayDeque<>();
//		num.offer(1);
//		num.offerLast(2);
//		num.offerFirst(3);
//		System.out.print(num);
//		int first = num.peekFirst();
//
//				System.out.print(first);
//				 
//		     int last = num.pollFirst();
//		     System.out.print(last);
//		     int last1 = num.poll();
//		     System.out.print();
//		     int removed = num.pollLast();
//		     System.out.print(removed);
		
		
		
		//Priority Queuee 
		ArrayDeque<String> ad = new ArrayDeque<>();
		ad.push("Hey");
		ad.push("baby");
		ad.push("hello");
		ad.push("hmmmmm");
		System.out.println(ad.pop());
		while(ad.peek() != null) {
			System.out.print(ad.pop());
	}
		
		// ITERATOR USE
		ArrayList<String> a1 = new ArrayList<>();
		a1.add("hey");
		a1.add("heelooy");
		a1.add("heloooiiiiiy");
		a1.add("heyyyyiiii");
		
		System.out.print(a1);
		Iterator<String> itr = a1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		  
		//MAP IS INHERITED FROM COLLECTION INTERFACE 
		
		Map<Integer,Integer> map = new HashMap<>();
		map.put(2,5);
		map.put(1,5);
		map.put(3, 6);
		 
		for(Iterator<Entry<Integer,Integer>> iterator = map.entrySet().iterator();iterator.hasnext();)
		{
			Entry<Integer,Integer> m = iterator.next();
			System.out.print(m.getKey()+ m.getValue());
			
			
		}
				
		// TREESET Collections
		
		SortedSet set = new TreeSet();
		set.add("one");
		set.add("two");
		set.add("Three");
		Iterator i = set.iterator();
		while(i.hasNext()) {
			object lement = i.next();
			System.out.print(element);
		}
		
		     
	}
}
