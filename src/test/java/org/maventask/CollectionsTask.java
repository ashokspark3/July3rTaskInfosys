package org.maventask;

import java.util.ArrayList;
import java.util.List;

public class CollectionsTask {

	public static void main(String[] args) {
		
		List l=new ArrayList();
		l.add("ashok");
		l.add(4);
		l.add('f');
		System.out.println(l);
		int size = l.size();
		System.out.println(size);
	int indexOf = l.indexOf(4);
	System.out.println(indexOf);
	int lastIndexOf = l.lastIndexOf(4);
	System.out.println(lastIndexOf);
	boolean contains = l.contains("ter");
	System.out.println(contains);
	}
}
