package com.qtt.test;

import java.util.HashSet;
import java.util.Set;

import com.qtt.designpatterns.singleton.LazySingleton;

public class TestSingleton {

	public static void main(String[] args) {
//		LazySingleton lazySingleton1 = LazySingleton.getInstance();
//		LazySingleton lazySingleton2 = LazySingleton.getInstance();
//		System.out.println(lazySingleton1 == lazySingleton2);
		SingletonThread t=new SingletonThread();		
		for(int i=0;i<5;i++){
			new Thread(t).start();
		}
		System.out.println(t.singles);
	}

}

class SingletonThread implements Runnable {
	//��ŵ�������ʹ��Set��Ϊ�˲�����ظ�Ԫ��  
    public Set<LazySingleton> singles = new HashSet<LazySingleton>();  
	public void run() {
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		singles.add(lazySingleton1);
	}
}
