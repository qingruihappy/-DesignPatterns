package com.DesignPatterns.ai.composite1;

public class MenuTestDrive {
	public static void main(String args[]) {

		MenuComponent pancakeHouseMenu = 
			new Menu("�˵�1", "���");
		MenuComponent dinerMenu = 
			new Menu("�˵�2", "���");
		MenuComponent cafeMenu = 
			new Menu("�˵�3", "���");
		MenuComponent dessertMenu = 
			new Menu("�˵�2.4", "���-----����");
  
		MenuComponent allMenus = new Menu("���еĲ˵�", "���еĲ͵�");
  
		allMenus.add(pancakeHouseMenu);
		allMenus.add(dinerMenu);
		allMenus.add(cafeMenu);
  
		pancakeHouseMenu.add(new MenuItem(
			"1.1�����", 
			"����䳴������˾", 
			true,
			2.99));
		pancakeHouseMenu.add(new MenuItem(
			"1.2�����", 
			"����Ӽ嵰���㳦", 
			true,
			2.99));
		pancakeHouseMenu.add(new MenuItem(
			"1.3�����",
			"�����ʵ���ݮ����ݮ�ǽ����ļ��",
			true,
			3.49));

		dinerMenu.add(new MenuItem(
			"2.1�����",
			"ȫ����������˺�������", 
			true, 
			2.99));
		dinerMenu.add(new MenuItem(
			"2.2�����",
			"ȫ����������˺����������", 
			true, 
			2.99));
		dinerMenu.add(new MenuItem(
			"2.3�����",
			"ÿ��һ���������һ������ɳ��", 
			true, 
			3.29));

   
		dinerMenu.add(dessertMenu);
  
		dessertMenu.add(new MenuItem(
			"2.4.1:���-----����",
			"ƻ���ɣ���Ƥ����������ݱ����",
			true,
			1.59));
		dessertMenu.add(new MenuItem(
			"2.4.2:���-----����",
			"ŦԼ����֥ʿ���⣬�ɿ���ȫ�����",
			true,
			1.99));
		dessertMenu.add(new MenuItem(
			"2.4.3:���-----����",
			"һ�׸����Ӻ�һ�����",
			true,
			1.89));

		cafeMenu.add(new MenuItem(
			"3.1:���",
			"��ʳ������ȫ����������ˡ�������������",
			true, 
			3.99));
		cafeMenu.add(new MenuItem(
			"3.2:���",
			"һ��������������һ��ɳ��",
			true, 
			3.69));
		cafeMenu.add(new MenuItem(
			"3.3:���",
			"һ�ݴ�ݵ�ī����������������ƽ�ж���ɯɯ�������潴",
			true, 
			4.29));
 
		Waitress waitress = new Waitress(allMenus);
   
		waitress.printVegetarianMenu();
 
	}
}
