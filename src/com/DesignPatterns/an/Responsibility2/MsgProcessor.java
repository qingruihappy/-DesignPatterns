package com.DesignPatterns.an.Responsibility2;
/**
 * �������Ҫ����������FilterChain��
 * @author qingruihappy
 * @data   2018��11��6�� ����12:11:34
 * @˵��:
 */
public class MsgProcessor {
	private String msg;
	
	FilterChain fc;
	
	public FilterChain getFc() {
		return fc;
	}

	public void setFc(FilterChain fc) {
		this.fc = fc;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String process() {
		
		
		return fc.doFilter(msg);
		
		
	}
}
