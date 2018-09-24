package com.DesignPatterns.ac.decorator1;

import java.io.BufferedReader;
import java.io.IOException;

public class BufferedQuto2 extends BufferedReader {
	// ���ڲ�ά��һ����װ�ε���
	BufferedReader bufferedReader;

	public BufferedQuto2(BufferedReader bufferedReader) { // new BufferedSemi2();
		super(bufferedReader); // ֻ��Ϊ���ô��벻����..
		this.bufferedReader = bufferedReader;
	}

	public String readLine() throws IOException {
		String line = bufferedReader.readLine(); // ��������ReadLine�����ǵ�����buffereLineNum��readLine�������������Ͻ����
		if (line == null) {
			return null;
		}
		line = "\"" + line + "\"";
		return line;
	}

}
