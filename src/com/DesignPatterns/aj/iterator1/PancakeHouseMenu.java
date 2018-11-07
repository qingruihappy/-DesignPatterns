package com.DesignPatterns.aj.iterator1;

import java.util.ArrayList;

public class PancakeHouseMenu  {
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
		return new PancakeHouseMenuIterator(menuItems);
	}
  
	public String toString() {
		return "Objectville Pancake House Menu";
	}

	// other menu methods here
}
