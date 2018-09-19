package com.DesignPatterns.aa.introduction5;

/**
 * 
 * @author qingruihappy
 * @data 2018��9��18�� ����11:26:12
 * @˵��: ��ͷ����Ѽ�̳и���
 */
public class RedheadDuck extends Duck implements Flyable,Quackable {

	public void display() {
		System.out.println("���Ǻ�ͷѼ���ҵ���ɫ�Ǻ�ɫ�ġ�");
	}

	@Override
	public void quack() {
		System.out.println("���Ǻ�ͷѼ���ҵĻṾ���ĽС�");
		
	}

	@Override
	public void fly() {
		System.out.println("���Ǻ�ͷѼ���һ��");
		
	}
}
