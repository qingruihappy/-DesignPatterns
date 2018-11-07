package com.DesignPatterns.ah.templatemethod2;

import java.io.*;

public class TeaWithHook extends CaffeineBeverageWithHook {

	public void brew() {
		System.out.println("�ÿ�ˮ���Ҷ");
	}

	public void addCondiments() {
		System.out.println("�����Ҷ������");
	}

	public boolean customerWantsCondiments() {

		String answer = getUserInput();

		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		String answer = null;

		System.out.print("��Ը������Ŀ��������������  (y/n)? ");

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = in.readLine();
		} catch (IOException ioe) {
			System.err.println("IO error trying to read your answer");
		}
		if (answer == null) {
			return "no";
		}
		return answer;
	}
}
