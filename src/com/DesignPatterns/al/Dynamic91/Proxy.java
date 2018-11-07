package com.DesignPatterns.al.Dynamic91;

import java.io.File;
import java.io.FileWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.JavaCompiler.CompilationTask;
import javax.tools.StandardJavaFileManager;
import javax.tools.ToolProvider;
/**
 * jdk�е�������$Proxy1�����԰������TankTime�滻������ʵ����һ���������岻�󣬶�һ��
 * @author qingruihappy
 * @data   2018��11��2�� ����1:24:30
 * @˵��:
 */
public class Proxy {
public static Object newProxyInstance(Class inferance,InvocationHandler h) throws Exception {
	String methodStr = "";
	Method[] methods = inferance.getMethods();
	String rt="\r\n";
	
	for(Method m : methods) {
		methodStr += "@Override" + rt + 
					 "public void " + m.getName() + "() {" + rt +
					 "    try {" + rt +
					 "    Method md = " + inferance.getName() + ".class.getMethod(\"" + m.getName() + "\");" + rt +
					 "    h.invoke(this, md);" + rt +
					 "    }catch(Exception e) {e.printStackTrace();}" + rt +
					
					 "}";
	}
	String src=
			"package com.DesignPatterns.al.Dynamic91;"+rt+
            "import java.lang.reflect.Method;" + rt +
			"public class TankTime implements "+inferance.getName()+ "{"+rt+

			"	public TankTime(InvocationHandler h) {"+rt+
			"		super();"+rt+
			"		this.h = h;"+rt+
			"	}"+rt+
            "    com.DesignPatterns.al.Dynamic91.InvocationHandler h;" + rt +
			methodStr +rt+

			"}";
	//1,���ɴ�����
	String fileName = System.getProperty("user.dir");
	System.out.println("fileName����Ŀ�ĸ�·����"+fileName);
	String fileNameEnd=fileName+"/src/com/DesignPatterns/al/Dynamic91/TankTime.java";
	
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
	Class c = ul.loadClass("com.DesignPatterns.al.Dynamic91.TankTime");
	System.out.println("�����ҵ�class�ļ���"+c);
	
	//4,���ڴ������ɶ���
	//4.1,���ǵ��õ��ǹ��췽���Ĳ���ΪMoveable������Ĳ���������ʵ��Ҳ���Եģ����͵Ĺ��췽��
	Constructor ctr = c.getConstructor(InvocationHandler.class);
	Object o = ctr.newInstance(h);
	return o;
	
}
}
