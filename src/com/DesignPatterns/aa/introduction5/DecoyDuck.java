package com.DesignPatterns.aa.introduction5;

public class DecoyDuck extends Duck implements Flyable,Quackable{
	public void display() {
		System.out.println("�����ն�Ѽ���ҵ���ɫ�ǰ�ɫ�ġ�");
	}

	@Override
	public void quack() {
		System.out.println("�����ն�Ѽ���һ����۵ĽС�");
	}

	@Override
	public void fly() {
		System.out.println("�����ն�Ѽ���һ��");
	}

}
