package com.DesignPatterns.aj.iterator3;

import java.util.ArrayList;
import java.util.Iterator;

public class PancakeHouseMenu implements Menu {
	ArrayList menuItems;
 
	public PancakeHouseMenu() {
		menuItems = new ArrayList();
    
		addItem("����2.1�����", 
				"������", 
				true,
				2.99);
	 
			addItem("����2.2�����", 
				"������", 
				true,
				2.99);
	 
			addItem("����2.3�����",
				"С����",
				true,
				3.49);
	 
	}

	public void addItem(String name, String description,
	                    boolean vegetarian, double price)
	{
		MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
		menuItems.add(menuItem);
	}
 
	public ArrayList getMenuItems() {
		return menuItems;
	}
  
	public Iterator createIterator() {
		return menuItems.iterator();//�����õ���jdk��list�ĵ�����
	}
  
}
