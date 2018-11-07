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
public class TankLog implements Moveable {
	Moveable t;

	public TankLog(Moveable t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		System.out.println("tank��ʼ��ӡ��־");
		t.move();
		System.out.println("tank��ʼ��ӡ����");
	}

}
