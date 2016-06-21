package com.java.basic.model;

import org.junit.Test;

public class PointTest {
	@Test
	public void pointTest() {
		Point p1 = new Point(1,1,1);
		Point p2=p1;
		change1(p1);
		System.out.println(p1.getX()+" "+p1.getY()+" "+p1.getZ());
		change2(p1);
		System.out.println(p1.getX()+" "+p1.getY()+" "+p1.getZ());
		int i = 1;
		change3(i);
		System.out.println(i);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
	}

	private void change3(int i) {
		// TODO Auto-generated method stub
		i = 2;
	}

	private void change2(Point p1) {
		// TODO Auto-generated method stub
		p1.setX(3);
		p1.setY(3);
		p1.setZ(3);
	}

	private void change1(Point p1) {
		// TODO Auto-generated method stub
		p1 = new Point(3,3,3);
	}
}
