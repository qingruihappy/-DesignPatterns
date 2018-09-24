package com.DesignPatterns.ac.decorator1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		File file = new File("F:\\Demo1.java");
		//�������ݵ�����ͨ��
		FileReader fileReader = new FileReader(file);
		//�������кŵĻ��������ַ���
		BufferedLineNum bufferedLineNum = new BufferedLineNum(fileReader);
		//���зֺŵĻ��������ַ���
		BufferedSemi bufferedSemi = new BufferedSemi(fileReader);
		//����˫���ŵĻ��������ַ���
		BufferedQuto bufferedQuto = new BufferedQuto(fileReader);
		String line = null;
		while((line = bufferedQuto.readLine())!=null){
			System.out.println(line);
		}
	}
}
