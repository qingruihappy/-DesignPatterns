package com.DesignPatterns.ae.command4;

/**
 * 
 * @author qingruihappy
 * @data   2018��9��29�� ����12:30:57
 * @˵��:
 * ��ʵ������ǰ�����ָ������ڽ�����һ���װ�����ѷ�װ�õ�����ָ�����һ�����������ָ�����MacroCommand��
 * ���������ָ�����������Ϊ�������ݸ��˿��أ����ص���excute������ʱ��ͻ�ȥ����ָ��������飨MacroCommand��
 * �е���excute������������ָ������������ڽ��б�������ȥ���þ��������ָ������е�excute������
 * ע���������˼�롣
 */
public class Test {

	public static void main(String[] args) {

		RemoteControl remoteControl = new RemoteControl();

		Light light = new Light("Living Room");
		TV tv = new TV("Living Room");
		Stereo stereo = new Stereo("Living Room");
		Hottub hottub = new Hottub();

		LightOnCommand lightOn = new LightOnCommand(light);
		StereoOnCommand stereoOn = new StereoOnCommand(stereo);
		TVOnCommand tvOn = new TVOnCommand(tv);
		HottubOnCommand hottubOn = new HottubOnCommand(hottub);
		LightOffCommand lightOff = new LightOffCommand(light);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		TVOffCommand tvOff = new TVOffCommand(tv);
		HottubOffCommand hottubOff = new HottubOffCommand(hottub);

		Command[] partyOn = { lightOn, stereoOn, tvOn, hottubOn };
		Command[] partyOff = { lightOff, stereoOff, tvOff, hottubOff };

		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);

		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}
}
