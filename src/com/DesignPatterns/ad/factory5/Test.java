package com.DesignPatterns.ad.factory5;
/**
 * 
 * @author qingruihappy
 * @data   2018��11��5�� ����12:50:24
 * @˵��:����˵����ģʽ��һ����Ʒ��Ӧ��һ����Ʒ�����Ļ�����ô���󹤳�ģʽ����һ���Ʒ��Ӧ��һ����Ʒ������
 * ���󹤳�ģʽҲ��ȱ�㣬���Ǽ���Ҫ�����µĲ�ƷƷ�ֵ�ʱ��Ķ��ĵط�Ҳ�Ƚϴ�
 * ����������еĹ�����Ҫ��һ������ͷ���ķ�������ô��ǰ��ֻҪʵ����AbstractFactory�Ĺ�����Ҫ���б��������Υ����
 * ���ģʽ�Ķ��޸Ĺرգ����������ŵ�ԭ��
 * ��ʲô�õķ�����
 * ��������һ��spring�ṩ�Ĵ���bean��ԭ��ʵ�֡�
 */
public class Test {
	public static void main(String[] args) {
		//DefaultFactory f = new DefaultFactory();
		AbstractFactory f = new DefaultFactory();
		Vehicle v = f.createVehicle();
		v.run();
		Weapon w = f.createWeapon();
		w.shoot();
		Food a = f.createFood();
		a.printName();
	}
}
