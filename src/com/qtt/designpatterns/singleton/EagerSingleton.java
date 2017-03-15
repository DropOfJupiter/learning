package com.qtt.designpatterns.singleton;

/**
 * 饿汉单例模式 在类加载时，就创建实例，因此类加载速度慢，但运行时获取对象的速度快
 * 
 * @author Administrator
 *
 */
public class EagerSingleton {
	// 静态私有成员，已初始化
	private static EagerSingleton eagerSingleton = new EagerSingleton();

	private EagerSingleton() {
		// 私有构造方法,避免外部创建实例
	}

	// 静态，不用同步（类加载时已初始化，不会有多线程的问题）
	public static EagerSingleton getInstance() {
		return eagerSingleton;
	}

}
