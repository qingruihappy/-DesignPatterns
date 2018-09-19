package com.DesignPatterns.aa.introduction7;
/**
 * 
 * @author qingruihappy
 * @data   2018��9��19�� ����11:24:47
 * @˵��:���������Ĵ������ǾͿ�����ʵ�����еĹ��췽��Ҳ����Ҫʵ���������ˣ�ֻ��Ҫ��
 * �����м�һ��set�����������Ϳ����ˡ�
 * ���ǻ��ǰ���˼·��һ��
 * 1���������Ǳ����ű�Ͳ���ֿ�������ӿڱ�̵�ԭ�����Ȱѱ�Ķ���������������������̳�ͳһ�Ľӿ�Ҳ�������Ǳ���ʵ�ֵ�
 * FlyBehavior----FlyNoWay��FlyWithWings
 * QuackBehavior----Quack��Squeak��MuteQuack��
 * 2�����ʱ��ӿ��ǲ���ģ��������ǰѽӿ�FlyBehavior��QuackBehavior�ŵ������Duck������������
 * 3��������������ˣ���ô������ô����ʵ��������ѼMallardDuckʵ����������֮�������ϵ�أ�������ѵ�Ҳ�Ǿ��衣
 * 4������������Ҫȷ���ó���Duckָ������ʵ��������ѼMallardDuck�����������ö�̬Duck mallard = new MallardDuck()
 * ��ʵ�֣������������е�ʱ���������Ѽ��ʵ���ˡ�Duck����MallardDuck�ˡ�
 * 5����һ��������introduction6�Ͳ�һ���ˣ����ַ������������ڱ�̣�������ʵ������MallardDuck��Ҳû�ж���Ϊ���в���
 * �������Ǳ���Ҫȷ��FlyBehavior QuackBehaviorָ�����˭��ʵ���ˣ����ھ�����Duck�м�һ��set�����������õ�ʱ��Ͱ�set
 * ��ʵ���Ž�ȥ�����ʱ���ȷ���ˣ����������ƽ����spring������ʱ��ע���ʱ���õ�set�ķ�����
 */
public class Test {
	public static void main(String[] args) {
		Duck mallard = new MallardDuck();
		mallard.setFlyBehavior(new FlyNoWay());
		mallard.setQuackBehavior(new Quack());
		mallard.performQuack();
		mallard.performFly();
	}
}
