package com.DesignPatterns.am.state;

public class GetUp extends State{
	/**
	 * ���������״̬��ɫ��ʵ��״̬�࣬
	 */
	@Override
	public void doSth(PersonB personB) {
		if (personB.getHour() == 7) {
			System.out.println("������");
		} else {
			// ת��״̬
			personB.setState(new HaveLunch());
			// ����Ҫ������Ϊ
			personB.doSth();
		}
	}
}
