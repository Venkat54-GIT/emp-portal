package com.kt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.kt.beans.WishMessageGenerator1;

public class SetterInjectionTest1 {

	public SetterInjectionTest1() {
System.out.println("SetterInjectionTest1.SetterInjectionTest1()");	}
	private static void main1(String one,int two) {
		FileSystemResource res=new FileSystemResource("src/com/kt/cfgs/AppicationContext1.xml");
		System.out.println("SetterInjectionTest1.maindummy");
		BeanFactory bf=new XmlBeanFactory(res);
		WishMessageGenerator1 wmg=bf.getBean("wmg",WishMessageGenerator1.class);
		String message=wmg.wishMessage("Developer");
		System.out.println(message);
	}
	public static void main(String[] args) {
		System.out.println("SetterInjectionTest1.main()");
		//main1("one",2);
		main1("one",2);
	}
	public static void main2(String one,int two) {
		FileSystemResource res=new FileSystemResource("src/com/kt/cfgs/ApplicationContext2.xml");
		XmlBeanFactory fac=new XmlBeanFactory(res);
		WishMessageGenerator1 wmg=fac.getBean("wmg",WishMessageGenerator1.class);
		System.out.println(wmg.wishMessage("rahul"));
	}
}
