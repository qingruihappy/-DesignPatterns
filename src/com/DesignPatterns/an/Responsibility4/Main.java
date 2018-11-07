package com.DesignPatterns.an.Responsibility4;
/**
 * 
 * @author qingruihappy
 * @data   2018��11��6�� ����12:23:38
 * @˵��:�����Ҫ����ľ����������з��صģ�����Ҫ��ѭ�Ƚ�������߼���ջ���߼�
 * ������Ҫ�õ��˵ݹ�ķ�������ʵҲ��
 * ������дһ������˼·
 * 1�������Ȱ�HTMLFilter��SesitiveFilter�������������ص����������С�
 * 2������FilterChain��doFilter���������ǳ�ʼ��index��������0�����ʱ��index++֮��ͻ���1������������get��0����ʱ��ͻ��ȡ��
 * HTMLFilter��doFilter������ִ��HTMLFilter������滻�ķ�����
 * 3������HTMLFilterִ����֮���ִ��FilterChain�����doFilter�ķ�������Ϊ���ʱ��index��1�ˣ����ʱ����index++�����ó�2���ú�ִ��
 * SesitiveFilter�����doFilter��������ִ����SesitiveFilter������滻�ķ���֮��
 * 4�����ŵ���FilterChain�����doFilter�ķ��������ʱ����index��2�˾ͻ᷵��
 * 5������������ѭ������ջ�е��Ƚ������ԭ�򣬻ص�SesitiveFilter����ִ��response����ش���
 * 6��Ȼ���ڻص�HTMLFilter����ִ��response�ķ���
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String msg = "��Һ�:)��<script>�����У�����ҵ�������ڿ�û�о�����Ϊ��������һ��";
		Request request = new Request();
		request.setRequestStr(msg);
		Response response = new Response();
		response.setResponseStr("response");
		FilterChain fc = new FilterChain();
		fc.addFilter(new HTMLFilter())
		  .addFilter(new SesitiveFilter())
		  ;
		
		fc.doFilter(request, response, fc);
		System.out.println(request.getRequestStr());
		System.out.println(response.getResponseStr());
	}

}
