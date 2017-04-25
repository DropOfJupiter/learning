package com.qtt.designpatterns.proxy.staticproxy;
/**
 * 静态代理类 角色2：委托类（真实主题类，实现Subject接口）
 * @author Administrator
 *
 */
public class RealSubject implements Subject {

	public void doSomething() {
		System.out.println("this is realSubject's method called doSomething");
	}

}
