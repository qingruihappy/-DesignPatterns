package com.DesignPatterns.an.Responsibility1;

public class SesitiveFilter implements Filter {

	@Override
	public String doFilter(String str) {
		String r = str.replace("����ҵ", "��ҵ")
			 .replace("����", "");
		
		return r;
	}

}
