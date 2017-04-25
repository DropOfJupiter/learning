package com.qtt.test;

import com.qtt.designpatterns.proxy.dynamicproxy.cglib.CglibDynamicProxy;
import com.qtt.designpatterns.proxy.dynamicproxy.cglib.CglibDynamicRealSubject;
import com.qtt.designpatterns.proxy.dynamicproxy.jdk.JdkDynamicRealSubject;

/**
 * 测试使用Cglib实现的动态代理模式
 * 
 * @author Administrator
 */
public class TestCglibDynamicProxy {
	public static void main(String[] args) {
		CglibDynamicProxy cglib=new CglibDynamicProxy();
		//使用Cglib动态代理没有实现接口的委托类
		CglibDynamicRealSubject cglibDynamicRealSubject=(CglibDynamicRealSubject) 
				cglib.getProxyInstance(new CglibDynamicRealSubject());
		cglibDynamicRealSubject.doSomething("邱恬恬");
		//使用Cglib动态代理实现接口的委托类
		JdkDynamicRealSubject jdkDynamicRealSubject=(JdkDynamicRealSubject) 
				cglib.getProxyInstance(new JdkDynamicRealSubject());
		jdkDynamicRealSubject.doSomething("邱恬恬");
	}
}
