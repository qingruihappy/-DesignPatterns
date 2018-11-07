package com.DesignPatterns.al.Dynamic1;

/**
 * �ü̳м���tank��move������ʱ��
 * 
 * @author qingruihappy
 * @data 2018��10��31�� ����11:19:43
 * @˵��:
 */
public class Tank1 extends Tank {

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		super.move();
		long endTime = System.currentTimeMillis();
		System.out.println("tank�ܹ�����ʱ����" + (endTime - startTime));
	}

}
