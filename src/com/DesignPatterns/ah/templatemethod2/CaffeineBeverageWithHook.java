package com.DesignPatterns.ah.templatemethod2;

public abstract class CaffeineBeverageWithHook {
 
	void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {//����
			addCondiments();
		}
	}
 
	abstract void brew();
 
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("��ˮ");
	}
 
	void pourInCup() {
		System.out.println("�Ѳ��ϵ��뱭��");
	}
 
	boolean customerWantsCondiments() {
		return true;
	}
}
