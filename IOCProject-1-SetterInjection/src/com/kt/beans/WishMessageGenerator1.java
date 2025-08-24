package com.kt.beans;

import java.util.Date;

public class WishMessageGenerator1 {

	private Date date;
	private WishMessageGenerator2 wmg2;
	public WishMessageGenerator1() {
		System.out.println("WishMessageGenerator1.0 param()");
	}
	
	public void setWmg2(WishMessageGenerator2 wmg2) {
		this.wmg2 = wmg2;
	}

	public WishMessageGenerator1(Date date,WishMessageGenerator2 wmg2) {
		System.out.println("WishMessageGenerator1.oparam const");
		this.date = date;
		this.wmg2=wmg2;
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator1.setDate()");
		this.date = date;
	}
	
	public String wishMessage(String userName) {
		int hour=date.getHours();
		System.out.println(wmg2);
		System.out.println("hour=>"+hour);
		if(hour<12)
			return "Good Morning "+userName;
		else
			return "Good Afternoon "+userName;
	}
}
