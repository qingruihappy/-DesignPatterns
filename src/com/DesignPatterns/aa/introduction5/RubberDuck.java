package com.DesignPatterns.aa.introduction5;

/**
 * 
 * @author qingruihappy
 * @data 2018��9��18�� ����11:40:07
 * @˵��: ��������Ѽ���Ҳ���ɵġ�
 */
public class RubberDuck extends Duck implements Flyable,Quackable{
	public void display() {
		System.out.println("��������Ѽ���ҵ���ɫ�ǻ�ɫ�ġ�");
	}

	@Override
	public void quack() {
		System.out.println("��������Ѽ���һ����ݵĽС�");
	}

	@Override
	public void fly() {
		System.out.println("��������Ѽ���Ҳ����");
	}

}
