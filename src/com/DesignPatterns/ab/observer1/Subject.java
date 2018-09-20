package com.DesignPatterns.ab.observer1;

/**
 * �����˶���֮���һ�Զ�����������һ������һ������ı�״̬ʱ���������������߶����յ�֪ͨ���Զ�����
 * 
 * @author 88403097
 * @date 2018��9��20��
 */
public interface Subject {
    // ע��
    public void registerObserver(Observer o);

    // ע��
    public void removeObserver(Observer o);

    // ֪ͨ
    public void notifyObservers();
}
