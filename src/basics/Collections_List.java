package Basics;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;

import java.util.Iterator;

public class Collections_List {
	public static void main(String args[]) {
		// LIST

		// Sample List
		List<String> list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Raj");
		list.add("Ajay");
		for (String str : list) {
			System.out.println("List item: " + str);
		}
		
		// Sample ArrayList
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Ravi");
		alist.add("Vijay");
		alist.add("Raj");
		alist.add("Ajay");
		for (String str : alist) {
			System.out.println("ArrayList item: " + str);
		}
		// ListIterator interface
		ListIterator<String> iterator = alist.listIterator();
		while(iterator.hasNext()) {
			String a = iterator.next();
			System.out.println("ListIterator: " + a);
		}
		
		// Sample LinkedList
		LinkedList<String> llist = new LinkedList<String>();
		llist.add("Ravi");
		llist.add("Vijay");
		llist.add("Ravi");
		llist.add("Ajay");
		for (String str : llist) {
			System.out.println("LinkedList item: " + str);
		}
		
		//Sample ArrayList Add all
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		al.addAll(al2);// adding second list in first list
		
		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
