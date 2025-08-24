package com.kt.beans;

import java.util.Date;

public class WishMessageGenerator2 {

	private Date date;
	public WishMessageGenerator2() {
		System.out.println("WishMessageGenerator2.0 param()");
	}
	
	public WishMessageGenerator2(Date date) {
		System.out.println("WishMessageGenerator2.oparam const");
		this.date = date;
	}

	public void setDate(Date date) {
		System.out.println("WishMessageGenerator2.setDate()");
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "WishMessageGenerator2 [date=" + date + "]";
	}

	public String wishMessage(String userName) {
		int hour=date.getHours();
		System.out.println("hour=>"+hour);
		if(hour<12)
			return "Good Morning "+userName;
		else
			return "Good Afternoon "+userName;
	}
}
