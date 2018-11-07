package com.DesignPatterns.an.Responsibility3;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter {
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
