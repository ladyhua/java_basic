package com.java.basic.model;

public class MyThread extends Thread {
	int count= 1, number;
	public MyThread(int num){ 
		number = num;
		System.out.println("创建线程 " + number);
	}
	public void run() { 
		while(true) {
			System.out.println("线程 " + number + ":计数 " + count);
			if(++count== 6) return;
		}
	}
	public static void main(String args[]){ 
		for(int i=0;i<5; i++) new MyThread(i+1).start();
	}
}

