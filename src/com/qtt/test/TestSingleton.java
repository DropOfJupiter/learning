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
	//存放单例对象，使用Set是为了不存放重复元素  
    public Set<LazySingleton> singles = new HashSet<LazySingleton>();  
	public void run() {
		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		singles.add(lazySingleton1);
	}
}
