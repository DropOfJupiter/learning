package com.qtt.thread;
//实现Runnable来创建线程
public class ThreadImplementsRunnable {
	public static void main(String[] args) {
		//static main方法是静态的,只有静态内部类能够被实例化
		MyThread myThread =new MyThread();
		for (int i = 1; i <=10; i++) {
			Thread thread = new Thread(myThread);  
			thread.start();  
		}

	}
	static class MyThread implements Runnable {
		private int ticket=100;//每个线程都拥有100张票
		public void run() {
			while(ticket>0){ 
			       System.out.println(ticket--+" is saled by "+Thread.currentThread().getName()); 
			} 
		}
	}

}

