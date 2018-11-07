package com.DesignPatterns.aj.iterator2;

import java.util.*;

public class CafeMenu implements Menu {
	Hashtable menuItems = new Hashtable();
  
	public CafeMenu() {
		addItem("map3.1�緹",
			"����",
			true, 3.99);
		addItem("map3.2�緹",
			"Ѽ��",
			false, 3.69);
		addItem("map3.3�緹",
			"����",
			true, 4.29);
	}
 
	public void addItem(String name, String description, 
	                     boolean vegetarian, double price) 
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
 
	public Hashtable getItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return menuItems.values().iterator();//�����õ���map��jdk�Դ��ĵ�����
	}
}
