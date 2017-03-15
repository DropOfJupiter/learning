package com.qtt.thread;
//继承Thread来创建线程
public class ThreadExtendsThread extends Thread {
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			//static main方法是静态的,只有静态内部类能够被实例化
			MyThread myThread =new MyThread();
			myThread.start();
		}
	}
	//静态内部类是静态
	static class MyThread extends Thread {
		private int ticket=100;//每个线程都拥有100张票
		public void run() {
			System.out.println("My name is "+Thread.currentThread().getName());
		}
	}

}

