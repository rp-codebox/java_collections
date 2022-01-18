package Basics;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Collections_Set {
	public static void main(String args[]) {
		// SET
		// Sample Set
		Set<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Ravi");
		set.add("Ajay");
		for (String str : set) {
			System.out.println("Set item: " + str);
		} // - Unique elements

		// Sample HashSet
		HashSet<String> hset = new HashSet<String>();
		hset.add("Ravi");
		hset.add("Vijay");
		hset.add("Ravi");
		hset.add("Ajay");
		for (String str : hset) {
			System.out.println("HashSet item: " + str);
		} // - Unique elements

		// Sample Set - Linked Hash Set
		Set<String> hset1 = new LinkedHashSet<String>();
		hset1.add("Ravi");
		hset1.add("Vijay");
		hset1.add("Ravi");
		hset1.add("Ajay");
		for (String str : hset1) {
			System.out.println("Linked Set item: " + str);
		}

		// Sample Linked Hash Set
		LinkedHashSet<String> lhset = new LinkedHashSet<String>();
		lhset.add("Ravi");
		lhset.add("Vijay");
		lhset.add("Ravi");
		lhset.add("Ajay");
		for (String str : lhset) {
			System.out.println("LinkedHashSet item: " + str);
		}

		// Tree Set - Unique and Sorted set
		Set<String> tset = new TreeSet<String>();
		tset.add("Ravi");
		tset.add("Vijay");
		tset.add("Ravi");
		tset.add("Ajay");
		for (String str : tset) {
			System.out.println("TreeSet item: " + str);
		}
		
		// Tree Set - Unique and Sorted set
		Set<String> tset1 = new TreeSet<String>();
		tset1.add("Ravi");
		tset1.add("Vijay");
		tset1.add("Ravi");
		tset1.add("Ajay");
		for (String str : tset1) {
			System.out.println("TreeSet 2 item: " + str);
		}		
	}
}
