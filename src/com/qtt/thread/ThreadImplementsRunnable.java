package com.qtt.thread;
//ʵ��Runnable�������߳�
public class ThreadImplementsRunnable {
	public static void main(String[] args) {
		//static main�����Ǿ�̬��,ֻ�о�̬�ڲ����ܹ���ʵ����
		MyThread myThread =new MyThread();
		for (int i = 1; i <=10; i++) {
			Thread thread = new Thread(myThread);  
			thread.start();  
		}

	}
	static class MyThread implements Runnable {
		private int ticket=100;//ÿ���̶߳�ӵ��100��Ʊ
		public void run() {
			while(ticket>0){ 
			       System.out.println(ticket--+" is saled by "+Thread.currentThread().getName()); 
			} 
		}
	}

}

