package com.DesignPatterns.aa.introduction5;

/**
 * 
 * @author qingruihappy
 * @data 2018��9��18�� ����11:25:18
 * @˵��: Ұ��Ѽ�̳и���Duck
 */
public class MallardDuck extends Duck implements Flyable,Quackable {


	public void display() {
		System.out.println("����Ұ��Ѽ���ҵ���ɫ����ɫ�ġ�");
	}

	@Override
	public void quack() {
		System.out.println("����Ұ��Ѽ���һ����ɵĽС�");
	}

	@Override
	public void fly() {
		System.out.println("����Ұ��Ѽ���һ�ɡ�");
	}
}
