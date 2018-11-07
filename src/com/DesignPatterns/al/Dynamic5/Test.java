package com.DesignPatterns.al.Dynamic5;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
public class Test {
	public static void main(String[] args) throws Exception {
		String rt="\r\n";
		String src=
				"package com.DesignPatterns.al.Dynamic5;"+rt+

				"public class TankTime implements Moveable {"+rt+
				"	Moveable t;"+rt+

				"	public TankTime(Moveable t) {"+rt+
				"		super();"+rt+
				"		this.t = t;"+rt+
				"	}"+rt+

				"	@Override"+rt+
				"	public void move() {"+rt+

				"		long startTime = System.currentTimeMillis();"+rt+
				"		System.out.println(\"tank��ʼ��ӡ��ʼʱ��\"+startTime);"+rt+
				"		t.move();"+rt+
				"		long endTime = System.currentTimeMillis();"+rt+
				"		System.out.println(\"tank�ܹ�����ʱ����\" + (endTime - startTime));"+rt+
				"	}"+rt+

				"}";
		//1,���ɴ�����
		String fileName = System.getProperty("user.dir");
		System.out.println("fileName����Ŀ�ĸ�·����"+fileName);
		String fileNameEnd=fileName+"/src/com/DesignPatterns/al/Dynamic5/TankTime.java";
		
		File f=new File(fileNameEnd);
		FileWriter fw=new FileWriter(f);
		fw.write(src);
		fw.flush();
		fw.close();
		
		//2,��ʼ����class�ļ�,���б���
		//2.1,��ȡjavaĬ�ϵı�������˵���˾���javac
		JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
		System.out.println("�����ҵı�������"+compiler.getClass().getName());
		StandardJavaFileManager fileMgr = compiler.getStandardFileManager(null, null, null);
		Iterable units = fileMgr.getJavaFileObjects(fileNameEnd);
		CompilationTask t = compiler.getTask(null, fileMgr, null, null, null, units);
		//2.2,����class�ļ����ﲻ���ص㣬����֪��ͨ������Ĵ���Ϳ��԰�java�������ɵ�ָ����Ŀ¼�����class�ļ�
		t.call();
		fileMgr.close();
		
		
		//3,��class�ļ����ص��ڴ���ȥ
		URL[] urls = new URL[] {new URL("file:/" + System.getProperty("user.dir") +"/src")};
		URLClassLoader ul = new URLClassLoader(urls);
		Class c = ul.loadClass("com.DesignPatterns.al.Dynamic5.TankTime");
		System.out.println("�����ҵ�class�ļ���"+c);
		
		//4,���ڴ������ɶ�����Ϊ���ʱ������û�����java�࣬����ֻ�д��ڴ����������ֵ��
		//���仰����˵����������û���������ֻ��ͨ�����䣨ͨ����������������ȡ�������
		//4.1,���ǵ��õ��ǹ��췽���Ĳ���ΪMoveable������Ĳ���������ʵ��Ҳ���Եģ����͵Ĺ��췽��
		Constructor ctr = c.getConstructor(Moveable.class);
		Moveable m = (Moveable)ctr.newInstance(new Tank());
		m.move();
		}
}
