package com.DesignPatterns.am.state;

public class Study extends State {
    @Override
    public void doSth(PersonB personB) {
        // ��ˣ���Ҳ����Ҫ���´���״̬�ˣ�
        System.out.println(personB.getHour() + "�㣬��ѧϰ�أ�");
    }
}
