package com.DesignPatterns.an.Responsibility1;
/**
 * ��������������ģʽ�����������ģʽ��������
 * @author qingruihappy
 * @data   2018��11��5�� ����11:48:05
 * @˵��:��Ҫ���˼·���������е���������ʵ��ͬ���Ľӿڣ��ú�����е�������������һ��list����������
 * �����ڼ�һ���������Ļ��ͻ���������process�����ǲ��ñ�ģ�ֻ��Ҫ��Filter[] filters�������а��Ѿ�ʵ����
 * Filter�ӿڵ�ʵ����ӽ��������ˡ�
 * 
 * �������ڼ������������������м��ڼ�һ����������ô���أ�
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "��Һ�:)��<script>�����У�����ҵ�������ڿ�û�о�����Ϊ��������һ��";
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		
		String result = mp.process();
		System.out.println(result);
	}

}
