package com.exp;

//TreeSet class elements are sorted

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		System.out.println("String:");
		TreeSet<String> tob=new TreeSet<String>();
		tob.add("vijay");
		tob.add("suji");
		tob.add("raju");
		tob.add("vimal");
		System.out.println(tob);
		
		//Individual elements to be displayed
		//Ascending
		System.out.println("Ascending order");
		Iterator<String> it=tob.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		//Descending order
		System.out.println("Descending order");
		Iterator<String> it1=tob.descendingIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		System.out.println("==============");
		System.out.println("Integer:");
		TreeSet<Integer> tob1=new TreeSet<Integer>();
		tob1.add(10);
		tob1.add(2);
		tob1.add(6);
		tob1.add(20);
		System.out.println(tob1);
		
		System.out.println("Ascending order");
		Iterator<Integer> it2=tob1.iterator();
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		System.out.println("Descending order");
		Iterator<Integer> it3=tob1.descendingIterator();
		while(it3.hasNext()) {
			System.out.println(it3.next());
		}
		
		System.out.println("==============");
		System.out.println("Double:");
		TreeSet<Double> tob2=new TreeSet<Double>();
		tob2.add(1.8);
		tob2.add(2.3);
		tob2.add(5.5);
		tob2.add(0.1);
		System.out.println(tob2);
		
		System.out.println("Ascending order");
		Iterator<Double> it5=tob2.iterator();
		while(it5.hasNext()) {
			System.out.println(it5.next());
		}
		
		System.out.println("Descending order");
		Iterator<Double> it6=tob2.descendingIterator();
		while(it6.hasNext()) {
			System.out.println(it6.next());
		}
	}
}