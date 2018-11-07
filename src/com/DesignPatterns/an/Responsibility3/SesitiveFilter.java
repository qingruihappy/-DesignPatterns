package com.DesignPatterns.an.Responsibility3;

public class SesitiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		//process the sensitive words
		String r = str.replace("����ҵ", "��ҵ")
			 .replace("����", "");
		
		return r;
	}

}
