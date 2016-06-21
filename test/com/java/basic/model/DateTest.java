package com.java.basic.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {

	@Test
	public void testDateSort() {
		Date[] dates = {new Date(2001,1,2),new Date(2001,1,3),new Date(2002,3,23),new Date(2003,4,28),new Date(2002,3,22)};
		for(int i=0;i<dates.length-1;i++) {
			for(int j=i+1;j<dates.length;j++){
				if(dates[i].compare(dates[j])>0) {
					Date temp = dates[i];
					dates[i] = dates[j];
					dates[j] = temp;
				}
			}
		}
		for(int i=0;i<dates.length;i++){
			System.out.println(dates[i]);
		}
		
	}

}
