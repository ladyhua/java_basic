package com.java.basic.model;

public class Date {
	private int year;
	private int month;
	private int day;
	
	public Date(int year,int month,int day) {
		this.year=year;
		this.month=month;
		this.day=day;
	}
	
	public int compare(Date d) {
		if(this.year > d.getYear()) {
			return 1;
		} else if (this.year < d.getYear()) {
			return -1;
		} else if (this.month > d.getMonth()) {
			return 1;
		} else if (this.month < d.getMonth()) {
			return -1;
		} else if (this.day > d.getDay()) {
			return 1;
		} else if (this.day < d.getDay()) {
			return -1;
		} else {
			return 0;
		}
	}
	
	@Override
	public String toString(){
		return year+" "+month+" "+day;
		
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	
}
