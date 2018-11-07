package com.DesignPatterns.am.state;

public class HaveDinner extends State {
    @Override
    public void doSth(PersonB personB) {
        if (personB.getHour() == 19) {
            System.out.println("�����ˣ�");
        } else {
            personB.setState(new Sleep());
            personB.doSth();
        }
    }
}
