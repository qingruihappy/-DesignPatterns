package com.DesignPatterns.al.Dynamic9;

import java.lang.reflect.Method;

public class TimeHandler implements InvocationHandler{
	//���target��test���д��ε�ʱ����Ѿ����������
	private Object target;



	public TimeHandler(Object target) {
		super();
		this.target = target;
	}



	@Override
	public void invoke(Object o, Method m) {
		//Object o�����o�Ǵ�������ʵ������������û�ã����������Ժ����ǲ���
		System.out.println("��������˭�أ�"+o.getClass().getName());
		long start = System.currentTimeMillis();
		System.out.println("starttime:" + start);
		try {
			//target��Ŀ���಻�Ǵ����ࡣĿ����ķ����������Ǵ�����ķ���������invoke�Ƿ������еķ����������ࣨtarget��.����(m)
			m.invoke(target);
		} catch (Exception e) {
			e.printStackTrace();
		}
		long end = System.currentTimeMillis();
		System.out.println("time:" + (end-start));
	}

}
