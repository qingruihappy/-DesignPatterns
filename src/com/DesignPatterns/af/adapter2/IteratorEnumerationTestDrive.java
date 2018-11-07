package com.DesignPatterns.af.adapter2;

import java.util.*;

public class IteratorEnumerationTestDrive {
	public static void main (String args[]) {
		ArrayList l = new ArrayList(Arrays.asList(args));
		Enumeration enumeration = new IteratorEnumeration(l.iterator());
		while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
	}
}
