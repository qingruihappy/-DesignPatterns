package com.DesignPatterns.ac.decorator1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo2 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Demo1.java");
		FileReader fileReader = new FileReader(file);
		// �������������ַ���
		BufferedReader bufferedReader = new BufferedReader(fileReader);
		// �������кŵĻ��������ַ���
		BufferedLineNum2 bufferedLineNum = new BufferedLineNum2(bufferedReader);
		// ���ֺŵĻ��������ַ���
		BufferedSemi2 bufferedSemi2 = new BufferedSemi2(bufferedLineNum);
		// ��˫���ŵĻ��������ַ���
		BufferedQuto2 bufferedQuto2 = new BufferedQuto2(bufferedSemi2);
		String line = null;
		while ((line = bufferedQuto2.readLine()) != null) {
			System.out.println(line);
		}
	}
}