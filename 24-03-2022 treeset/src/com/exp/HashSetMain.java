package com.exp;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetMain {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(5);
		hs.add(10);
		hs.add(5);
		hs.add(2);
		hs.add(8);
		System.out.println(hs);
		System.out.println("===========");
		HashSet<String> hs1 = new HashSet<String>();
		String name="Edubridge";
		hs1.add("E");
		hs1.add("d");
		hs1.add("u");
		hs1.add("b");
		hs1.add("r");
		hs1.add("i");
		hs1.add("g");
		hs1.add("r");
		System.out.println(hs1);
	}
}
