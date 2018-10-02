package com.DesignPatterns.ae.command1;

//
// This is the invoker
//
public class SimpleRemoteControl {
	Command slot;// ��һ����۳���������������������豸

	public SimpleRemoteControl() {
	}

	public void setCommand(Command command) {
		slot = command;
	}

	public void buttonWasPressed() {
		slot.execute();
	}
}
