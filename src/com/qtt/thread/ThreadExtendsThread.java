package com.qtt.thread;
//�̳�Thread�������߳�
public class ThreadExtendsThread extends Thread {
	public static void main(String[] args) {
		for (int i = 1; i <=10; i++) {
			//static main�����Ǿ�̬��,ֻ�о�̬�ڲ����ܹ���ʵ����
			MyThread myThread =new MyThread();
			myThread.start();
		}
	}
	//��̬�ڲ����Ǿ�̬
	static class MyThread extends Thread {
		private int ticket=100;//ÿ���̶߳�ӵ��100��Ʊ
		public void run() {
			System.out.println("My name is "+Thread.currentThread().getName());
		}
	}

}

