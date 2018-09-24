package com.DesignPatterns.ad.factory3;

/**
 * 
 * @author qingruihappy
 * @data 2018��9��25�� ����12:32:52
 * @˵��: ��ʵ�򵥵�һ�仰�������Ļ����ǣ�����ŦԼ�ˣ��Ұ���ŦԼ������������ѡ��Ҫѡ��ŦԼ�������꣬
 *      �������ڵ���ŦԼ��������֮����Ҫ�Ŀ϶���ŦԼ��ԭ���䷽������ѡ��������ʱ�� 
 *      �ҵ�����prepare�Ŀ϶��Ǵ� ŦԼ��ԭ���䷽�и���ȡ�ġ�
 */
public class Test {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		// 1,�ҵ�PizzaStore����������,��Ϊ���ʱ��nyStore��NYPizzaStore
		// 2,������NYPizzaStore��createPizza����
		// 3,��NYPizzaStore�ķ�������NYPizzaIngredientFactoryʵ�����������ʱ�������
		System.out.println("��ɣ���� " + pizza + "=======");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("�Ƕ����� " + pizza + "=======");

		pizza = nyStore.orderPizza("clam");
		System.out.println("��ɣ���� " + pizza + "=======");

		pizza = chicagoStore.orderPizza("clam");
		System.out.println("�Ƕ����� " + pizza + "=======");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("��ɣ����" + pizza + "=======");

		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("�Ƕ�����" + pizza + "=======");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("��ɣ����" + pizza + "=======");

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("�Ƕ�����" + pizza + "=======");
	}
}
