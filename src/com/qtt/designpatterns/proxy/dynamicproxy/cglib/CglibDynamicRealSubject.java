package com.qtt.designpatterns.proxy.dynamicproxy.cglib;

/**
 * 用cglib实现的动态代理模式 角色1：委托类（没有实现人任何接口）
 * 
 * @author Administrator
 *
 */
public class CglibDynamicRealSubject{

	public void doSomething(String name) {
		System.out.println("hello "+name+","
				+ "this is realSubject's method called doSomething by Cglib dynamic");
	}

}
