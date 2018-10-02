package com.DesignPatterns.ae.command3;

/**
 * 
 * @author qingruihappy
 * @data   2018��9��28�� ����11:53:23
 * @˵��:
 *����˵���˾�����
 *����1������ĽӿڵĹ淶���ֶ����һ�������ĳ���ķ���
 *����2���ڿ�����һ������������ָ��Ķ���󣬾ͻ���������ָ��Ķ���ֵ���ӿ��Ƕ����ȫ�ֱ�����������¼��
 *����3��һ�����ó���������ͻ��õ�����¼������ָ����󷢳���Ӧ��ָ��Ӷ�ʵ����һ�ε����
 *����4�����ʱ��Ҳ��Ҫ������ָ��Ķ����м�¼��һ�εĵ��õ�ʵ��������Ҳ���Բ��õģ���
 *ΪʲôҪ�ǲ����أ���Ϊ����������һ���Ƿ������з磬���ڵ��ɸ߷��ˣ��������ڼ��糷��������֪�����ڵ��õ���
 *�з�����������Ҳ�����з�ķ����ˣ�����û�б�Ҫ��¼�ġ�����˵�����������Ż��ġ�
 */
public class Test {

	public static void main(String[] args) {
		RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

		Light livingRoomLight = new Light("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		CeilingFan ceilingFan = new CeilingFan("Living Room");

		CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
		CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
		remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();

		remoteControl.onButtonWasPushed(1);
		System.out.println(remoteControl);
		remoteControl.undoButtonWasPushed();
	}
}
