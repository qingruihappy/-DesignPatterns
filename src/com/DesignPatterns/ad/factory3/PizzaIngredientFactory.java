package com.DesignPatterns.ad.factory3;

/**
 * 
 * @author qingruihappy
 * @data 2018��9��24�� ����11:46:44
 * @˵��:ԭ�Ϲ���
 */
public interface PizzaIngredientFactory {

	public Dough createDough();// ��������

	public Sauce createSauce();// ������֭

	public Cheese createCheese();// ��������

	public Veggies[] createVeggies();// �����߲�

	public Pepperoni createPepperoni();// ����������㳦

	public Clams createClam();// ������

}
