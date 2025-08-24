package com.kt.ExtraCls;

import java.lang.reflect.Method;

import com.kt.test.SetterInjectionTest1;

public class GetByName {

	public static void main1(String[] args) {
		try {
			Class<?> obj=Class.forName("com.kt.test.SetterInjectionTest1");
			SetterInjectionTest1 wmg=(SetterInjectionTest1) obj.newInstance();
			//wmg.main();
			Method method = obj.getDeclaredMethod("main1",String.class,int.class);
			method.setAccessible(true);
			method.invoke(null, "one",1);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
