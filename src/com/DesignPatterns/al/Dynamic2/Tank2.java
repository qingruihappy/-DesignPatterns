package com.DesignPatterns.al.Dynamic2;

/**
 * �ۺ�ʵ�֣� �ۺϣ���һ����������һ�����ʵ�֣�վ�ڴ���ĽǶ���˵���ǵ�ǰ���Ǵ����࣬�������һ�������Ŀ���࣬���ô������ʱ����ǵ���Ŀ����ķ�����
 * Tank2����Tank���࣬�����ľ���Tank��صķ�����
 * 
 * @author qingruihappy
 * @data 2018��10��31�� ����11:26:45
 * @˵��:
 */
public class Tank2 implements Moveable {
	Tank t;

	public Tank2(Tank t) {
		super();
		this.t = t;
	}

	@Override
	public void move() {
		long startTime = System.currentTimeMillis();
		t.move();
		long endTime = System.currentTimeMillis();
		System.out.println("tank�ܹ�����ʱ����" + (endTime - startTime));
	}

}
