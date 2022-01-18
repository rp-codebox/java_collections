package Basics;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;

@SuppressWarnings("rawtypes")
public class Collections_Map {
	public static void main(String args[]) {
		// MAP
		// Sample Map
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(100, "Amit");
		map.put(101, "Vijay");
		map.put(102, "Rahul");
		map.put(99, "Sunil");
		for (Map.Entry m : map.entrySet()) {
			System.out.println("Map: " + m.getKey() + " " + m.getValue());
		}
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Map.Entry) itr.next();
			System.out.println("Map with Iterator: " + entry.getKey() + " " + entry.getValue());
		}

		// Sample HashMap
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(100, "Amit");
		hm.put(101, "Vijay");
		hm.put(102, "Rahul");
		hm.put(99, "Sunil");
		for (Map.Entry m : hm.entrySet()) {
			System.out.println("HashMap: " + m.getKey() + " " + m.getValue());
		}

		// Linked HashMap
		LinkedHashMap<Integer, String> lhmap = new LinkedHashMap<Integer, String>();
		lhmap.put(100, "Amit");
		lhmap.put(101, "Vijay");
		lhmap.put(102, "Rahul");
		lhmap.put(99, "Sunil");
		for (Map.Entry m : lhmap.entrySet()) {
			System.out.println("LinkedHashMap: " + m.getKey() + " " + m.getValue());
		}

		// Sample TreeMap
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(100, "Amit");
		tmap.put(102, "Ravi");
		tmap.put(101, "Vijay");
		tmap.put(99, "Sunil");
		for (Map.Entry m : tmap.entrySet()) {
			System.out.println("TreeMap: " + m.getKey() + " " + m.getValue());
		}

		EnumMap<Days, String> enMap = new EnumMap<Days, String>(Days.class);
		enMap.put(Days.Monday, "1");
		enMap.put(Days.Tuesday, "2");
		enMap.put(Days.Wednesday, "3");
		enMap.put(Days.Thursday, "4");
		// print the map
		for (Map.Entry m : enMap.entrySet()) {
			System.out.println("Enum: " + m.getKey() + " " + m.getValue());
		}
	}

	enum Days {
		Monday, Tuesday, Wednesday, Thursday
	}
}
