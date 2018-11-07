package com.DesignPatterns.ah.templatemethod3;

public abstract class CaffeineBeverage {
  
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
 
	abstract void brew();
  
	abstract void addCondiments();
 
	void boilWater() {
		System.out.println("��ˮ");
	}
  
	void pourInCup() {
		System.out.println("�Ѳ��ϵ��뱭��");
	}
}
