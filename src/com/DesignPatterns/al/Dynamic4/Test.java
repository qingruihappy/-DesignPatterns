package com.DesignPatterns.al.Dynamic4;
/**
 
 * @author qingruihappy
 * @data   2018��11��1�� ����12:39:35
 * @˵��:
 */
public class Test {
	public static void main(String[] args) {
		Moveable newProxyInstance = (Moveable) Proxy.newProxyInstance();
		newProxyInstance.move();
	}

}
