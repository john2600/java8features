package com.bifcuntion.calculate;

public class Employee {
	private int account;
	private String name;
	private double dailyWage;

	public Employee(int account, String name, double dailyWage) {
		this.account = account;
		this.name = name;
		this.dailyWage = dailyWage;
	}

	public int getAccount() {
		return account;
	}

	public void setAccount(int account) {
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getDailyWage() {
		return dailyWage;
	}

	public void setDailyWage(double dailyWage) {
		this.dailyWage = dailyWage;
	}

	@Override
	public String toString() {
		return "Employee [account=" + account + ", name=" + name + ", dailyWage=" + dailyWage + "]";
	}

}
