package com.DesignPatterns.al.Dynamic7;

import java.lang.reflect.Method;

/**
 
 * @author qingruihappy
 * @data   2018��11��1�� ����12:39:35
 * @˵��:��ȡһ���ӿ���������еķ���
 */
public class Test {
	public static void main(String[] args) {
		Method[] methods = Moveable.class.getMethods();
		for(Method m : methods) {
			System.out.println(m.getName());
		}
	}
}
