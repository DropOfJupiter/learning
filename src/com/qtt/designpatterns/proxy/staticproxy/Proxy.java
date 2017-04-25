package com.qtt.designpatterns.proxy.staticproxy;
/**
 * 静态代理类 角色3：代理类
 * @author Administrator
 *
 */
public class Proxy implements Subject {
	
	private RealSubject realSubject;//定义真实主题类
	
	public Proxy(RealSubject realSubject) {
		super();
		this.realSubject = realSubject;
	}

	public void doSomething() {
		System.out.println("proxy start to work");
		realSubject.doSomething();//内部引用真实主题类的方法
		System.out.println("proxy stop working");
	}

}
