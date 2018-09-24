package com.DesignPatterns.ac.decorator1;

import java.io.BufferedReader;
import java.io.IOException;

class BufferedSemi2 extends BufferedReader { // ΪʲôҪ�̳�? ��Ϊ������Щװ����Ķ��������Ϊ�������д��ݣ��ﵽ����װ�� ��Ч����
	// ���ڲ�ά��һ����װ��������á�
	BufferedReader bufferedReader;

	public BufferedSemi2(BufferedReader bufferedReader) { // new BuffereLineNum();
		super(bufferedReader);// ע�⣺ �����û���κε����ã�ֻ������Ϊ���ô��벻����
		this.bufferedReader = bufferedReader;
	}

	public String readLine() throws IOException {
		String line = bufferedReader.readLine(); // ��������ReadLine�����ǵ�����buffereLineNum��readLine�������������Ͻ����
		if (line == null) {
			return null;
		}
		line = line + ";";
		return line;
	}

}
