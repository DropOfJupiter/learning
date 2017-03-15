package com.qtt.singleton;
/**
 * 懒汉单例模式
 * 比较懒，在类加载时，不创建实例，因此类加载速度快，但运行时获取对象的速度慢
 * 懒汉模式是延迟加载的实例，面对多线程访问时，需要进行同步代码块，为了增加效率，又要使用双重判断
 * @author Administrator
 *
 */
public class LazySingleton {
	private static LazySingleton lazySingleton= null;//静态私用成员，没有初始化

	private LazySingleton() {
		//私有构造方法,避免外部创建实例
	}

	public static LazySingleton getInstance() {
		if (lazySingleton == null) {
			synchronized(LazySingleton.class){
				if (lazySingleton == null) {
					lazySingleton = new LazySingleton();
				}
			}
		}
		return lazySingleton;
	}
}
