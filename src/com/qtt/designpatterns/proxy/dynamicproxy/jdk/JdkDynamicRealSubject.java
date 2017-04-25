package com.qtt.designpatterns.proxy.dynamicproxy.jdk;

/**
 * 用JDK实现的动态代理模式 角色2：委托类（真实主题类，实现JdkDynamicSubject接口）
 * 
 * @author Administrator
 *
 */
public class JdkDynamicRealSubject implements JdkDynamicSubject {

	public void doSomething(String name) {
		System.out.println("hello "+name+",this is realSubject's method called doSomething by JDK dynamic");
	}

}
