package com.DesignPatterns.ar.Bridge2;
/**
 * 
 * @author qingruihappy
 * @data   2018��11��7�� ����11:42:55
 * @˵��:��Ұ����Ů
 */
public class WildGift extends Gift {
	public WildGift(GiftImpl giftImpl) {
		this.impl = giftImpl;
	}
	@Override
	public void woshi(MM mm) {
		System.out.println("����:"+mm.getName()+",һλ��Ұ��Ů��");
		impl.GiftImpl();
	}
}
