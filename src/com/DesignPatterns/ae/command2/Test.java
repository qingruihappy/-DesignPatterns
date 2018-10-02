package com.DesignPatterns.ae.command2;

/**
 * 
 * @author qingruihappy
 * @data 2018��9��28�� ����10:43:45
 * @˵��:
 * 
 * 		һ������==ң����==������
 * 
 *      ������ô��һ�����ؿ��ƶ��һ��ؼ���ÿ���ؼ��л������в�ͬ�Ĳ�����
 *      һ�����ؿ��ƶ���ؼ��������ڿ����м������飨�򼯺ϣ���ÿ���ؼ��в�ͬ�Ĳ������ж��ٸ������ͼ�����ٸ�����
 * 
 *      ��������һ����ť����ȥ���ж�������Ļ����������������е�cd�����ӣ����¿����ᴥ��1���򿪿���2�����ó�cdģʽ3��Ĭ��������11.����
 *      ��ֱ���������excute�����е���ʵ������������������ˡ�
 * 
 *      �ģ�������ÿһ����ť�������ù��ܵģ���˵˵����7����ť������4567�Ű�ť�����ڻ�û�������ʲô�ط���ô���أ�������Ԥ�ڵ������óɲ������κη����İ�ť
 *      ��ô���أ�
 *      ���ھ���дһ���������NoCommand����ͬ��ʵ��Command�������ķ����ǿյģ���������ʵ�������ض���RemoteControl����ʱ�������������������
 *      Ԫ�ض�Ĭ��������ն��󣬼�����治�ǿն���Ļ��ͻḲ�ǣ������ǿն���Ļ��Ͳ��Ḳ���ˣ����ǿշ�����
 *      
 *      �壺���������Ǿ͸�����̵����ӿڵ������ˣ����Ƕ���һ���淶���õ����ߺͱ������߶�ʵ������ӿڣ��Ӷ����ɸ������飬�������棬�����ֿ���ͨ��
 *      ����ӿڴﵽ��ϵ��Ч����
 *      ������������֮ǰ�Լ����Ļص���������ζ��
 *      �ص�������Ȼ����ϵͳ���õģ�������ͱ��밴��ϵͳ������ԭ����ʵ�ֳ���
 *      ������Aȥ����B������A��һЩ����������B��B�������Լ���ҵ���߼�����֮��ѷ��صĽ������A������B��ô����A�أ�����ҪBȥ����A���
 *      ����������B��ô֪��A������ʲô�����أ���Ϊ��һ�㶼����������Ա�����飬���ʱ�����Ҫ����淶�ˣ�����һ���ӿڣ�Bͨ������ӿ�ȥ����A
 *      ����ķ�������AҲ����ʵ������ӿڣ����ʵ�ֵķ����ͽ����ص���������������߼����ǲ��ѷ��֣������ǵ�Aȥ����B��ʱ����ð��Լ��ı�ʾ���Ŵ�
 *      ��ȥ�����ʱ��B�Ѵ������߼�֮��Ϳ���ͨ����ʶ��������ʵ����֪������˭�ģ�A�������ˡ�
 * 
 */
public class Test {

	public static void main(String[] args) {
		RemoteControl remoteControl = new RemoteControl();

		Light livingRoomLight = new Light("Living Room");
		Light kitchenLight = new Light("Kitchen");
		CeilingFan ceilingFan = new CeilingFan("Living Room");
		GarageDoor garageDoor = new GarageDoor("");
		Stereo stereo = new Stereo("Living Room");

		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

		CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
		CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

		GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
		GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

		StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);

		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
		remoteControl.setCommand(3, stereoOnWithCD, stereoOff);

		System.out.println(remoteControl);

		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
	}
}
