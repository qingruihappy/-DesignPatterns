package com.DesignPatterns.ah.templatemethod2;

public class Test {
	public static void main(String[] args) {

 
		TeaWithHook teaHook = new TeaWithHook();
		CoffeeWithHook coffeeHook = new CoffeeWithHook();
 
		System.out.println("\n�ڶ���������Ҷ�С�����������");
		teaHook.prepareRecipe();
 
		System.out.println("\n�ڶ������������С�����������");
		coffeeHook.prepareRecipe();
	}
}
