package com.DesignPatterns.ar.Bridge2;
/**
 * 
 * @author qingruihappy
 * @data   2018��11��7�� ����11:42:31
 * @˵��:�������Ů
 */
public class WarmGift extends Gift{
	public WarmGift(GiftImpl impl) {
		this.impl = impl;
	}
	


	@Override
	public void woshi(MM mm) {
		System.out.println("����:"+mm.getName()+",һλ�����Ů��");	
		impl.GiftImpl();
	}
}
