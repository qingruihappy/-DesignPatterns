package com.DesignPatterns.ad.factory1;
/**
 * 
 * @author qingruihappy
 * @data   2018��9��24�� ����4:42:54
 * @˵��:��ʵ�������ˡ�
 * ˼·��
 * 1�����Ƕ���һ�������࣬��Ҫ�洢�仯�Ķ�����������Ҳ����SimplePizzaFactory������ˣ�������洢��������ʱ�ž����Ķ���.
 * ��ʵ����ģ��ʼ��ģʽ������PizzaStore������ŵġ�ֻ���������ⲿ�����ݶ��Ǳ仯�ģ����Ե�������������ŵ��˹�������ȥ�ˡ�
 * 
 * 2:PizzaStore��������Ҫ��ҪSimplePizzaFactory�����ã����ݴ������Ĳ����������ǵ����Ǹ�pizza��ʵ����
 * ���һ���pizza��һЩ������ע�����ʱ����Ѿ�ȷ�������Ǹ�pizza��ʵ���ˣ����ú�ȷ���˵�pizza��ʵ���ڵ���pizza���Ӧ�ķ�����
 * 
 * 3��pizza������Ҫ����pizzaʵ����һЩ������
 * 
 * 4���ܽ�һ�仰�ܽ�����ľ��ǣ����������е�ʱ�����ݴ����PizzaStore����ݴ���Ĳ���ȥSimplePizzaFactory
 * ����ΪPizzaStore��SimplePizzaFactory��ʵ��������ȷ��Pizza������˭��ʵ�����ú󷵻أ�����PizzaStore�������ִ��
 * ������Ǿͻ����Pizza����ķ�������ΪCheesePizza�����඼�̳���Pizza���������ʱ��CheesePizzaû�еķ���������ȥ���������ҵġ�
 * ֻ��Ҫ�Ѳ�����ֵ����Pizza�����ˡ�
 * 
 * ���䣺��ʵ���൱�ڳ�����ŵ�����һ�����еĵ�����һ���ġ�
 * 
 * 5�����������ˣ���������������������ô���ء�����˵SimplePizzaFactory��������ÿ���������һ����ѽ��
 * 
 */
public class Test {
	public static void main(String[] args) {
		SimplePizzaFactory factory = new SimplePizzaFactory();
		PizzaStore store = new PizzaStore(factory);
		Pizza pizza = store.orderPizza("cheese");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
		pizza = store.orderPizza("veggie");
		System.out.println("We ordered a " + pizza.getName() + "\n");
		System.out.println(pizza);
	}
}
