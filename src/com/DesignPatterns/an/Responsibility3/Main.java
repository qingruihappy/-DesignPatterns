package com.DesignPatterns.an.Responsibility3;
/**
 * ������Ҫע�������һ���������м�����һ����������
 * @author qingruihappy
 * @data   2018��11��6�� ����12:15:36
 * @˵��:
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "��Һ�:)��<script>�����У�����ҵ�������ڿ�û�о�����Ϊ��������һ��";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
		  .addFilter(new SesitiveFilter())
		  ;
		//ע����������FilterChainҲȥʵ��Filter�ӿڣ������պںе�˼·�����Ļ���ʵ����
		//��һ�����飬ֱ����ԭ���������м�����һ����������ˡ��������ʵ�֡�
		FilterChain fc2 = new FilterChain();
		fc2.addFilter(new FaceFilter());
		
		fc.addFilter(fc2);
		mp.setFc(fc);
		String result = mp.process();
		System.out.println(result);
	}

}
