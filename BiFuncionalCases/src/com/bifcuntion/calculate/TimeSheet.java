package com.bifcuntion.calculate;

public class TimeSheet {
	private int co;
	private int days;
	public int getCo() {
		return co;
	}
	public void setCo(int co) {
		this.co = co;
	}
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	public TimeSheet(int co, int days) {
		this.co = co;
		this.days = days;
	}
	@Override
	public String toString() {
		return "TimeSheet [co=" + co + ", days=" + days + "]";
	}
	
	

}
