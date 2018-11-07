package com.DesignPatterns.ad.factory4;

/**
 * 
 * @author qingruihappy
 * @data   2018��11��5�� ����12:43:24
 * @˵��:�������ģʽ����һ����Ʒ��Ӧ��һ����Ʒ������
 * ����һ��ȱ����ǣ������Ҳ��ϵ����Ӳ�Ʒ�ͻ᲻�ϵ�Ҫ�����Ӳ�Ʒ�������ͻ���ֹ������ĵ����
 */
public class Test {
	public static void main(String[] args) {
		VehicleFactory factory = new BroomFactory();
		Moveable m = factory.create();
		m.run();
	}
}
