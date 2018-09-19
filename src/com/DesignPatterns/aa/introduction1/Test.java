package com.DesignPatterns.aa.introduction1;

/**
 * 
 * @author qingruihappy
 * @data 2018��9��18�� ����11:29:22
 * @˵��: ������
 */
public class Test {
	public static void main(String[] args) {
		// Ұ��Ѽ
		MallardDuck mallardDuck = new MallardDuck();
		// ��ͷѼ
		RedheadDuck redheadDuck = new RedheadDuck();
		mallardDuck.quack();
		mallardDuck.swim();
		mallardDuck.display();
		System.out.println("----------------------------------------------");
		redheadDuck.quack();
		redheadDuck.swim();
		redheadDuck.display();
	}
}
