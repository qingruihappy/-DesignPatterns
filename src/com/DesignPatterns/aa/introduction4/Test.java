package com.DesignPatterns.aa.introduction4;

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
		// ����Ѽ
		RubberDuck rubberDuck = new RubberDuck();
		// �ն�Ѽ
		DecoyDuck DecoyDuck = new DecoyDuck();
		mallardDuck.quack();
		mallardDuck.swim();
		mallardDuck.display();
		mallardDuck.fly();
		System.out.println("----------------------------------------------");
		redheadDuck.quack();
		redheadDuck.swim();
		redheadDuck.fly();
		System.out.println("----------------------------------------------");
		rubberDuck.quack();
		rubberDuck.swim();
		rubberDuck.fly();
		rubberDuck.display();
		System.out.println("----------------------------------------------");
		DecoyDuck.quack();
		DecoyDuck.swim();
		DecoyDuck.fly();
		DecoyDuck.display();
	}
}
