package com.DesignPatterns.al.Dynamic4;

public class Proxy {
public static Object newProxyInstance() {
	String src=
	"package com.DesignPatterns.al.Dynamic4;"+

	"public class TankTime implements Moveable {"+
		"Moveable t;"+

		"public TankTime(Moveable t) {"+
			"super();"+
			"this.t = t;"+
		"}"+

		"@Override"+
		"public void move() {"+

			"long startTime = System.currentTimeMillis();"+
			"System.out.println(\"tank��ʼ��ӡ��ʼʱ��\"+startTime);"+
			"t.move();"+
			"long endTime = System.currentTimeMillis();"+
			"System.out.println(\"tank�ܹ�����ʱ����\"" + "(endTime - startTime));"+
		"}"+

	"}";

	return null;
	
}
}
