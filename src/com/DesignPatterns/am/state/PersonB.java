package com.DesignPatterns.am.state;

public class PersonB {
    /**
     * �������һ���ֱ�������ʱ��仯��״̬�޸ģ���������ʱ��ʲô���ı���Ϊ��
     */
    private int hour;

    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public PersonB() {
        // �ڹ��������ʼ��״̬�����糿�𴲿�ʼ
        this.state = new GetUp();
    }

    /**
     * �ˣ������ࣩ�ĸ���Ϊ
     *
     * ״̬ģʽ����ͨ���ı�һ��������ڲ�״̬�����ı�������Ϊ�������޸��˶������һ����
     */
    public void doSth() {
        // �������PersonB�Ķ���
        state.doSth(this);
        // ÿ�ζ���ͷ��ʼ����״̬��
        this.state = new GetUp();
    }
}