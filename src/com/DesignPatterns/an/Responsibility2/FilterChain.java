package com.DesignPatterns.an.Responsibility2;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * @author qingruihappy
 * @data   2018��11��6�� ����12:10:42
 * @˵��:�������Ҫ��������ӹ��������������������
 */
public class FilterChain {
	List<Filter> filters = new ArrayList<Filter>();
	/*ע��������÷������Ƿ��ص����౾���������ǾͿ�����fc.addFilter(new HTMLFilter())
	  .addFilter(new SesitiveFilter())�����������ı��뷽ʽ�ˡ�
	  ;*/
	public FilterChain addFilter(Filter f) {
		this.filters.add(f);
		return this;
	}
	
	public String doFilter(String str) {
		String r = str;
		for(Filter f: filters) {
			r = f.doFilter(r);
		}
		return r;
	}
}
