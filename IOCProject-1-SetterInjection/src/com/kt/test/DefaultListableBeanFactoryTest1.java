package com.kt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.kt.beans.WishMessageGenerator1;

public class DefaultListableBeanFactoryTest1 {

	public static void main(String[] args) {
		DefaultListableBeanFactory fac=new DefaultListableBeanFactory();
		XmlBeanDefinitionReader red=new XmlBeanDefinitionReader(fac);
		red.loadBeanDefinitions("com/kt/cfgs/ApplicationContext2.xml");
		System.out.println(fac.getBean("wmg",WishMessageGenerator1.class).wishMessage("komal"));
	}
}
