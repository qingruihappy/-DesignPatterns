package com.DesignPatterns.al.Dynamic3;

/**
 * ����������˵һ��Ϊʲô��ʵ�֣��ۺϣ������ü̳С�
 * ���Ҫ��˵������ʵ�ֽ����Ϊ���ģʽ��Ҫ������������̶�����ʵ�ֱ��
 * ���ģʽ����һ��Ҫ����ǣ����ü̳У�������ϡ�
 * �������Ǿ�����˵����
 * 
 * @author qingruihappy
 * @data 2018��10��31�� ����11:26:45
 * @˵��:
 */
public class TankTime implements Moveable {
	Moveable t;

	public TankTime(Moveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		System.out.println("tank��ʼ��ӡ��ʼʱ��");
		long startTime = System.currentTimeMillis();
		t.move();
		long endTime = System.currentTimeMillis();
		System.out.println("tank��ʼ��ӡ����ʱ��");
		System.out.println("tank�ܹ�����ʱ����" + (endTime - startTime));
	}

}
