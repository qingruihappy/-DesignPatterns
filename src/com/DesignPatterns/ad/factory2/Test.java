package com.DesignPatterns.ad.factory2;

/**
 * 
 * @author qingruihappy
 * @data 2018��9��24�� ����5:37:16
 * @˵��: Ϊ�˽��factory1�׳������⣬���Ǻ����׵��뵽�˶�̬����PizzaStore����һ������ķ�����
 *      Ȼ����������ͬ��NYPizzaStore��NYPizzaStoreȥʵ�־Ϳ����ˣ���������һ������淶�ķ������ǳ���ģ�
 *      ���ʱ������ʵ��ȥʵ������ӿھ����ˡ�����Pizza���ǲ���ġ�
 * 
 *      ��������ģʽ����һ����������Ľӿڣ��������������Ҫʵ������������һ�����������������ʵ�����Ƴٵ����ࡣ
 * 
 *      ����ĸ����ṩ��һ����������ķ����Ľӿڣ�Ҳ��Ϊ���������������ڳ���ĸ����У��κ���������ķ�����������ʹ�õ�
 *      �������������������Ĳ�Ʒ����֮����������ʵ���������������������Ʒ��
 * 
 *      ����ģʽ����˵�������౾ʡ����ʱ������������ָ�ڱ�д���������ǣ�����Ҫ֪��ʵ�ʴ�����Ʒ����һ����ѡ����ʹ���ĸ�����
 *      ����Ȼ�;�����ʵ�ʴ����Ĳ�Ʒ��ʲô��
 */
public class Test {

	public static void main(String[] args) {
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();

		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("cheese");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("clam");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");

		pizza = nyStore.orderPizza("veggie");
		System.out.println("Ethan ordered a " + pizza.getName() + "\n");

		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Joel ordered a " + pizza.getName() + "\n");
	}
}
