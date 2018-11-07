package com.DesignPatterns.al.Dynamic6;
public class TankTime implements com.DesignPatterns.al.Dynamic6.Moveable{
	Moveable t;
	public TankTime(Moveable t) {
		super();
		this.t = t;
	}
	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		System.out.println("tank��ʼ��ӡ��ʼʱ��"+startTime);
		t.move();
		long endTime = System.currentTimeMillis();
		System.out.println("tank�ܹ�����ʱ����" + (endTime - startTime));
	}
}